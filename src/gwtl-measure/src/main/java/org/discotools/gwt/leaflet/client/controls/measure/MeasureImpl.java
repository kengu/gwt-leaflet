package org.discotools.gwt.leaflet.client.controls.measure;

import org.discotools.gwt.leaflet.client.controls.ControlImpl;
import org.discotools.gwt.leaflet.client.jsobject.JSObject;

public class MeasureImpl extends ControlImpl
{
	public static native JSObject create(JSObject options) /*-{
		return new $wnd.L.Control.MeasureControl(options);
	}-*/;
}
