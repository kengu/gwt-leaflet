package org.discotools.gwt.leaflet.client.controls;

import org.discotools.gwt.leaflet.client.jsobject.JSObject;

/**
 * {@link ControlImpl} implementation.
 * 
 * @author Lionel Leiva-Marcon
 *
 */
public class ControlImpl extends IControlImpl {

	public static native JSObject create(JSObject options)/*-{
		return $wnd.L.control(options);
	}-*/;	
	 
	public static native String getPosition(JSObject self) /*-{
		return self.getPosition();
    }-*/;


	public static native void setPosition(JSObject self,String position) /*-{		
		self.setPosition(position);
	}-*/;

	public static native void addTo(JSObject self, JSObject map)/*-{
		self.addTo(map);
	}-*/;

	public static native void removeFrom(JSObject self, JSObject map) /*-{
		self.removeFrom(map);		
	}-*/;

}
