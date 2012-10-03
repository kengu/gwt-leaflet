package org.gwt.leaflet.client.controls.zoom;

import org.gwt.leaflet.client.controls.ControlImpl;
import org.gwt.leaflet.client.jsobject.JSObject;

/**
 * {@link ControlImpl} implementation.
 * 
 * @author Lionel Leiva-Marcon
 *
 */
public class ZoomImpl extends ControlImpl {

	public static native JSObject create(JSObject options)/*-{
		return new $wnd.L.control.zoom(options);
	}-*/;
		
}
