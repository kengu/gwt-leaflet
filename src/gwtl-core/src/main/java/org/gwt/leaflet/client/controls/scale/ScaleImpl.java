package org.gwt.leaflet.client.controls.scale;

import org.gwt.leaflet.client.jswraps.JSObject;

/**
 * {@link ScaleImpl} implementation.
 * 
 * @author Lionel Leiva-Marcon
 *
 */
public class ScaleImpl  {

	public static native JSObject create(JSObject options)/*-{
		return new $wnd.L.control.scale(options);
	}-*/;
		
	public static native String getPosition(JSObject self) /*-{
		return self.getPosition();
    }-*/;


	public static native JSObject setPosition(JSObject self,String position) /*-{		
		self.setPosition(position);
	}-*/;

	public static native JSObject addTo(JSObject self, JSObject map)/*-{
		return self.addTo(map);
	}-*/;

	public static native JSObject removeFrom(JSObject self,JSObject map) /*-{		
		self.removeFrom(map);
	}-*/;	

}
