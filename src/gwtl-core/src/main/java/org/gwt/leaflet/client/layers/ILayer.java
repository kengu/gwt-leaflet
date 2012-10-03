
package org.gwt.leaflet.client.layers;

import org.gwt.leaflet.client.Options;
import org.gwt.leaflet.client.jsobject.JSObject;
import org.gwt.leaflet.client.jsobject.JSObjectWrapper;

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
	 * This method allows to save in session the javascript object linked to 
	 * the java object. Thus, it comes possible to call it directly from the 
	 * JNSI functions by means of the following piece of code
	 * <pre>
	 * $wnd.gwtl.alias[aliasname]
	 * </pre>
	 * 
	 * @param alias - Name of the underlined java object
	 * 
	 * @return {@link ILayer}
	 */
	public ILayer setAlias(String alias) {
		ILayerImpl.setAlias(alias, getJSObject());
		return this;
	};
	
	/**
	 * Modify options in one operation.
	 * 
	 * @param options {@link Options} instance.
	 * @return {@link ILayer}
	 */
	public ILayer setOptions(Options options) {
		ILayerImpl.setOptions(getJSObject(), options.getJSObject());
		return this;
	}
		
	

}
