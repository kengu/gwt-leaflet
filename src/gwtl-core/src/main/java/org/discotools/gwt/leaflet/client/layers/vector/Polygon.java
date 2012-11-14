package org.discotools.gwt.leaflet.client.layers.vector;

import org.discotools.gwt.leaflet.client.jsobject.JSObject;
import org.discotools.gwt.leaflet.client.jsobject.JSObjectArray;
import org.discotools.gwt.leaflet.client.map.Map;
import org.discotools.gwt.leaflet.client.popup.PopupOptions;
import org.discotools.gwt.leaflet.client.types.LatLng;

/**
 * A class for drawing polygon overlays on a map. 
 * 
 * Extends Polygon. 
 * Use Map#addLayer to add it to the map.
 * Note that points you pass when creating a polygon shouldn't have 
 * an additional last point equal to the first one, it's better to filter out 
 * such points.
 * 
 * @author Lionel Leiva-Marcon
 *
 */
public class Polygon extends Polyline {
  
	/**
	 * Constructor used for inheritance
	 * @param object
	 */
	public Polygon(JSObject object) {
 		super(object);
	} 

	/**
	 * Default constructor
	 * @param latlngs
	 * @param options
	 */
	public Polygon(LatLng[] latlngs, PolylineOptions options) {
 		super(PolygonImpl.create(new JSObjectArray(latlngs).getJSObject(), options.getJSObject()));
	} 

	@Override
	public Polygon addTo(Map map) {
		return (Polygon)super.addTo(map);
	}

	@Override
	public Polygon bindPopup(String htmlContent, PopupOptions options) {
		return (Polygon)super.bindPopup(htmlContent, options);
	}

	@Override
	public Polygon openPopup(LatLng latlng) {
		return (Polygon)super.openPopup(latlng);
	}

	@Override
	public Polygon setStyle(PathOptions options) {
		return (Polygon)super.setStyle(options);
	}

	@Override
	public Polygon bringToFront() {
		return (Polygon)super.bringToFront();
	}

	@Override
	public Polygon bringToBack() {
		return (Polygon)super.bringToBack();
	}

	@Override
	public Polygon redraw() {
		return (Polygon)super.redraw();
	}	
	
}
