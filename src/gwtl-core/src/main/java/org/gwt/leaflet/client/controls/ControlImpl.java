package org.gwt.leaflet.client.controls;

import org.gwt.leaflet.client.jswraps.JSObject;

/**
 * {@link ControlImpl} implementation.
 * 
 * @author Lionel Leiva-Marcon
 *
 */
public class ControlImpl  {

	public static native JSObject create(JSObject options)/*-{
		return new $wnd.L.control(options);
	}-*/;	
	 
	public static native JSObject customOnAdd(Control control, JSObject self)/*-{
		self.onAdd=function(map){
		  			return control.@org.gwt.leaflet.client.controls.Control::customOnAdd(Lcom/google/gwt/core/client/JavaScriptObject;)(map);
 		};
	}-*/;	
	
	public static native JSObject customOnRemove(Control control, JSObject self)/*-{
		self.onRemove=function(map){
	  			control.@org.gwt.leaflet.client.controls.Control::customOnRemove(Lcom/google/gwt/core/client/JavaScriptObject;)(map);
		};
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

	public static native JSObject  attribution(String text, JSObject options) /*-{
		// Create Attribution
		var a = $wnd.L.control.attribution(options);
		
		// Set prefix and text
		a.addAttribution(text);
		
		// Finished
		return a;	
	}-*/;
}
