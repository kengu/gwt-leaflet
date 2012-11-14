package org.discotools.gwt.leaflet.client.util;

import org.discotools.gwt.leaflet.client.jsobject.JSObject;
import org.discotools.gwt.leaflet.client.types.Point;

public class TransformationImpl  {
	
	public static native JSObject create(double a, double b, double c, double d)/*-{
		return new $wnd.L.Transformation(a, b, c, d);
	}-*/;
	
	// --------------------------------------------------------
	// Transformation interface implementation
	// --------------------------------------------------------
	
	public static native Point transform(JSObject self, JSObject other) /*-{
		return self.transform(other);
	}-*/;

	public static native Point transform(JSObject self, JSObject other, double scale) /*-{
		return self.transform(other, scale);
	}-*/;

	public static native Point untransform(JSObject self, JSObject other) /*-{
		return self.untransform(other);
	}-*/;

	public static native Point untransform(JSObject self, JSObject other, double scale) /*-{
		return self.untransform(other, scale);
	}-*/;

}
