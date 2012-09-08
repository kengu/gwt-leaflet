package org.gwt.leaflet.api.crs;

import org.gwt.leaflet.impl.crs.CRS;

/**
 * A simple CRS that maps longitude and latitude into x and y directly.
 *  
 * May be used for maps of flat surfaces (e.g. game maps).
 * 
 * @author kennethg
 * 
 * @see @see <a href="http://leaflet.cloudmade.com/reference.html#icrs">L.CRS.Simple (Leaflet API)</a>
 *
 */
public final class Simple extends CRS {

	/**
	 * EPSG4326 overlay type constructor. 
	 */
	protected Simple() { }
	
}