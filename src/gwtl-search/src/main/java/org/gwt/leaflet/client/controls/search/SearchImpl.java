package org.gwt.leaflet.client.controls.search;

import org.gwt.leaflet.client.controls.ControlImpl;
import org.gwt.leaflet.client.js.JSObject;

/**
 * {@link ControlImpl} implementation.
 * 
 * @author Lionel Leiva-Marcon
 *
 */
public class SearchImpl extends ControlImpl {

	public static native JSObject create(JSObject options)/*-{
		return new $wnd.L.Control.Search(options);
	}-*/;
	
}
