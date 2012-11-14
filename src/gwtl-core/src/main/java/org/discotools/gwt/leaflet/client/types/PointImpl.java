package org.discotools.gwt.leaflet.client.types;

import org.discotools.gwt.leaflet.client.jsobject.JSObject;



/**
 * {@link Point} implementation.
 * 
 * @author kengu
 * @author Lionel Leiva-Marcon
 * @author David Ignjic
 *
 */
public class PointImpl {

	/**
	 * PointImpl overlay type constructor. 
	 */
	public static native JSObject create(double x, double y)/*-{
		return new $wnd.L.Point(x,y);
	}-*/;

	
	// --------------------------------------------------------
	// Point interface implementation
	// --------------------------------------------------------

	public static native double x(JSObject self) /*-{
		return self.x;
	}-*/;

	public static native double y(JSObject self) /*-{
		return self.y;
	}-*/;

	public static native double distanceTo(JSObject self,JSObject other) /*-{
		return self.distanceTo(other);
	}-*/;
	
	public static native JSObject add(JSObject self,JSObject other) /*-{
		return self.add(other);
	}-*/;

	public static native JSObject substract(JSObject self,JSObject other) /*-{
		return self.substract(other);
	}-*/;

	public static native JSObject multiply(JSObject self,double other) /*-{
		return self.multiply(other);
	}-*/;

	public static native JSObject divide(JSObject self,double other, boolean round) /*-{
		return self.divide(other,round);
	}-*/;

	public static native JSObject round(JSObject self) /*-{
		return self.round(other);
	}-*/;

	public static native JSObject clone(JSObject self) /*-{
		return self.clone();
	}-*/;

}
