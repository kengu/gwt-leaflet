package org.gwt.leaflet.client.controls;

import org.gwt.leaflet.client.jswraps.JSObject;

import com.google.gwt.dom.client.Element;

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
	
	
	public static native Element onAdd(JSObject map)/*-{
	    alert("OnAdd");
		// create the control container with a particular class name
        var container = L.DomUtil.create('div', 'my-custom-control');

        // ... initialize other DOM elements, add listeners, etc.

        return container;
	}-*/;


	public static native void onRemove(JSObject map)/*-{
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
