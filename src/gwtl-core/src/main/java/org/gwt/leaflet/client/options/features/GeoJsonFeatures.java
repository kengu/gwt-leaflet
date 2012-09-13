package org.gwt.leaflet.client.options.features;

import org.gwt.leaflet.client.jswraps.JSObject;

/**
 * GeoJsonFeatures
 * This class allow to override the following functions used by the GeoJsonOptions :
 * <ul>
 * <li>pointToLayer
 * <li>onEachFeature
 * <li>style
 * <li>filter
 * </ul>
 *  
 * @author Lionel Leiva-Marcon
 * 
 */
public abstract class GeoJsonFeatures{

	public GeoJsonFeatures() {
		super();
	}
	/**
	 * Function that will be used for creating layers for GeoJSON points 
	 * (if not specified, simple markers will be created).
	 * @param feature
	 * @param latlng
	 * @return
	 */
	public abstract JSObject pointToLayer(JSObject feature, JSObject latlng);
	/**
	 * Function that will be called on each created feature layer. 
	 * Useful for attaching events and popups to features.
	 * @param feature
	 * @param layer
	 * @return
	 */
	public abstract JSObject onEachFeature(JSObject feature, JSObject layer);
	/**
	 * Function that will be used to get style options for vector layers created for GeoJSON features.
	 * @param feature
	 * @return
	 */
	public abstract JSObject style(JSObject feature);
	/**
	 * Function that will be used to decide whether to show a feature or not.
	 * @param feature
	 * @param layer
	 * @return
	 */
	public abstract boolean filter(JSObject feature,JSObject layer);
}
