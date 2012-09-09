package org.gwt.leaflet.api;

import org.gwt.leaflet.api.jsutils.JSObject;
import org.gwt.leaflet.api.types.LLatLng;

/**
 * MapOptions class
 * @author Lionel Leiva
 *
 */
public class MapOptions extends LOptions  {

	protected MapOptions(JSObject object) {
		super(object);
	}
	public MapOptions() {
		 this(JSObject.createJSArray());
	}
	
	public void setCenter(LLatLng latlng) {
        getJSObject().setProperty("center", latlng.getJSObject());
    }

	public void setZoom(int zoom) {
        getJSObject().setProperty("zoom", zoom);
    }

	public void setMinZoom(int zoom) {
        getJSObject().setProperty("minzoom", zoom);
    }

	public void setMaxZoom(int zoom) {
        getJSObject().setProperty("maxzoom", zoom);
    }

}
