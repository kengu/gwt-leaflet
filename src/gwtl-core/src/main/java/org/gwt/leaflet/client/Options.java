package org.gwt.leaflet.client;

import org.gwt.leaflet.client.jswraps.JSObject;
import org.gwt.leaflet.client.jswraps.JSObjectWrapper;

/**
 * Options class
 * @author Lionel Leiva-Marcon
 *
 */
public class Options extends JSObjectWrapper  {

	protected Options(JSObject object) {
		super(object);
	}
	public Options() {
		 this(JSObject.createJSArray());
	}

	public void setProperty(String prop, JSObjectWrapper obj) {
        getJSObject().setProperty(prop, obj.getJSObject());
    }

	public void setProperty(String prop, JSObject obj) {
        getJSObject().setProperty(prop, obj);
    }

	public void setProperty(String prop, String value) {
        getJSObject().setProperty(prop, value);
    }

	public void setProperty(String prop, int value) {
        getJSObject().setProperty(prop, value);
    }

	public void setProperty(String prop, boolean value) {
        getJSObject().setProperty(prop, value);
    }
}
