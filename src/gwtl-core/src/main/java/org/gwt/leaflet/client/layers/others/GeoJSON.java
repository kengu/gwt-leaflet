package org.gwt.leaflet.client.layers.others;

import org.gwt.leaflet.client.Options;
import org.gwt.leaflet.client.jsobject.JSObject;
import org.gwt.leaflet.client.layers.ILayer;
import org.gwt.leaflet.client.layers.vector.Path;
import org.gwt.leaflet.client.map.Map;

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

	public GeoJSON(String data, GeoJSONOptions options) {
		this (GeoJSONImpl.create(data, options));
	}

	public GeoJSON(String alias, String data, GeoJSONOptions options) {
		this (GeoJSONImpl.create(data, options));
		setAlias(alias);
	}

	/**
	 * Adds the group of layers to the map.
	 * @param data
	 * @return {@link GeoJSON}
	 * 
	 */
	public GeoJSON addData(String data) {
		GeoJSONImpl.addData(getJSObject(), data);		
		return this;
	}

	
	/**
	 * Adds the group of layers to the map.
	 * @param map
	 * @return {@link GeoJSON}
	 */
	public GeoJSON addTo(Map map) {
		GeoJSONImpl.addTo(getJSObject(), map.getJSObject());		
		return this;
	}

	
	/**
	 * Resets the the given vector layer's style to the original GeoJSON style, 
	 * useful for resetting style after hover events.
	 * @param map
	 * @return {@link GeoJSON}
	 */
	public GeoJSON resetStyle(Path layer) {
		GeoJSONImpl.resetStyle(getJSObject(), layer.getJSObject());		
		return this;
	}


	@Override
	public GeoJSON addLayer(ILayer layer) {
		return (GeoJSON)super.addLayer(layer);
	}

	@Override
	public GeoJSON bindPopup(String htmlContent, Options options) {
		return (GeoJSON)super.bindPopup(htmlContent, options);
	}

	@Override
	public GeoJSON setStyle(Options options) {
		return (GeoJSON)super.setStyle(options);
	}

	@Override
	public GeoJSON bringToFront() {
		return (GeoJSON)super.bringToFront();
	}

	@Override
	public GeoJSON bringToBack() {
		return (GeoJSON)super.bringToBack();
	}

	@Override
	public GeoJSON setAlias(String alias) {
		return (GeoJSON)super.setAlias(alias);
	}

	/**
	 * Modify options in one operation.
	 * @param options {@link Options} instance.
	 * @return {@link GeoJSON}
	 */
	public GeoJSON setOptions(Options options) {
		return (GeoJSON)super.setOptions(options);
	}
	

}
