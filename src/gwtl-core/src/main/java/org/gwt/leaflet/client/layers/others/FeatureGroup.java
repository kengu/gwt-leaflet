package org.gwt.leaflet.client.layers.others;

import org.gwt.leaflet.client.jswraps.JSObject;
import org.gwt.leaflet.client.jswraps.JSObjectArray;
import org.gwt.leaflet.client.layers.ILayer;
import org.gwt.leaflet.client.map.Map;
import org.gwt.leaflet.client.options.Options;
import org.gwt.leaflet.client.types.LatLngBounds;

/**
 * Extended LayerGroup that also has mouse events (propagated 
 * from members of the group) and a shared bindPopup method. 
 * Implements ILayer interface.
 * 
 * @author Lionel Leiva-Marcon
 * 
 * @see <a href="http://leaflet.cloudmade.com/reference.html#featuregroup">L.FeatureGroup (Leaflet API)</a>
 *
 */
public class FeatureGroup extends LayerGroup {

	protected FeatureGroup(JSObject element) {
		super(element);
	}

	public FeatureGroup(ILayer[] layers) {
		this (FeatureGroupImpl.create(new JSObjectArray(layers).getJSObject()));
	}

	/**
	 * Adds a given layer to the group.
	 * @param layer
	 */
	public void addLayer(ILayer layer) {
		FeatureGroupImpl.addTo(getJSObject(), layer.getJSObject());		
	}

	/**
	 * Adds the group of layers to the map.
	 * @param map
	 */
	public void addTo(Map map) {
		FeatureGroupImpl.addTo(getJSObject(), map.getJSObject());		
	}

	/**
	 * Binds a popup with a particular HTML content to a click on any layer
	 * from the group that has a bindPopup method.
	 * @param htmlContent
	 * @param options
	 */
	public void bindPopup(String htmlContent, Options options) {
		FeatureGroupImpl.addPopup(getJSObject(), htmlContent, options.getJSObject());	
	}
	
	/**
	 * Returns the LatLngBounds of the Feature Group (created from bounds 
	 * and coordinates of its children).
	 * @return
	 */
	public LatLngBounds getBounds() {
		return new LatLngBounds(FeatureGroupImpl.getBounds(getJSObject()));	
	}
	
	/**
	 * Sets the given path options to each layer of 
	 * the group that has a setStyle method.
	 * @param options
	 */
	public void setStyle(Options options) {
		FeatureGroupImpl.setStyle(getJSObject(),options.getJSObject());		
	}
	
	/**
	 * Brings the layer group to the top of all other layers.
	 */
	public void bringToFront() {
		FeatureGroupImpl.bringToFront(getJSObject());		
	}

	/**
	 * Brings the layer group to the bottom of all other layers.
	 */
	public void bringToBack() {
		FeatureGroupImpl.bringToBack(getJSObject());		
	}

	
}
