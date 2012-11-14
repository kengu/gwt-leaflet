package org.discotools.gwt.leaflet.client.types;

import org.discotools.gwt.leaflet.client.jsobject.JSObject;
import org.discotools.gwt.leaflet.client.jsobject.JSObjectWrapper;

/**
 * Represents a point with x and y coordinates in pixels.
 * 
 * @author kengu
 * @author Lionel Leiva-Marcon
 * @author David Ignjic
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
	public double x() {
		return PointImpl.x(getJSObject());
	}
	
	/**
	 * The y coordinate.
	 * @return double
	 */
	public  double y() {
		return PointImpl.y(getJSObject());
	}
	
	/**
	 * Returns the result of addition of the current and the given points.
	 * @param other - {@link Point} instance
	 * @return {@link Point}
	 */
	public Point add(Point other) {
		return new Point(PointImpl.add(getJSObject(), other.getJSObject()));
	}
	
	/**
	 * Returns the result of subtraction of the given point from the current.
	 * @param other - {@link Point} instance
	 * @return {@link Point}
	 */
	public Point substract(Point other) {
		return new Point(PointImpl.substract(getJSObject(), other.getJSObject()));
	}
	
	/**
	 * Returns the result of multiplication of the current point by the given number.
	 * @param number - given number
	 * @return {@link Point}
	 */
	public Point multiply(double number) {
		return new Point(PointImpl.multiply(getJSObject(), number));
	}

	/**
	 * <b>Returns the result of division of the current point by the given number</b>
	 * <p> 
	 * If optional round is set to true, returns a rounded result.
	 * </p>
	 * @param other - given number
	 * @return {@link Point}
	 */
	public Point divide(double number, boolean round) {
		return new Point(PointImpl.divide(getJSObject(), number, round));
	}
	
	/**
	 * Returns the distance between the current and the given points.
	 * @param other - {@link Point} instance
	 * @return double
	 */
	public double distanceTo(Point other) {
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
