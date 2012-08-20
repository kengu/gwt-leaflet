package org.gwt.leaflet.api;

import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.json.client.JSONNumber;
import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONString;
import com.google.gwt.json.client.JSONValue;

@SuppressWarnings("serial")
public class Options implements Map<String, Object>, Serializable, Cloneable {

	private Boolean immutable = false;
	private Map<String, Object> map = new HashMap<String, Object>();
	private Map<String, Boolean> required = new HashMap<String, Boolean>();

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
	void fill() { /*NOP*/ }
	
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
			json.put(prefix+e.getKey(), newJSO(e.getValue()));
		}
		return json;
	}
	
	private static final JSONValue newJSO(Object value) {
		
		if(value instanceof Number) 
			return new JSONNumber(Double.valueOf(String.valueOf(value)));
		else if(value instanceof String) 
			return new JSONString(String.valueOf(value));
		else if(value instanceof JavaScriptObject) 
			return new JSONObject((JavaScriptObject)value);
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
	
	

	
	
	
	
	
}
