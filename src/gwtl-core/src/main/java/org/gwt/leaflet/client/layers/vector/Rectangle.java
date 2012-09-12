package org.gwt.leaflet.client.layers.vector;

import org.gwt.leaflet.client.jswraps.JSObjectArray;
import org.gwt.leaflet.client.map.Map;
import org.gwt.leaflet.client.options.Options;
import org.gwt.leaflet.client.types.LatLng;
import org.gwt.leaflet.client.types.LatLngBounds;

/**
 * A class for drawing rectangle overlays on a map. 
 * Extends Polygon. 
 * Use Map#addLayer to add it to the map.
 * 
 * @author Lionel Leiva-Marcon
 *
 */
public class Rectangle extends Polygon{
  
	/**
	 * Default constructor
	 * Instantiates a rectangle object with the given geographical bounds 
	 * and optionally an options object.
	 * @param latlngs
	 * @param options
	 */
	public Rectangle(LatLngBounds bounds, Options options) {
 		super(RectangleImpl.create(bounds.getJSObject(), options.getJSObject()));
	} 
//
//	@Override
//	public void addTo(Map map) {
//		RectangleImpl.addTo(getJSObject(), map.getJSObject());		
//	}

	/**
	 * Redraws the rectangle with the passed bounds.
	 * @param bounds
	 */
	public void setBounds(LatLngBounds bounds) {
		RectangleImpl.setBounds(getJSObject(), bounds.getJSObject());		
	}

}
