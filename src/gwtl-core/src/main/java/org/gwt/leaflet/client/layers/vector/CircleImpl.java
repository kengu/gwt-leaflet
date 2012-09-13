package org.gwt.leaflet.client.layers.vector;

import org.gwt.leaflet.client.jswraps.JSObject;

/**
 * A class for drawing circle overlays on a map. 
 * Extends Path. 
 * Use Map#addLayer to add it to the map.
 * 
 * @author Lionel Leiva-Marcon
 *
 */
public class CircleImpl {

	public static native JSObject create(JSObject latlng, double radius, JSObject options) /*-{
	    return new $wnd.L.Circle(latlng, radius, options);
	}-*/;

	
	public static native  void addTo(JSObject self, JSObject map) /*-{
		self.addTo(map);
	}-*/;

	public static native JSObject getLatLng(JSObject self) /*-{
		return self.getLatLng(htmlContent, options);
	}-*/;

	public static native  double getRadius(JSObject self) /*-{
		return self.getRadius();
	}-*/;

	public static native  void setLatLng(JSObject self,JSObject latlng) /*-{
		self.setLatLng(latlng);
	}-*/;

	public static native  void setRadius(JSObject self,double radius) /*-{
		self.setRadius(radius);
	}-*/;
	
}
