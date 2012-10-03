package org.gwt.leaflet.client.types;

import org.gwt.leaflet.client.js.JSObject;

/**
 * {@link Icon} implementation.
 *
 * @author Lionel Leiva-Marcon
 */
public class IconImpl {

	/**
	 * IconImpl overlay type constructor. 
	 */
	public static native JSObject create(JSObject options)/*-{
		return new $wnd.L.icon(options);
	}-*/;

}
