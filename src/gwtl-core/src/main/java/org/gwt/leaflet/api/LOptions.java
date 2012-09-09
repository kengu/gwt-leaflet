package org.gwt.leaflet.api;

import org.gwt.leaflet.api.jsutils.JSObject;
import org.gwt.leaflet.api.jsutils.JSObjectWrapper;

/**
 * Options class
 * @author Lionel Leiva
 *
 */
public class LOptions extends JSObjectWrapper  {

	protected LOptions(JSObject object) {
		super(object);
	}
	public LOptions() {
		 this(JSObject.createJSArray());
	}

	public void setProperty(String prop, JSObject obj) {
        getJSObject().setProperty(prop, obj);
    }

	public void setProperty(String prop, String value) {
        getJSObject().setProperty(prop, value);
    }

}
