package org.discotools.gwt.leaflet.client.crs;

import org.discotools.gwt.leaflet.client.jsobject.JSObject;
import org.discotools.gwt.leaflet.client.types.LatLng;
import org.discotools.gwt.leaflet.client.types.Point;

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
	    var EPSG4326 = @org.discotools.gwt.leaflet.client.crs.CRS::EPSG4326; 
	    var EPSG3395 = @org.discotools.gwt.leaflet.client.crs.CRS::EPSG3395;
	    var EPSG3857 = @org.discotools.gwt.leaflet.client.crs.CRS::EPSG3857;
	    var SIMPLE   = @org.discotools.gwt.leaflet.client.crs.CRS::SIMPLE;
	
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
