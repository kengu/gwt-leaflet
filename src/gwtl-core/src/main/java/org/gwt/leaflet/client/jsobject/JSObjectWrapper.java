package org.gwt.leaflet.client.jsobject;


/**
 * Base class for Objects that wrap an opaque javascript object (represented by a JSObject),
 * to provide (part of) the javascript object's functionality in GWT.
 *
 * <p>
 * This class was derived from the GWT-OpenLayer wrapping source code
 * </p>

 * @author Edwin Commandeur - Atlis EJS
 * @author Lionel Leiva-Marcon
 */
public class JSObjectWrapper
{

    private JSObject jsObject;

    protected JSObjectWrapper(JSObject jsObject)
    {
        setJSObject(jsObject);
    }

    public JSObject getJSObject()
    {
        return jsObject;
    }

    public void setJSObject(JSObject jsObject)
    {
        this.jsObject = jsObject;
    }

}
