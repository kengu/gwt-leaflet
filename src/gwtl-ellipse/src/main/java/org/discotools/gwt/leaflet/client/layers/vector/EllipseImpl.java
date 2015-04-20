package org.discotools.gwt.leaflet.client.layers.vector;

import org.discotools.gwt.leaflet.client.jsobject.JSObject;

/**
 * A class for drawing ellipse overlays on a map.
 * Extends Path.
 *
 * Use Map#addLayer to add it to the map.
 *
 * @author Haley Boyd
 *
 */
public class EllipseImpl extends
		PathImpl
{
	public static native JSObject create(JSObject latlng, double radiusX, double radiusY, double tilt, JSObject options) /*-{
    	return new $wnd.L.ellipse(latlng, [radiusX, radiusY], tilt, options);
	}-*/;

	public static native JSObject getLatLng(JSObject self) /*-{
		return self.getLatLng();
	}-*/;

	public static native void setLatLng(JSObject self, JSObject latlng) /*-{
		self.setLatLng(latlng);
	}-*/;

	public static native JSObject getRadius(JSObject self) /*-{
		return self.getRadius();
	}-*/;

	public static native void setRadius(JSObject self, double radiusX, double radiusY) /*-{
		self.setRadius([radiusX, radiusY]);
	}-*/;

	public static native void setTilt(JSObject self, double tilt) /*-{
		self.setTilt(tilt);
	}-*/;
}
