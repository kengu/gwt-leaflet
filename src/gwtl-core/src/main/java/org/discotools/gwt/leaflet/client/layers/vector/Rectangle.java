package org.discotools.gwt.leaflet.client.layers.vector;

import org.discotools.gwt.leaflet.client.Options;
import org.discotools.gwt.leaflet.client.map.Map;
import org.discotools.gwt.leaflet.client.types.LatLng;
import org.discotools.gwt.leaflet.client.types.LatLngBounds;

/**
 * A class for drawing rectangle overlays on a map. 
 * Extends Polygon. 
 * Use Map#addLayer to add it to the map.
 * 
 * @author Lionel Leiva-Marcon
 *
 */
public class Rectangle extends Polygon {
  
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

	/**
	 * Redraws the rectangle with the passed bounds.
	 * @param bounds
	 */
	public Rectangle setBounds(LatLngBounds bounds) {
		RectangleImpl.setBounds(getJSObject(), bounds.getJSObject());
		return this;
	}
	
	@Override
	public Rectangle addTo(Map map) {
		return (Rectangle)super.addTo(map);
	}

	@Override
	public Rectangle bindPopup(String htmlContent, Options options) {
		return (Rectangle)super.bindPopup(htmlContent, options);
	}

	@Override
	public Rectangle openPopup(LatLng latlng) {
		return (Rectangle)super.openPopup(latlng);
	}

	@Override
	public Rectangle setStyle(Options options) {
		return (Rectangle)super.setStyle(options);
	}

	@Override
	public Rectangle bringToFront() {
		return (Rectangle)super.bringToFront();
	}

	@Override
	public Rectangle bringToBack() {
		return (Rectangle)super.bringToBack();
	}

	@Override
	public Rectangle redraw() {
		return (Rectangle)super.redraw();
	}		

}
