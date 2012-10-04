package org.discotools.gwt.leaflet.client.jsobject;


class JSArrayBaseImpl
{
    protected static native JSObject create(int length) /*-{
        if (length < 0)
        {
        return new Array();
        }
        else
        {
        return new Array(length);
        }
    }-*/;

    public static native int arrayLength(JSObject array) /*-{
        if (array === undefined) return -1;
        return array.length;
    }-*/;
}
