package org.gwt.leaflet.client.options;

import org.gwt.leaflet.client.types.LatLng;

/**
 * MapOptions class
 * @author Lionel Leiva-Marcon
 *
 */
public class MapOptions extends Options  {


	public MapOptions() {
		super();
	}
	
	public void setCenter(LatLng latlng) {
        setProperty("center", latlng.getJSObject());
    }

	public void setZoom(int zoom) {
        setProperty("zoom", zoom);
    }

	public void setMinZoom(int zoom) {
       setProperty("minzoom", zoom);
    }

	public void setMaxZoom(int zoom) {
       setProperty("maxzoom", zoom);
    }

}
