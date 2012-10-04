package org.discotools.gwt.leaflet.client.layers.vector;

import org.discotools.gwt.leaflet.client.jsobject.JSObject;

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
public class PolygonImpl extends PolylineImpl {

	public static native JSObject create(JSObject latlngs, JSObject options) /*-{
	    return new $wnd.L.Polygon(latlngs, options);
	}-*/;

}
