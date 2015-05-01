
package org.discotools.gwt.leaflet.client.layers;

import org.discotools.gwt.leaflet.client.jsobject.JSObject;

/**
 * Implementation of {@link ILayer}
 *
 * @author Lionel Leiva-Marcon
 *
 * @see ILayer
 */
public class ILayerImpl {

	public static native void setAlias(String name, JSObject self) /*-{
		// Create alias array
		if($wnd.gwtl.alias==undefined) {
			$wnd.gwtl.alias = [];
		}
		$wnd.gwtl.alias[name] = self;
	}-*/;

	public static native JSObject setOptions(JSObject self, JSObject options) /*-{
		self.options = $wnd.L.Util.extend({}, self.options, options);
		return self;
	}-*/;

}
