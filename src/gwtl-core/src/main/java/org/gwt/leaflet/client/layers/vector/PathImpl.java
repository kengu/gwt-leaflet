package org.gwt.leaflet.client.layers.vector;

import org.gwt.leaflet.client.jswraps.JSObject;

/**
 * An abstract class that contains options and constants shared 
 * between vector overlays (Polygon, Polyline, Circle). 
 * 
 * Do not use it directly. 
 * 
 * @author Lionel Leiva-Marcon
 *
 */
public  class PathImpl {


	public static native  void addTo(JSObject self, JSObject map) /*-{
		self.addTo(map);
	}-*/;

	public static native  void bindPopup(JSObject self,JSObject htmlContent, JSObject options) /*-{
		self.bindPopup(htmlContent, options);
	}-*/;

	public static native  void openPopup(JSObject latlng) /*-{
		return new L.polyline(latlngs, options);
	}-*/;

	public static native  void setStyle(JSObject object) /*-{
		return new L.polyline(latlngs, options);
	}-*/;

	public static native  void bringToFront() /*-{
		return new L.polyline(latlngs, options);
	}-*/;

	public static native  void bringToBack() /*-{
		return new L.polyline(latlngs, options);
	}-*/;

	public static native  void redraw() /*-{
		return new L.polyline(latlngs, options);
	}-*/;
	
	
}
