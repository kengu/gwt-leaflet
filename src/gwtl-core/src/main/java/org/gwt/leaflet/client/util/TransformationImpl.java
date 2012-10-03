package org.gwt.leaflet.client.util;

import org.gwt.leaflet.client.js.JSObject;

public class TransformationImpl  {
	
	public static native JSObject create(double a, double b, double c, double d)/*-{
		return new $wnd.L.Transformation(a, b, c, d);
	}-*/;
	
	// --------------------------------------------------------
	// Transformation interface implementation
	// --------------------------------------------------------
	
	public static native JSObject transform(JSObject self, JSObject other) /*-{
		return self.transform(other);
	}-*/;

	public static native JSObject transform(JSObject self, JSObject other, double scale) /*-{
		return self.transform(other, scale);
	}-*/;

	public static native JSObject untransform(JSObject self, JSObject other) /*-{
		return self.untransform(other);
	}-*/;

	public static native JSObject untransform(JSObject self, JSObject other, double scale) /*-{
		return self.untransform(other, scale);
	}-*/;

}
