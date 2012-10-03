package org.gwt.leaflet.client.layers.vector;

import org.gwt.leaflet.client.Options;
import org.gwt.leaflet.client.jswraps.JSObject;
import org.gwt.leaflet.client.map.Map;
import org.gwt.leaflet.client.types.LatLng;

/**
 * A class for drawing circle overlays on a map. Extends Path. Use Map#addLayer
 * to add it to the map.
 * 
 * @author Lionel Leiva-Marcon
 * 
 */
public class Circle extends Path {

	public Circle(LatLng latlng, double radius, Options options) {
		super(CircleImpl.create(latlng.getJSObject(), radius,
				options.getJSObject()));
	}

	@Override
	public void addTo(Map map) {
		CircleImpl.addTo(getJSObject(), map.getJSObject());
	}

	public JSObject getLatLng() {
		return CircleImpl.getLatLng(getJSObject());
	}

	public double getRadius() {
		return CircleImpl.getRadius(getJSObject());
	}

	public void setLatLng(LatLng latlng) {
		CircleImpl.setLatLng(getJSObject(), latlng.getJSObject());
	}

	public void setRadius(double radius) {
		CircleImpl.setRadius(getJSObject(), radius);
	}

	@Override
	public void bindPopup(String htmlContent, Options options) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void openPopup(LatLng latlng) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setStyle(Options object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void bringToFront() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void bringToBack() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void redraw() {
		// TODO Auto-generated method stub
		
	}

}
