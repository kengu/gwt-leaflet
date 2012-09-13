package org.gwt.leaflet.client.crs.epsg;

import org.gwt.leaflet.client.crs.CRS;


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
	 * Simple overlay type constructor. 
	 */
	public Simple() {
		super(CRS.SIMPLE);
	}
	
}