package org.gwt.leaflet.client.types;

import org.gwt.leaflet.client.jswraps.JSObject;

/**
 * 
 * @author Erdem Gunay
 * @author Lionel Leiva-Marcon
 *
 */
class LatLngImpl {

	public static native JSObject create(double lat, double lon)/*-{
    	return new $wnd.L.LatLng(lat, lon);
    }-*/;
	
	public static native double lng(JSObject self)/*-{
		return self.lng;
	}-*/;
	
	public static native double lat(JSObject self)/*-{
		return self.lat;
	}-*/;

}
