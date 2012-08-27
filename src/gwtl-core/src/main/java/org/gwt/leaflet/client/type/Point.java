package org.gwt.leaflet.client.type;

/**
 * Represents a point with x and y coordinates in pixels.
 * 
 * @author kengu
 *
 * @see <a href="http://leaflet.cloudmade.com/reference.html#point">L.Point (Leaflet API)</a>
 */
public interface Point {

	/**
	 * The x coordinate.
	 * @return double
	 */
	double x();
	
	/**
	 * The y coordinate.
	 * @return double
	 */
	double y();
	
	/**
	 * Returns the result of addition of the current and the given points.
	 * @param other - {@link Point} instance
	 * @return {@link Point}
	 */
	Point add(Point other);
	
	/**
	 * Returns the result of subtraction of the given point from the current.
	 * @param other - {@link Point} instance
	 * @return {@link Point}
	 */
	Point substract(Point other);
	
	/**
	 * Returns the result of multiplication of the current point by the given number.
	 * @param other - {@link Point} instance
	 * @return {@link Point}
	 */
	Point multiply(Point other);

	/**
	 * <b>Returns the result of division of the current point by the given number</b>
	 * <p> 
	 * If optional round is set to true, returns a rounded result.
	 * </p>
	 * @param other - {@link Point} instance
	 * @return {@link Point}
	 */
	Point divide(Point other, boolean round);
	
	/**
	 * Returns the distance between the current and the given points.
	 * @param other - {@link Point} instance
	 * @return double
	 */
	double distanceTo(Point other);
	
	/**
	 * Returns a copy of the current point.
	 * @return {@link Point}
	 */
	Point clone();
	
	/**
	 * Returns a copy of the current point with rounded coordinates.
	 * @return {@link Point}
	 */
	Point round();
	
	/**
	 * Returns a string representation of the point for debugging purposes.
	 * @return {@link String}
	 */
	String toString();


	
	
}
