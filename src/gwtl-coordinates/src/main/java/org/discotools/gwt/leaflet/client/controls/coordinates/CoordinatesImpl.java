package org.discotools.gwt.leaflet.client.controls.coordinates;

import org.discotools.gwt.leaflet.client.controls.ControlImpl;
import org.discotools.gwt.leaflet.client.jsobject.JSObject;

/**
 *
 * @author Haley Boyd
 *
 */
public class CoordinatesImpl extends ControlImpl
{
	public static native JSObject create(JSObject options) /*-{
		return new $wnd.L.control.coordinates(options);
	}-*/;
}
