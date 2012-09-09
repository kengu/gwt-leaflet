package org.gwt.leaflet.api.types;

import org.gwt.leaflet.api.jsutils.JSObject;

/**
 * 
 * @author Erdem Gunay
 *
 */
class LLatLngImpl {

	public static native JSObject create(double lat, double lon)/*-{
    	return new $wnd.L.LatLng(lat, lon);
    }-*/;
	
	public static native double lon(JSObject self)/*-{
		return self.lon;
	}-*/;
	
	public static native double lat(JSObject self)/*-{
		return self.lat;
	}-*/;

}
