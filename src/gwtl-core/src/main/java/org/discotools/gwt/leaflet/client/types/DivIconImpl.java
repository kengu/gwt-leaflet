package org.discotools.gwt.leaflet.client.types;

import org.discotools.gwt.leaflet.client.jsobject.JSObject;

/**
 * {@link Icon} implementation.
 *
 * @author Lionel Leiva-Marcon
 */
public class DivIconImpl {

	/**
	 * IconImpl overlay type constructor. 
	 */
	public static native JSObject create(JSObject options)/*-{
		return new $wnd.L.DivIcon(options);
	}-*/;

}
