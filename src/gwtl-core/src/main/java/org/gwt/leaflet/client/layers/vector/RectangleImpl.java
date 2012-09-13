package org.gwt.leaflet.client.layers.vector;

import org.gwt.leaflet.client.jswraps.JSObject;

/**
 * A class for drawing rectangle overlays on a map. 
 * Extends Polygon. 
 * Use Map#addLayer to add it to the map.
 * 
 * @author Lionel Leiva-Marcon
 */
public class RectangleImpl {

	public static native JSObject create(JSObject latlngs, JSObject options) /*-{
	    return new $wnd.L.rectangle(latlngs, options);
	}-*/;

	
	public static native  void addTo(JSObject self, JSObject map) /*-{
		self.addTo(map);
	}-*/;

	public static native void setBounds(JSObject self, JSObject bounds)/*-{
		self.setBounds(bounds);
	}-*/;

}