package org.gwt.leaflet.client.controls.attribution;

import org.gwt.leaflet.client.js.JSObject;

/**
 * <p>Leaflet layer switcher control implementation</p>
 * 
 * @author Lionel Leiva-Marcon
 *
 */
public class AttributionImpl  {

	public static native JSObject create(String text, JSObject options) /*-{
		// Create Attribution
		var a = $wnd.L.control.attribution(options);
		
		// Set prefix and text
		a.addAttribution(text);
		
		// Finished
		return a;	
	}-*/;
	
	public static native void setPrefix(JSObject self, String text) /*-{	
		return self.setPrefix(text);
	}-*/;	
	
	public static native void addAttribution(JSObject self, String text) /*-{	
		return self.addAttribution(text);
	}-*/;	

	public static native void removeAttribution(JSObject self, String text) /*-{	
		return self.addAttribution(text);
	}-*/;	
}
