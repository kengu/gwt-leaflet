package org.gwt.leaflet.client.crs.epsg;

import org.gwt.leaflet.client.crs.CRS;


/**
 * EPSG:4326 (Plate Carree), very popular among GIS enthusiasts.
 * 
 * @author kennethg
 * 
 * @see @see <a href="http://leaflet.cloudmade.com/reference.html#icrs">L.CRS.EPSG4326 (Leaflet API)</a>
 *
 */
public final class EPSG4326 extends CRS {

	/**
	 * EPSG4326 overlay type constructor. 
	 */
	public EPSG4326() {
		super(CRS.EPSG4326);
	}
	
}