
package org.gwt.leaflet.client.layers;

import org.gwt.leaflet.client.jswraps.JSObject;

/**
 * Prototype interface for all layers
 * 
 * @author kennethg
 * @author Lionel Leiva-Marcon
 *
 * @see <a href="http://leaflet.cloudmade.com/reference.html#ilayer">ILayer (Leaflet API)</a>
 */
public class ILayerImpl {

	public static native void setAlias(String name, JSObject self) /*-{
		// Create alias array
		if($wnd.gwtl.alias==undefined) {
			$wnd.gwtl.alias = [];
		}
		$wnd.gwtl.alias[name] = self;
	}-*/;
}
