package org.gwt.leaflet.client.layers.vector;

import org.gwt.leaflet.client.js.JSObject;

/**
 * A class for drawing circle overlays on a map. 
 * Extends Path. 
 * 
 * Use Map#addLayer to add it to the map.
 * 
 * @author Lionel Leiva-Marcon
 *
 */
public class CircleImpl extends PathImpl {

	public static native JSObject create(JSObject latlng, double radius, JSObject options) /*-{
	    return new $wnd.L.Circle(latlng, radius, options);
	}-*/;

	public static native JSObject getLatLng(JSObject self) /*-{
		return self.getLatLng();
	}-*/;

	public static native  void setLatLng(JSObject self, JSObject latlng) /*-{
		self.setLatLng(latlng);
	}-*/;

	public static native  double getRadius(JSObject self) /*-{
		return self.getRadius();
	}-*/;

	public static native  void setRadius(JSObject self, double radius) /*-{
		self.setRadius(radius);
	}-*/;

}
