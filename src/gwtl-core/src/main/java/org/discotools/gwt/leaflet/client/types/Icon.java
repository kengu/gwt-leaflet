package org.discotools.gwt.leaflet.client.types;

import org.discotools.gwt.leaflet.client.Options;
import org.discotools.gwt.leaflet.client.jsobject.JSObject;
import org.discotools.gwt.leaflet.client.jsobject.JSObjectWrapper;

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
