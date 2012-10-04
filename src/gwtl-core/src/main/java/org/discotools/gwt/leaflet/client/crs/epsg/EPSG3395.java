package org.discotools.gwt.leaflet.client.crs.epsg;

import org.discotools.gwt.leaflet.client.crs.CRS;


/**
 * EPSG:3395 (True Mercator), used by some map providers.
 * 
 * @author kennethg
 * 
 * @see @see <a href="http://leaflet.cloudmade.com/reference.html#icrs">L.CRS.EPSG3395 (Leaflet API)</a>
 *
 */
public final class EPSG3395 extends CRS {

	/**
	 * EPSG4326 overlay type constructor. 
	 */
	public EPSG3395() { 
		super(CRS.EPSG3395);
	}
	
}