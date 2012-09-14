package org.gwt.leaflet.client.layers.others;

import org.gwt.leaflet.client.jswraps.JSObject;
import org.gwt.leaflet.client.layers.vector.Path;
import org.gwt.leaflet.client.map.Map;
import org.gwt.leaflet.client.options.GeoJsonOptions;

/**
 * Represents a GeoJSON layer. Allows you to parse GeoJSON data and 
 * display it on the map. 
 * Extends FeatureGroup.
 * 
 * @author Lionel Leiva-Marcon
 * 
 * @see <a href="http://leaflet.cloudmade.com/reference.html#geojson">L.GeoJSON (Leaflet API)</a>
 *
 */
public class GeoJSON extends FeatureGroup {

	protected GeoJSON(JSObject element) {
		super(element);
	} 

	public GeoJSON(String data, GeoJsonOptions options) {
		this (GeoJSONImpl.create(data, options));
	}


	/**
	 * Adds the group of layers to the map.
	 * @param map
	 */
	public void addData(String data) {
		GeoJSONImpl.addData(getJSObject(), data);		
	}
	
	/**
	 * Adds the group of layers to the map.
	 * @param map
	 */
	public void addTo(Map map) {
		GeoJSONImpl.addTo(getJSObject(), map.getJSObject());		
	}
	
	/**
	 * Resets the the given vector layer's style to the original GeoJSON style, 
	 * useful for resetting style after hover events.
	 * @param map
	 */
	public void resetStyle(Path layer) {
		GeoJSONImpl.resetStyle(getJSObject(), layer.getJSObject());		
	}


}
