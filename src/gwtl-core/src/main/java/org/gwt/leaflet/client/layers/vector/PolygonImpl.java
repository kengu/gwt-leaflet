package org.gwt.leaflet.client.layers.vector;

import org.gwt.leaflet.client.jswraps.JSObject;

/**
 * A class for drawing polygon overlays on a map. 
 * Extends Polyline. 
 * Use Map#addLayer to add it to the map.
 * Note that points you pass when creating a polygon shouldn't have 
 * an additional last point equal to the first one,it's better to filter out 
 * such points.
 * 
 * @author Lionel Leiva-Marcon
 *
 */
public class PolygonImpl {

	public static native JSObject create(JSObject latlngs, JSObject options) /*-{
	    return new $wnd.L.Polygon(latlngs, options);
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
