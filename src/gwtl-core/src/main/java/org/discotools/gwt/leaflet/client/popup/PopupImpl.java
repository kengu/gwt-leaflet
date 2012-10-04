package org.discotools.gwt.leaflet.client.popup;

import org.discotools.gwt.leaflet.client.jsobject.JSObject;

/**
 * {@link Popup} implementation.
 * 
 * @author Lionel Leiva-Marcon
 *
 */
public class PopupImpl  {

	public static native JSObject create(JSObject latlng, JSObject options)/*-{
		return new $wnd.L.Marker(latlng,options);
    }-*/;
		
	public static native JSObject addTo(JSObject self, JSObject map)/*-{
		return self.addTo(map);
	}-*/;

	public static native JSObject openOn(JSObject self, JSObject map)/*-{
		return self.openOn(map);
	}-*/;
	
	public static native JSObject setLatLng(JSObject self, JSObject latlng)/*-{
		return self.setLatLng(latlng);
	}-*/;
	
	public static native JSObject setContent(JSObject self, String htmlContent)/*-{
		return self.setContent(htmlContent);
	}-*/;
	
}

