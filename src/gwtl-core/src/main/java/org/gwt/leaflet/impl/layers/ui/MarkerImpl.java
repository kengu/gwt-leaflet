package org.gwt.leaflet.impl.layers.ui;

import org.gwt.leaflet.api.jsutils.JSObject;
import org.gwt.leaflet.api.layers.ui.Marker;

/**
 * {@link Marker} implementation.
 * 
 * @author Lionel Leiva
 *
 */
public class MarkerImpl  {

	public static native JSObject create(JSObject latlng, JSObject options)/*-{
		return new $wnd.L.Marker(latlng,options);
    }-*/;
		
	public static native JSObject create(JSObject latlng)/*-{
		return new $wnd.L.Marker(latlng);
	}-*/;
	
	public static native JSObject addTo(JSObject self, String mapname)/*-{
		var map = $wnd.gwtl.maps[mapname];
		return self.addTo(map);
	}-*/;

}

