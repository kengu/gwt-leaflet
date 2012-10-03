package org.gwt.leaflet.client.types;

import org.gwt.leaflet.client.js.JSObject;
import org.gwt.leaflet.client.js.JSObjectWrapper;

/**
 * Represents a point with x and y coordinates in pixels.
 * 
 * @author kengu
 * @author Lionel Leiva-Marcon
 *
 * @see <a href="http://leaflet.cloudmade.com/reference.html#point">L.Point (Leaflet API)</a>
 */
public class Point extends JSObjectWrapper{

	public Point(JSObject jsObject) {
		super(jsObject);
	}

	public Point(double x, double y) {
		this(PointImpl.create(x, y));
	}


	/**
	 * The x coordinate.
	 * @return double
	 */
	double x() {
		return PointImpl.x(getJSObject());
	}
	
	/**
	 * The y coordinate.
	 * @return double
	 */
	double y() {
		return PointImpl.y(getJSObject());
	}
	
	/**
	 * Returns the result of addition of the current and the given points.
	 * @param other - {@link Point} instance
	 * @return {@link Point}
	 */
	void add(Point other) {
		PointImpl.add(getJSObject(), other.getJSObject());
	}
	
	/**
	 * Returns the result of subtraction of the given point from the current.
	 * @param other - {@link Point} instance
	 * @return {@link Point}
	 */
	void substract(Point other) {
		PointImpl.substract(getJSObject(), other.getJSObject());
	}
	
	/**
	 * Returns the result of multiplication of the current point by the given number.
	 * @param other - {@link Point} instance
	 * @return {@link Point}
	 */
	void multiply(Point other) {
		PointImpl.multiply(getJSObject(), other.getJSObject());
	}

	/**
	 * <b>Returns the result of division of the current point by the given number</b>
	 * <p> 
	 * If optional round is set to true, returns a rounded result.
	 * </p>
	 * @param other - {@link Point} instance
	 * @return {@link Point}
	 */
	void divide(Point other, boolean round) {
		PointImpl.divide(getJSObject(), other.getJSObject(), round);
	}
	
	/**
	 * Returns the distance between the current and the given points.
	 * @param other - {@link Point} instance
	 * @return double
	 */
	double distanceTo(Point other) {
		return PointImpl.distanceTo(getJSObject(), other.getJSObject());

	}
	
	/**
	 * Returns a copy of the current point.
	 * @return {@link Point}
	 */
	public Point clone() {
		return new Point(PointImpl.clone(getJSObject()));
	}
	
	/**
	 * Returns a copy of the current point with rounded coordinates.
	 * @return {@link Point}
	 */
	public Point round() {
		return new Point(PointImpl.round(getJSObject()));
	}
	
	/**
	 * Returns a string representation of the point for debugging purposes.
	 * @return {@link String}
	 */
	public String toString() {
		return "["+PointImpl.x(getJSObject())+","+PointImpl.y(getJSObject())+"]";
	}


	
	
}
