package org.discotools.gwt.leaflet.client.util;

import java.util.Map;

import org.discotools.gwt.leaflet.client.jsobject.JSObject;
import org.discotools.gwt.leaflet.client.jsobject.JSObjectWrapper;
import org.discotools.gwt.leaflet.client.types.Point;

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
public class Transformation extends JSObjectWrapper {
	
	
	protected Transformation(JSObject jsObject) {
		super(jsObject);
		// TODO Auto-generated constructor stub
	}
	
	public Transformation(double a, double b, double c, double d) {
		this(TransformationImpl.create(a, b, c, d));
	}

	/**
	 * Identity transformation: (x,y) => (x,y);
	 */
	Transformation IDENTIY = new Transformation(1, 0, 1, 0);

	/**
	 * X-inverse transformation: (x,y) => (-x,y);
	 */
	Transformation X_INVERSE = new Transformation(-1, 0, 1, 0);
	
	/**
	 * Y-inverse transformation: (x,y) => (x,-y);
	 */
	Transformation Y_INVERSE = new Transformation(1, 0, -1, 0);
	
	/**
	 * Inverse transformation: (x,y) => (-x,-y);
	 */
	Transformation INVERSE = new Transformation(-1, 0, -1, 0);
	
	/**
	 * Returns a transformed point.
	 * 
	 * @param other - {@link Point} instance
	 * @return {@link Point}
	 */
	Point transform(Point other) {
		return new Point(TransformationImpl.transform(getJSObject(), other.getJSObject()));
	}
	
	/**
	 * Returns a transformed point multiplied by the given scale.
	 * 
	 * @param other - {@link Point} instance
	 * @param scale - {@link Map} scale
	 * @return {@link Point}
	 */
	Point transform(Point other, double scale) {
		return new Point(TransformationImpl.transform(getJSObject(), other.getJSObject(), scale));
	}
	 
	/**
	 * Returns the reverse transformation of the given point. 
	 * 
	 * @param other - {@link Point} instance
	 * @return {@link Point}
	 */
	Point untransform(Point other) {
		return new Point(TransformationImpl.untransform(getJSObject(), other.getJSObject()));
	}
	
	/**
	 * Returns the reverse transformation of the given point divided by the given scale. 
	 * 
	 * @param other - {@link Point} instance
	 * @param scale - {@link Map} scale
	 * @return {@link Point}
	 */
	Point untransform(Point other, double scale) {
		return new Point(TransformationImpl.untransform(getJSObject(), other.getJSObject(), scale));
	}
	
}
