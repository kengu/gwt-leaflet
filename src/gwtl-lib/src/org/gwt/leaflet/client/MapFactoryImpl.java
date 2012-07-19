package org.gwt.leaflet.client;

import org.gwt.leaflet.api.MapException;
import org.gwt.leaflet.api.MapFactory;
import org.gwt.leaflet.api.Options;

import com.google.gwt.core.client.JavaScriptObject;

public class MapFactoryImpl implements MapFactory {

	/**
	 * MapFactory overlay type constructor. 
	 */
	protected MapFactoryImpl() { }
	
	@Override
	public final MapImpl newMap(String name, Options options) throws MapException {
		return newMap(name, get(options));
	}
		
	private static final native MapImpl newMap(String name, JavaScriptObject options) /*-{
		
		// Initialize maps array?
		if($wnd.maps==undefined) $wnd.maps = [];
		
		var _name = name;

		// Initialize the map on the "name" div with a given center and zoom
		var map = new $wnd.L.Map(_name, options);
		
		// Set name
		map.name = _name;

		// Cache map instance
		$wnd.maps.name = map;	
		
		// Finished
		return map; 
		
  	}-*/;

	@Override
	public TileLayerImpl newTileLayer(String url, Options options) throws MapException {				
		return newTileLayer(url,get(options));
	}
	
	
	private static final native TileLayerImpl newTileLayer(String url, JavaScriptObject options) /*-{
	
		// Create tile layer
		return new $wnd.L.TileLayer(url, options);
	
	}-*/;
	
	private static final String required(String key, Options options) throws MapException {
		return get(key, options, true, true);
	}
	
	private static final String get(String key, Options options, boolean required, boolean remove) throws MapException {
		// Get or remove parameter?
		String value = remove ? options.remove(key) : options.get(key);
		// Sanity check
		if(required && (value==null || value.isEmpty()))
			throw new MapException("Parameter ["+key+"] is missing");
		// Finished
		return value;
	}
	
	public static final JavaScriptObject get(Options options) {
		return options.toJSON("$wnd").getJavaScriptObject();
	}

	@Override
	public final native LatLngImpl newLatLng(double lat, double lon) throws MapException /*-{
	
		// Create object
		return new $wnd.L.LatLng(lat, lon);
	
	}-*/;

	
}
