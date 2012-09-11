package org.gwt.leaflet.proj4.client;

import org.gwt.leaflet.client.crs.CRS;
import org.gwt.leaflet.client.crs.ICRS;

/**
 * <b>Represents an {@link ICRS#scale(double)} function implementation</b> 
 * <p>
 * Used by Leaflet in its {@link CRS} code.
 * </p>
 * 
 * @author kennethg
 * 
 * @see <a href="http://leaflet.cloudmade.com/reference.html#icrs">ICRS (Leaflet API)</a>
 *
 */
public interface ScaleFunction {
	
	/**
	 * Identity function: returns given zoom.
	 */
	public ScaleFunction IDENTITY = new ScaleFunction() {
		@Override
		public double scale(double zoom) {
			return zoom;
		}
	};
	
	/**
	 * Inverse function: returns given 1/zoom.
	 */
	public ScaleFunction INVERSE = new ScaleFunction() {
		@Override
		public double scale(double zoom) {
			return 1/zoom;
		}
	};
	
	/**
	 * <b>Returns the scale used when transforming projected coordinates into pixel coordinates for a particular zoom</b>. 
	 * <p>
	 * For example, it returns 256 * 2^zoom for Mercator-based CRS.
	 * </p>
	 * @param zoom - Given map zoom
	 * @return double
	 */
	double scale(double zoom);

}
