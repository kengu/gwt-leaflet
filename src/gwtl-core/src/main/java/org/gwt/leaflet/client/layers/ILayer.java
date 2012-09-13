
package org.gwt.leaflet.client.layers;

import org.gwt.leaflet.client.jswraps.JSObject;
import org.gwt.leaflet.client.jswraps.JSObjectWrapper;

/**
 * Prototype interface for all layers
 * 
 * @author kennethg
 * @author Lionel Leiva-Marcon
 *
 * @see <a href="http://leaflet.cloudmade.com/reference.html#ilayer">ILayer (Leaflet API)</a>
 */
public class ILayer extends JSObjectWrapper{

	protected ILayer(JSObject element) {
		super(element);
	}
}
