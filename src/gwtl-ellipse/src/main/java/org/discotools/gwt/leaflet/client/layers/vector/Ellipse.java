package org.discotools.gwt.leaflet.client.layers.vector;

import org.discotools.gwt.leaflet.client.Options;
import org.discotools.gwt.leaflet.client.jsobject.JSObject;
import org.discotools.gwt.leaflet.client.types.LatLng;
import org.discotools.gwt.leaflet.client.types.Point;

/**
 *
 * @author Haley Boyd
 *
 */
public class Ellipse extends
		Path
{

	/**
	 * Constructor used for inheritance
	 *
	 * @param object
	 */
	public Ellipse(
			JSObject object ) {
		super(
				object);
	}

	public Ellipse(
			LatLng latlng,
			double semiMajorAxis,
			double semiMinorAxis,
			int tilt,
			Options pathOptions ) {
		super(
				EllipseImpl.create(
						latlng.getJSObject(),
						semiMajorAxis,
						semiMinorAxis,
						tilt,
						pathOptions.getJSObject()));
	}

	public LatLng getLatLng() {
		return new LatLng(
				EllipseImpl.getLatLng(getJSObject()));
	}

	public Ellipse setLatLng(
			LatLng latlng ) {
		EllipseImpl.setLatLng(
				getJSObject(),
				latlng.getJSObject());
		return this;
	}

	public Point getRadius() {
		return new Point(
				EllipseImpl.getRadius(getJSObject()));
	}

	public Ellipse setRadius(
			double semiMajorAxis,
			double semiMinorAxis ) {
		EllipseImpl.setRadius(
				getJSObject(),
				semiMajorAxis,
				semiMinorAxis);
		return this;
	}

	public Ellipse setTilt(
			int tilt ) {
		EllipseImpl.setTilt(
				getJSObject(),
				tilt);
		return this;
	}
}
