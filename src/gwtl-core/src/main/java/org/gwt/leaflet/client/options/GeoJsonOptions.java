package org.gwt.leaflet.client.options;

import org.gwt.leaflet.client.jswraps.JSObject;
import org.gwt.leaflet.client.options.features.GeoJsonFeatures;

/**
 * GeoJsonOptions class
 * 
 * @author Lionel Leiva-Marcon
 * 
 */
public class GeoJsonOptions extends Options {

	protected GeoJsonFeatures _features;
	
	public GeoJsonOptions(GeoJsonFeatures features) {
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
