package org.discotools.gwt.leaflet.client;

import org.discotools.gwt.leaflet.client.jsobject.JSObject;
import org.discotools.gwt.leaflet.client.jsobject.JSObjectWrapper;

import com.google.gwt.user.client.Element;

/**
 * Options class
 * @author Lionel Leiva-Marcon
 *
 */
public class Options extends JSObjectWrapper  {

	public Options(JSObject object) {
		super(object);
	}
	public Options() {
		 this(JSObject.createJSArray());
	}

	public JSObject getProperty(String prop) {
        return getJSObject().getProperty(prop);
    }

	public String[] getPropertyNames() {
        return getJSObject().getPropertyNames().split(",");
    }

	public JSObject[] getPropertyAsArray(String prop) {
        return getJSObject().getPropertyAsArray(prop);
    }

	public boolean getPropertyAsBoolean(String prop) {
        return getJSObject().getPropertyAsBoolean(prop);
    }

	public Element getPropertyAsDomElement(String prop) {
        return getJSObject().getPropertyAsDomElement(prop);
    }

	public double getPropertyAsDouble(String prop) {
        return getJSObject().getPropertyAsDouble(prop);
    }

	public float getPropertyAsFloat(String prop) {
        return getJSObject().getPropertyAsFloat(prop);
    }

	public int getPropertyAsInt(String prop) {
        return getJSObject().getPropertyAsInt(prop);
    }

	public String getPropertyAsString(String prop) {
        return getJSObject().getPropertyAsString(prop);
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
