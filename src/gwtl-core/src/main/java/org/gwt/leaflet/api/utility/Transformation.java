package org.gwt.leaflet.api.utility;

import java.util.Map;

import org.gwt.leaflet.api.Leaflet;
import org.gwt.leaflet.api.types.Point;

/**
 * <b>Represents an affine transformation</b> 
 * <p>
 * A set of coefficients a, b, c, d for transforming a point of a 
 * form (x, y) into (a*x + b, c*y + d) and doing the reverse.
 * <p>
 * Used by Leaflet in its projections code.
 * </p>
 * 
 * @author kennethg
 * 
 * @see <a href="http://leaflet.cloudmade.com/reference.html#transformation">L.Transformation (Leaflet API)</a>
 *
 */
public interface Transformation {
	
	/**
	 * Identity transformation: (x,y) => (x,y);
	 */
	Transformation IDENTIY = Leaflet.L.transformation(1, 0, 1, 0);

	/**
	 * X-inverse transformation: (x,y) => (-x,y);
	 */
	Transformation X_INVERSE = Leaflet.L.transformation(-1, 0, 1, 0);
	
	/**
	 * Y-inverse transformation: (x,y) => (x,-y);
	 */
	Transformation Y_INVERSE = Leaflet.L.transformation(1, 0, -1, 0);
	
	/**
	 * Inverse transformation: (x,y) => (-x,-y);
	 */
	Transformation INVERSE = Leaflet.L.transformation(-1, 0, -1, 0);
	
	/**
	 * Returns a transformed point.
	 * 
	 * @param other - {@link Point} instance
	 * @return {@link Point}
	 */
	Point transform(Point other);
	
	/**
	 * Returns a transformed point multiplied by the given scale.
	 * 
	 * @param other - {@link Point} instance
	 * @param scale - {@link Map} scale
	 * @return {@link Point}
	 */
	Point transform(Point other, double scale);
	
	/**
	 * Returns the reverse transformation of the given point. 
	 * 
	 * @param other - {@link Point} instance
	 * @return {@link Point}
	 */
	Point untransform(Point other);
	
	/**
	 * Returns the reverse transformation of the given point divided by the given scale. 
	 * 
	 * @param other - {@link Point} instance
	 * @param scale - {@link Map} scale
	 * @return {@link Point}
	 */
	Point untransform(Point other, double scale);		
	
}
