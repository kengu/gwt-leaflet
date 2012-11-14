package org.discotools.gwt.leaflet.client.marker;

import org.discotools.gwt.leaflet.client.jsobject.JSObject;

public class MarkerWithLabelImpl extends MarkerImpl {

    public static native void bindLabel(JSObject self, String content, JSObject options)/*-{
		self.bindLabel(content, options);
    }-*/;

    public static native void updateLabelContent(JSObject self, String content)/*-{
		self.updateLabelContent(content);
    }-*/;

    public static native void unbindLabel(JSObject self)/*-{
		self.unbindLabel();
    }-*/;

    public static native void hideLabel(JSObject self)/*-{
		self.hideLabel();
    }-*/;

    public static native void showLabel(JSObject self)/*-{
		self.showLabel();
    }-*/;

}
