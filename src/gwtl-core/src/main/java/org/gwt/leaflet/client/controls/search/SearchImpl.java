package org.gwt.leaflet.client.controls.search;

import org.gwt.leaflet.client.controls.ControlImpl;
import org.gwt.leaflet.client.jswraps.JSObject;

/**
 * {@link ControlImpl} implementation.
 * 
 * @author Lionel Leiva-Marcon
 *
 */
public class SearchImpl  {

	public static native JSObject create(JSObject options)/*-{
		return new $wnd.L.control.search(options);
	}-*/;
	
	public static native JSObject addTo(JSObject self, JSObject map)/*-{
		return self.addTo(map);
	}-*/;

}
