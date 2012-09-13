package org.gwt.leaflet.client.layers.vector;

import org.gwt.leaflet.client.jswraps.JSObject;

/**
 * A class for drawing polyline overlays on a map. 
 * Extends Path. 
 * Use Map#addLayer to add it to the map.
 * 
 * @author Lionel Leiva-Marcon
 */
public class PolylineImpl {

	public static native JSObject create(JSObject latlngs, JSObject options) /*-{
	    return new $wnd.L.Polyline(latlngs, options);
	}-*/;

	
	public static native  void addTo(JSObject self, JSObject map) /*-{
		self.addTo(map);
	}-*/;

	public static native  void bindPopup(JSObject self,String htmlContent, JSObject options) /*-{
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
