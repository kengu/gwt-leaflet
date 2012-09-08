package org.gwt.leaflet.api;

import org.gwt.leaflet.api.controls.ControlFactory;
import org.gwt.leaflet.api.crs.CRSFactory;
import org.gwt.leaflet.api.layers.LayerFactory;
import org.gwt.leaflet.api.map.MapFactory;
import org.gwt.leaflet.api.types.TypeFactory;
import org.gwt.leaflet.api.utility.Transformation;

import com.google.gwt.core.client.GWT;

/**
 * <b>Leaflet object factories entry point interface</b>
 * <p>
 * This interface it the principal entry point to all object factories. 
 * </p>
 * @author kengu
 *
 */
public interface Leaflet {
	
	/**
	 * {@link Leaflet} instance.
	 */
	static final Leaflet L = ((Leaflet)GWT.create(Leaflet.class));
	
	/**
	 * Get {@link MapFactory} instance.
	 */
	MapFactory map();

	/**
	 * Get {@link CRSFactory} instance.
	 */
	CRSFactory crs();
	
	/**
	 * Get basic Leaflet type factory instance.
	 */
	TypeFactory type();

	/**
	 * Get {@link LayerFactory} factory instance.
	 */
	LayerFactory layer();
	
	/**
	 * Get {@link ControlFactory} factory instance.
	 */
	ControlFactory control();
	
	/**
	 * Create a{@link Transformation} instance.
	 * <p>
	 * Returns an affine transformation from a set of coefficients a, b, c, d 
	 * which transforms a point of a form (x, y) into (a*x + b, c*y + d) and doing 
	 * the reverse.
	 * </p> 
	 * @param a - First parameter.
	 * @param b - Second parameter.
	 * @param c - Third parameter.
	 * @param d - Last parameter.
	 * @return {@link Transformation}
	 */
	Transformation transformation(double a, double b, double c, double d);
	
}
