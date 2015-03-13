package org.discotools.gwt.leaflet.client.controls.draw;

import org.discotools.gwt.leaflet.client.controls.ControlImpl;
import org.discotools.gwt.leaflet.client.jsobject.JSObject;

/**
 * {@link ControlImpl} implementation.
 * 
 * @author Haley Boyd
 *
 */
public class DrawImpl extends
		ControlImpl
{

	public static native JSObject create(JSObject options) /*-{
		return new $wnd.L.Control.Draw(options);
	}-*/;

}
