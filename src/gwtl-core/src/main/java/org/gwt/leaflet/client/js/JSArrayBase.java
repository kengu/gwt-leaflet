package org.gwt.leaflet.client.js;


/**
 * Base class for classes wrapping Javascript arrays.
 *
 * Get and set methods are implemented in subclasses, to make sure
 * they get and set the correct type of array element.
 *
 */
public class JSArrayBase extends JSObjectWrapper
{

    public static JSArrayBase narrowToJArray(JSObject element)
    {
        return (element == null) ? null : new JSArrayBase(element);
    }

    protected JSArrayBase(JSObject element)
    {
        super(element);
    }

    protected JSArrayBase(int length)
    {
        this(JSArrayBaseImpl.create(length));
    }

    public int length()
    {
        return JSArrayBaseImpl.arrayLength(getJSObject());
    }
}
