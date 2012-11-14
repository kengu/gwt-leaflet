package org.discotools.gwt.leaflet.client.types;

import org.discotools.gwt.leaflet.client.jsobject.JSObject;

/**
 * Represents a rectangular geographical area on a map.
 *  
 * @author Lionel Leiva-Marcon
 * @author David Ignjic
 *
 * @see <a href="http://leaflet.cloudmade.com/reference.html#latlngbounds">L.Latlngbounds (Leaflet API)</a>
 *
 */
class LatLngBoundsImpl {

	public static native JSObject create(JSObject southWest, JSObject northEast)/*-{
    	return new $wnd.L.LatLngBounds(southWest, northEast);
    }-*/;
	
	public static native JSObject create(JSObject latlngs)/*-{
		return new $wnd.L.LatLngBounds(latlngs);
	}-*/;

    public static native JSObject getSouthWest(JSObject self)/*-{
	 	return self.getSouthWest();
	}-*/;
    
    public static native JSObject getNorthEast(JSObject self)/*-{
	 	return self.getNorthEast(); 
	}-*/;
    
    public static native JSObject getSouthEast(JSObject self)/*-{
	 	return self.getSouthEast(); 
	}-*/;

    public static native JSObject getNorthWest(JSObject self)/*-{
	 	return self.getNorthWest(); 
	}-*/;

    public static native JSObject getCenter(JSObject self)/*-{
 		return self.getCenter(); 
	}-*/;
    
    public static native String toBBoxString(JSObject self)/*-{
 		return self.toBBoxString(); 
	}-*/;

    public static native JSObject create() /*-{
        return new $wnd.L.LatLngBounds();
    }-*/;

    public static native void extend(JSObject self, JSObject bound) /*-{
        self.extend(bound);
    }-*/;


    public static native boolean contains(JSObject self, JSObject latlng)/*-{
        return self.contains(latlng);
    }-*/;


}
