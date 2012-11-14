package org.discotools.gwt.leaflet.client.layers.vector;

import org.discotools.gwt.leaflet.client.handlers.HandlerImpl;
import org.discotools.gwt.leaflet.client.jsobject.JSObject;

import com.google.gwt.core.client.JsArray;

/**
 * A class for drawing polyline overlays on a map. 
 * Extends Path. 
 * Use Map#addLayer to add it to the map.
 * 
 * @author Lionel Leiva-Marcon
 * @author David Ignjic
 */
public class PolylineImpl extends PathImpl {

	public static native JSObject create(JSObject latlngs, JSObject options) /*-{
	    return new $wnd.L.Polyline(latlngs, options);
	}-*/;

    public static native JsArray<JSObject> getLatLngs(JSObject self) /*-{
        return self.getLatLngs();
    }-*/;

    public static native HandlerImpl editing(JSObject self) /*-{
        return self.editing;
    }-*/;

    public static native  void addLatLng(JSObject self, JSObject latLng) /*-{
        self.addLatLng(latLng);
    }-*/;

}
