package org.gwt.leaflet.client.marker;

import org.gwt.leaflet.client.jswraps.JSObject;

/**
 * {@link Marker} implementation.
 * 
 * @author Lionel Leiva-Marcon
 *
 */
public class MarkerImpl  {

	public static native JSObject create(JSObject latlng, JSObject options)/*-{
		return new $wnd.L.Marker(latlng,options);
    }-*/;
		
	public static native JSObject addTo(JSObject self, JSObject map)/*-{
		return self.addTo(map);
	}-*/;

	public static native JSObject bindPopup(JSObject self, String content)/*-{
		return self.bindPopup(content).openPopup();
	}-*/;
}

