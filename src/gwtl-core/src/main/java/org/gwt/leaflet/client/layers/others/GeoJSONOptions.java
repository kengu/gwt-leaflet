package org.gwt.leaflet.client.layers.others;

import org.gwt.leaflet.client.Options;
import org.gwt.leaflet.client.jsobject.JSObject;

/**
 * GeoJsonOptions class
 * 
 * @author Lionel Leiva-Marcon
 * 
 */
public class GeoJSONOptions extends Options {

	protected GeoJSONFeatures _features;
	
	public GeoJSONOptions(GeoJSONFeatures features) {
		super();
		_features = features;
	}

	public  JSObject pointToLayer(JSObject feature, JSObject latlng) {
		return _features.pointToLayer(feature, latlng);
	}

	public  JSObject onEachFeature(JSObject feature, JSObject layer) {
		return _features.onEachFeature(feature, layer);
	}
	
	public  JSObject style(JSObject feature) {
		return _features.style(feature);
	}
	
	public  boolean filter(JSObject feature, JSObject layer) {
		return _features.filter(feature, layer);
	}
	
}
