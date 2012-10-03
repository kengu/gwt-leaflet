package org.gwt.leaflet.client.layers.vector;

import org.gwt.leaflet.client.jsobject.JSObject;

/**
 * An abstract class that contains options and constants shared 
 * between vector overlays (Polygon, Polyline, Circle). 
 * 
 * @author Lionel Leiva-Marcon
 *
 */
public abstract class PathImpl {


	public static native  void addTo(JSObject self, JSObject map) /*-{
		self.addTo(map);
	}-*/;

	public static native  void bindPopup(JSObject self, String htmlContent, JSObject options) /*-{
		self.bindPopup(htmlContent, options);
	}-*/;

	public static native  void openPopup(JSObject self, JSObject latlng) /*-{
		return self.openPopup(latlng);
	}-*/;

	public static native  void setStyle(JSObject self, JSObject object) /*-{
		self.setStyle(object);
	}-*/;

	public static native  void bringToFront(JSObject self) /*-{
		self.bringToFront();
	}-*/;
	
	public static native  JSObject getBounds(JSObject self) /*-{
		return self.getBounds();
	}-*/;

	public static native  void bringToBack(JSObject self) /*-{
		self.bringToBack();
	}-*/;

	public static native  void redraw(JSObject self) /*-{
		self.redraw();
	}-*/;
	
	
}
