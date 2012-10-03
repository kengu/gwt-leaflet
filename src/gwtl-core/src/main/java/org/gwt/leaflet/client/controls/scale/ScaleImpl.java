package org.gwt.leaflet.client.controls.scale;

import org.gwt.leaflet.client.controls.ControlImpl;
import org.gwt.leaflet.client.js.JSObject;

/**
 * {@link ScaleImpl} implementation.
 * 
 * @author Lionel Leiva-Marcon
 *
 */
public class ScaleImpl extends ControlImpl {

	public static native JSObject create(JSObject options)/*-{
		return new $wnd.L.control.scale(options);
	}-*/;
		
}
