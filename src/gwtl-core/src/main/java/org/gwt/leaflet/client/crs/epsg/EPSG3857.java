package org.gwt.leaflet.client.crs.epsg;

import org.gwt.leaflet.client.crs.CRS;


/**
 * EPSG:3857 (Spherical Mercator), used by most of commercial map providers (CloudMade, Google, Yahoo, Bing, etc).
 * 
 * @author kennethg
 * 
 * @see @see <a href="http://leaflet.cloudmade.com/reference.html#icrs">L.CRS.EPSG3857 (Leaflet API)</a>
 *
 */
public final class EPSG3857 extends CRS {

	/**
	 * EPSG4326 overlay type constructor. 
	 */
	public EPSG3857() { 
		super(CRS.EPSG3857);
	}
	
}