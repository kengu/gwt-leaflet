package org.gwt.leaflet.client;

import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.json.client.JSONArray;
import com.google.gwt.json.client.JSONBoolean;
import com.google.gwt.json.client.JSONNull;
import com.google.gwt.json.client.JSONNumber;
import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONString;
import com.google.gwt.json.client.JSONValue;

@SuppressWarnings("serial")
public class Options implements Map<String, Object>, Serializable, Cloneable {

	private Boolean immutable = false;
	private Map<String, Object> map = new HashMap<String, Object>();
	private Map<String, Boolean> required = new HashMap<String, Boolean>();
	
	public final static Options EMPTY = new Options(true);

	public Options() {
		this(false);
	}

	public Options(boolean immutable) {
		fill();
		if(immutable) freeze();
	}
	
	public Options(Options map) {
		this(map,false);
	}
	
	public Options(Options options, boolean immutable) {
		this.map = new HashMap<String, Object>(options.map);
		this.required = new HashMap<String, Boolean>(options.required);
		if(immutable) freeze();
	}
	
	private void freeze() {
		this.immutable = true;
		this.map = Collections.unmodifiableMap(this.map);
		this.required = Collections.unmodifiableMap(this.required);
	}
	
	/**
	 * This method is called by the default constructor. 
	 * It allows for the following pattern to be implemented,
	 * which creates a immutable singleton collection of options
	 * <pre>
	 * final static Options DEFAULT = new Options(true){
	 * 	void fill() {
	 * 		put(COLLAPSED,true);
	 * 	}
	 * };
	 * </pre>
	 */
	protected void fill() { /*NOP*/ }
	
	/**
	 * Convert this to {@link JSONObject}
	 * @return {@link JSONObject}
	 */
	public JSONObject toJSON() {
		return toJSON("");
	}
	
	/**
	 * <b>Convert this to {@link JSONObject}</b>.
	 * <p>
	 * This method adds given prefix to option keys.
	 * <p>
	 * @param prefix Option key prefix
	 * 
	 * @return {@link JSONObject}
	 */
	public JSONObject toJSON(String prefix) {
		JSONObject json = new JSONObject();
		for(Entry<String, Object> e : entrySet()) {
			json.put(prefix+e.getKey(), toJSON(e.getValue()));
		}
		return json;
	}
	
	/**
	 * Check if given value can be converted into a {@link JSONValue} instance.
	 * @param value - Object
	 * @return true
	 */
	public static final boolean supports(Object value) {
		return (value == null 
			 || value instanceof Options
			 || value instanceof Number
			 || value instanceof String 
			 || value instanceof Character
			 || value instanceof Boolean
			 || value instanceof Literal
			 || value instanceof JSONValue
			 || value instanceof JavaScriptObject
			 || value instanceof Object[]);
	}

	/**
	 * Get given value as {@link JSONValue} instance
	 * @param value - Object
	 * @return {@link JSONValue}
	 */
	public static final JavaScriptObject toJSO(Object value) {
		// Convert to value
		JSONValue v = toJSON(value);
		// Is JSONObject?
		if (v instanceof JSONObject) {
			return ((JSONObject)v).getJavaScriptObject();
		}
		// Convert to JSONObject
		JSONObject o = new JSONObject();
		o.put("object", v);
		return o.getJavaScriptObject();
	}
	
	/**
	 * Get given value as {@link JSONValue} instance
	 * @param value - Object
	 * @return {@link JSONValue}
	 */
	public static final JSONValue toJSON(Object value) {
		
		if(value instanceof Options) 
			return ((Options)value).toJSON();
		else if(value instanceof Number) 
			return new JSONNumber(Double.valueOf(String.valueOf(value)));
		else if(value instanceof Boolean)
			return JSONBoolean.getInstance((Boolean)value);
		else if(value instanceof String 
			 || value instanceof Character) 
			return new JSONString(String.valueOf(value));
		else if(value instanceof Literal) 
			return new JSONString(((Literal)value).getLiteral());
		else if(value instanceof JavaScriptObject) 
			return new JSONObject((JavaScriptObject)value);
		else if(value instanceof JSONValue)
			return (JSONValue)value;
		else if(value == null) 
			return JSONNull.getInstance();
		else if(value instanceof Object[]) {
			int i = 0;
			JSONArray array = new JSONArray();
			for(Object it : (Object[])value) {
				array.set(i++, toJSON(it));
			}
			return array;
		} 
		// Unsupported, notify
		throw new IllegalArgumentException("Option value [" + value + "] not supported");
	}
	
	/**
	 * Clone this {@link Options} instance.
	 * @return {@link Options} 
	 */
	public Options clone() {
		return new Options(this,immutable);
	}

	/**
	 * Clone this {@link Options} instance.
	 * @param immutable If <code>true</code>, returned instance is immutable 
	 * @return {@link Options} 
	 */
	public Options clone(boolean immutable) {
		return new Options(this,immutable);
	}
	
	/**
	 * Merge this {@link Options} instance with given.
	 * @return {@link Options} 
	 */
	public Options merge(Options options) {
		options = new Options(this,false).putAll(options);
		return merge(options,immutable);
	}

	/**
	 * Merge this {@link Options} instance with given.
	 * @param immutable If <code>true</code>, returned instance is immutable 
	 * @return {@link Options} 
	 */
	public Options merge(Options options, boolean immutable) {
		options = new Options(this,false).putAll(options);
		return (immutable ? options.immuable() : options);
	}
	

	/**
	 * Check if this is mutable
	 * @return boolean
	 */
	public boolean isImmutable() {
		return this.immutable;
	}

	/**
	 * Get immutable options copy
	 * @return {@link Options}
	 */
	public Options immuable() {
		return new Options(this,true);
	}
	
	@Override
	public void clear() {
		this.map.clear();
		this.required.clear();
	}

	@Override
	public boolean containsKey(Object key) {
		return this.map.containsKey(key);
	}

	@Override
	public boolean containsValue(Object value) {
		return this.map.containsValue(value);
	}

	@Override
	public Set<Entry<String, Object>> entrySet() {
		return this.map.entrySet();
	}

	@Override
	public boolean equals(Object o) {
		boolean result = false;
	    if (o instanceof Options) {
	    	Options options = (Options) o;
	    	return (this.immutable == options.immutable)
	    		  && this.map.equals(options.map)
	    		  && this.required.equals(options.required);
	    }
	    return result;		
	}
	
	@Override
	public int hashCode() {
		int hash = 1;
        hash = hash * 17 + this.map.hashCode();
        hash = hash * 31 + this.required.hashCode();
        hash = hash * 13 + this.immutable.hashCode();
        return hash;		
	}
	

	@Override
	public Object get(Object key) {
		return this.map.get(key);
	}

	@Override
	public boolean isEmpty() {
		return this.map.isEmpty();
	}

	@Override
	public Set<String> keySet() {
		return this.map.keySet();
	}
	
	public Set<String> requiredSet() {
		Set<String> keys = new HashSet<String>(required.size());
		for(Entry<String,Boolean> e : required.entrySet()) {
			if(e.getValue()) keys.add(e.getKey());
		}
		return keys;
	}
	
	public boolean isRequired(String key) {
		return this.required.get(key);
	}

	@Override
	public Object put(String key, Object value) {
		return put(key,value,false);
	}
	
	public Object put(String key, Object value, boolean required) {		
		this.required.put(key, required);
		return this.map.put(key, value);
	}	

	@Override
	public void putAll(Map<? extends String, ? extends Object> m) {
		throw new UnsupportedOperationException("Not supported, use \"putAll(Options);\" instead");
	}
	
	public Options putAll(Options options)  {
		this.map.putAll(options.map);
		this.required.putAll(options.required);
		return this;
	}	

	@Override
	public Object remove(Object key) {
		this.required.remove(key);
		return this.map.remove(key);
	}

	@Override
	public int size() {
		return this.map.size();
	}

	@Override
	public Collection<Object> values() {
		return this.map.values();
	}

	@Override
	public String toString() {
		String s = "OPTIONS: " + map.toString() + "\n";
		   s = s + "REQUIRED: " + map.toString() + "\n";
		   s = s + "IMMUTABLE: " + immutable + "\n";		   
		return s;
	}
	
	// --------------------------------------------------------
	// Helper methods
	// --------------------------------------------------------	

	public static final String assertOption(Options options, String key, Object value) {
		// Cast to string
		String s = (value != null ? String.valueOf(value): null);		
		// Sanity check
		if(options.isRequired(key) && (s==null || s.isEmpty())) {
			// Option missing?
			String reason = (options.containsKey(key) ? "no option found" : "no value set");
			// Raise exception
			throw new LeafletException("Option ["+key+"] is required: " + reason);				
		}
		// Option is valid
		return s;
	}

	public static final Set<String> assertOptions(Options options) {
		Set<String> remove = new HashSet<String>(options.size());
		for(Entry<String,Object> e : options.entrySet()) {
			// Get key and value
			String key = e.getKey();
			Object object = e.getValue();
			// Sanity check
			String value = assertOption(options, key, object);
			// Add to keys? (applies on to only mutable options)
			if(!options.isImmutable() && (value==null || value.isEmpty())) remove.add(key);
		}		
		// Finished
		return remove;
	}

	/**
	 * Convert {@link Options} into {@link JavaScriptObject}
	 * 
	 * @param options {@link Options} to assert 
	 * @param required Required {@link Options}
	 * @return {@link JavaScriptObject}
	 */
	public static final JavaScriptObject toJSO(Options options, Options required) {
		// Make mutable clone
		required = required.clone(false);
		// Overwrite default values
		required.putAll(options);
		// Collection options with empty values
		Set<String> keys = new HashSet<String>(options.size());
		// Sanity check
		Options.assertOptions(required);
		// Remove empty non-required options (default values will be used by the Leaflet instead)
		if(!keys.isEmpty()) required.keySet().removeAll(keys);
		// Finished
		return options.toJSON().getJavaScriptObject();
	}
	
	
	
}
