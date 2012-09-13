package org.gwt.leaflet.client.crs;

import org.gwt.leaflet.client.LeafletException;
import org.gwt.leaflet.client.crs.epsg.EPSG3395;
import org.gwt.leaflet.client.crs.epsg.EPSG3857;
import org.gwt.leaflet.client.crs.epsg.EPSG4326;
import org.gwt.leaflet.client.crs.epsg.Simple;
import org.gwt.leaflet.client.jswraps.JSObject;
import org.gwt.leaflet.client.types.LatLng;
import org.gwt.leaflet.client.types.Point;

/**
 * <b>Base {@link ICRS} implementation class</b>
 * <p>
 *  
 * @author kengu
 * @author Lionel Leiva-Marcon
 * 
 * @see @see <a href="http://leaflet.cloudmade.com/reference.html#icrs">L.CRS (Leaflet API)</a>
 *
 */
public class CRSImpl  {

	// --------------------------------------------------------
	// ICRS interface implementation
	// --------------------------------------------------------	
	public static native JSObject create(String code) /*-{
	    var EPSG4326 = @org.gwt.leaflet.client.crs.CRS::EPSG4326; 
	    var EPSG3395 = @org.gwt.leaflet.client.crs.CRS::EPSG3395;
	    var EPSG3857 = @org.gwt.leaflet.client.crs.CRS::EPSG3857;
	    var SIMPLE   = @org.gwt.leaflet.client.crs.CRS::SIMPLE;
	
	    var epsg
		if(code == EPSG4326) {
			epsg = $wnd.L.CRS.EPSG4326;
		}
		else if(code == EPSG3395) {
			epsg = $wnd.L.CRS.EPSG3395;
		}
		else if(code == EPSG3857) {
			epsg =  $wnd.L.CRS.EPSG3857;
		}
		else if(code == SIMPLE) {
			epsg  = $wnd.L.CRS.Simple;
			epsg.code = 'Simple';
		}
		//alert(code + " : " +epsg + "/"+ epsg.code);
		return epsg;
		
	}-*/;
	
	public static native String getCode() /*-{
		return this.code;
	}-*/;
	 
	
	public static native Point toPoint(LatLng coords, double zoom) /*-{
		return this.toPoint(coords,zoom);
	}-*/;
	
	public static native Point project(LatLng coords) /*-{
		return this.project(coords,zoom);
	}-*/;
	
	public static native LatLng toLatLng(Point point, double zoom) /*-{
		return this.toLatLng(point,zoom);
	}-*/;
	
	public static native double scale(double zoom) /*-{
		return this.scale(zoom);
	}-*/;
	
}
