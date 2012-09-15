
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
	
	/**
	 * This method allows to save in session the javascript object
	 * linked to the java object.
	 * Thus, it comes possible to call it directly from the jnsi functions
	 * by mean of the following piece of code : $wnd.gwtl.alias[aliasname]
	 * 
	 * @param alias name of the underlined java object
	 */
	public void setAlias(String alias) {
		ILayerImpl.setAlias(alias, getJSObject());
	};

}
