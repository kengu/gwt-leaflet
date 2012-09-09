
package org.gwt.leaflet.api.layers;

import org.gwt.leaflet.api.jsutils.JSObject;
import org.gwt.leaflet.api.jsutils.JSObjectWrapper;

/**
 * Prototype interface for all layers
 * 
 * @author kennethg
 * @author lionel leiva
 *
 * @see <a href="http://leaflet.cloudmade.com/reference.html#ilayer">ILayer (Leaflet API)</a>
 */
public class ILLayer extends JSObjectWrapper{

	protected ILLayer(JSObject element) {
		super(element);
	}
}
