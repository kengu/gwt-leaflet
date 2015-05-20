package org.discotools.gwt.leaflet.client.controls.crosshair;

import org.discotools.gwt.leaflet.client.controls.ControlImpl;
import org.discotools.gwt.leaflet.client.jsobject.JSObject;

public class CrosshairImpl extends ControlImpl
{
	public static native JSObject create(JSObject options) /*-{
		return new $wnd.L.Control.Crosshair(options);
	}-*/;
}
