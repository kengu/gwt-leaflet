package org.discotools.gwt.leaflet.client.layers.vector;

import org.discotools.gwt.leaflet.client.handlers.IHandler;
import org.discotools.gwt.leaflet.client.jsobject.JSObject;
import org.discotools.gwt.leaflet.client.jsobject.JSObjectArray;
import org.discotools.gwt.leaflet.client.map.Map;
import org.discotools.gwt.leaflet.client.popup.PopupOptions;
import org.discotools.gwt.leaflet.client.types.LatLng;

import com.google.gwt.core.client.JsArray;

/**
 * A class for drawing polyline overlays on a map. 
 * Extends Path. 
 * Use Map#addLayer to add it to the map.
 * 
 * @author Lionel Leiva-Marcon
 * @author David Ignjic
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
	public Polyline(LatLng[] latlngs, PolylineOptions options) {
 		super(PolylineImpl.create(new JSObjectArray(latlngs).getJSObject(), options.getJSObject()));
	} 

	@Override
	public Polyline addTo(Map map) {
		return (Polyline)super.addTo(map);
	}

	@Override
	public Polyline bindPopup(String htmlContent, PopupOptions options) {
		return (Polyline)super.bindPopup(htmlContent, options);		
	}

	@Override
	public Polyline openPopup(LatLng latlng) {
		return (Polyline)super.openPopup(latlng);		
	}

	@Override
	public Polyline setStyle(PathOptions options) {
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

	
	public LatLng[] getLatLngs(){
	    JsArray<JSObject> ret = PolylineImpl.getLatLngs(getJSObject());
	    LatLng[] latLngs = new LatLng[ret.length()];
	    for (int i = 0; i < latLngs.length; i++) {
            latLngs[i] = new LatLng(ret.get(i));
        }
	    return latLngs;
	}
	
	
	public IHandler editing(){
	    return PolylineImpl.editing(getJSObject());
	}
	
	public Polyline addLatLng(LatLng latLng){
	    PolylineImpl.addLatLng(getJSObject(), latLng.getJSObject());
	    return this;
	}
}
