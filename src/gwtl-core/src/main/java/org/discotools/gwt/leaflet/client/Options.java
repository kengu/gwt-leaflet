package org.discotools.gwt.leaflet.client;

import org.discotools.gwt.leaflet.client.jsobject.JSObject;
import org.discotools.gwt.leaflet.client.jsobject.JSObjectWrapper;

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

	public Options setProperty(String prop, JSObjectWrapper obj) {
        getJSObject().setProperty(prop, obj.getJSObject());
        return this;
    }

	public Options setProperty(String prop, JSObject obj) {
        getJSObject().setProperty(prop, obj);
        return this;
    }

	public Options setProperty(String prop, String value) {
        getJSObject().setProperty(prop, value);
        return this;
    }

	public Options setProperty(String prop, int value) {
        getJSObject().setProperty(prop, value);
        return this;
    }

	public Options setProperty(String prop, double value) {
        getJSObject().setProperty(prop, value);
        return this;
    }
	
	public Options setProperty(String prop, boolean value) {
        getJSObject().setProperty(prop, value);
        return this;
    }
}
