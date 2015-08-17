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

	/**
	 *
	 * @param latlng The position of the center of the ellipse.
	 * @param radiusX The axis in meters
	 * @param radiusY The axis in meters
	 * @param tilt The rotation of the ellipse in degrees from west
	 * @param pathOptions Options dictionary to pass to L.Path
	 */
	public Ellipse(
			LatLng latlng,
			double radiusX,
			double radiusY,
			double tilt,
			Options pathOptions ) {
		super(
				EllipseImpl.create(
						latlng.getJSObject(),
						radiusX,
						radiusY,
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
			double radiusX,
			double radiusY ) {
		EllipseImpl.setRadius(
				getJSObject(),
				radiusX,
				radiusY);
		return this;
	}

	public double getTilt() {
		return EllipseImpl.getTilt(getJSObject());
	};

	public Ellipse setTilt(
			double tilt ) {
		EllipseImpl.setTilt(
				getJSObject(),
				tilt);
		return this;
	}
}
