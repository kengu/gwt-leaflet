package org.gwt.leaflet.client.layers.vector;

import org.gwt.leaflet.client.Options;
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

	public LatLng getLatLng() {
		return new LatLng(CircleImpl.getLatLng(getJSObject()));
	}

	public Circle setLatLng(LatLng latlng) {
		CircleImpl.setLatLng(getJSObject(), latlng.getJSObject());
		return this;
	}

	public double getRadius() {
		return CircleImpl.getRadius(getJSObject());
	}

	public Circle setRadius(double radius) {
		CircleImpl.setRadius(getJSObject(), radius);
		return this;
	}
	
	@Override
	public Circle addTo(Map map) {
		return (Circle)super.addTo(map);
	}

	@Override
	public Circle bindPopup(String htmlContent, Options options) {
		return (Circle)super.bindPopup(htmlContent, options);
	}

	@Override
	public Circle openPopup(LatLng latlng) {
		return (Circle)super.openPopup(latlng);
	}

	@Override
	public Circle setStyle(Options options) {
		return (Circle)super.setStyle(options);
	}

	@Override
	public Circle bringToFront() {
		return (Circle)super.bringToFront();
	}

	@Override
	public Circle bringToBack() {
		return (Circle)super.bringToBack();
	}

	@Override
	public Circle redraw() {
		return (Circle)super.redraw();
	}

}
