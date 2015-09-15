package org.discotools.gwt.leaflet.client.types;

import org.discotools.gwt.leaflet.client.jsobject.JSObject;

/**
 * 
 * @author Erdem Gunay
 * @author Lionel Leiva-Marcon
 * @author David Ignjic
 *
 */
class LatLngImpl {

	public static native JSObject create(double lat, double lon)/*-{
    	return new $wnd.L.LatLng(lat, lon);
    }-*/;
	
    public static native JSObject create(double lat, double lon, boolean noWrap)/*-{
        return new $wnd.L.LatLng(lat, lon, noWrap);
    }-*/;
	
	public static native double lng(JSObject self)/*-{
		return self.lng;
	}-*/;
	
	public static native double lat(JSObject self)/*-{
		return self.lat;
	}-*/;

    public static native double distanceTo(JSObject self, JSObject otherLatlng)/*-{
        return self.distanceTo(otherLatlng);
    }-*/;

	public static native JSObject wrap(JSObject self)/*-{
		return self.wrap();
	}-*/;

    public static native boolean equals(JSObject self, JSObject other)/*-{
        return self.equals(other);
    }-*/;


 


}
