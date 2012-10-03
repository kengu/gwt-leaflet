package org.gwt.leaflet.client.layers.vector;

import org.gwt.leaflet.client.jsobject.JSObject;

/**
 * A class for drawing polyline overlays on a map. 
 * Extends Path. 
 * Use Map#addLayer to add it to the map.
 * 
 * @author Lionel Leiva-Marcon
 */
public class PolylineImpl extends PathImpl {

	public static native JSObject create(JSObject latlngs, JSObject options) /*-{
	    return new $wnd.L.Polyline(latlngs, options);
	}-*/;

}
