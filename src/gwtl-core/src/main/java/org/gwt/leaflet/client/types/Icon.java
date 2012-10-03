package org.gwt.leaflet.client.types;

import org.gwt.leaflet.client.Options;
import org.gwt.leaflet.client.js.JSObject;
import org.gwt.leaflet.client.js.JSObjectWrapper;

/**
 * Represents an icon to provide when creating a marker.
 * 
 * @author Lionel Leiva-Marcon
 *
 * @see <a href="http://leaflet.cloudmade.com/reference.html#icon">L.Icon (Leaflet API)</a>
 */
public class Icon extends JSObjectWrapper{

	public Icon(JSObject element) {
		super(element); 
	}
	public Icon(Options options) {
		this(IconImpl.create(options.getJSObject()));
	}

}
