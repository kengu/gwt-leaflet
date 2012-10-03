package org.gwt.leaflet.client.layers.vector;

import org.gwt.leaflet.client.Options;
import org.gwt.leaflet.client.js.JSObject;
import org.gwt.leaflet.client.js.JSObjectArray;
import org.gwt.leaflet.client.map.Map;
import org.gwt.leaflet.client.types.LatLng;

/**
 * A class for drawing polyline overlays on a map. 
 * Extends Path. 
 * Use Map#addLayer to add it to the map.
 * 
 * @author Lionel Leiva-Marcon
 */
public class Polyline extends Path {
 
	/**
	 * Constructor used for inheritance
	 * @param object
	 */
	public Polyline(JSObject object) {
 		super(object);
	} 

	/**
	 * Default constructor
	 * @param latlngs
	 * @param options
	 */
	public Polyline(LatLng[] latlngs, Options options) {
 		super(PolylineImpl.create(new JSObjectArray(latlngs).getJSObject(), options.getJSObject()));
	} 

	@Override
	public Polyline addTo(Map map) {
		return (Polyline)super.addTo(map);
	}

	@Override
	public Polyline bindPopup(String htmlContent, Options options) {
		return (Polyline)super.bindPopup(htmlContent, options);		
	}

	@Override
	public Polyline openPopup(LatLng latlng) {
		return (Polyline)super.openPopup(latlng);		
	}

	@Override
	public Polyline setStyle(Options options) {
		return (Polyline)super.setStyle(options);	
	}

	@Override
	public Polyline bringToFront() {
		return (Polyline)super.bringToFront();		
	}

	@Override
	public Polyline bringToBack() {
		return (Polyline)super.bringToBack();		
	}

	@Override
	public Polyline redraw() {
		return (Polyline)super.redraw();	
	}
	
}
