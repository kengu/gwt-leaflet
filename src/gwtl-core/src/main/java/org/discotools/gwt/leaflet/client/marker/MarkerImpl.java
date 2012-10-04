package org.discotools.gwt.leaflet.client.marker;

import org.discotools.gwt.leaflet.client.jsobject.JSObject;

/**
 * {@link Marker} implementation.
 * 
 * @author Lionel Leiva-Marcon
 *
 */
public class MarkerImpl  {

	public static native JSObject create(JSObject latlng, JSObject options)/*-{
		return new $wnd.L.Marker(latlng,options);
    }-*/;
		
	public static native JSObject addTo(JSObject self, JSObject map)/*-{
		return self.addTo(map);
	}-*/;

	public static native JSObject getLatLng(JSObject self)/*-{
		return self.getLatLng();
	}-*/;
	
	public static native void setLatLng(JSObject self, JSObject latlng)/*-{
		self.setLatLng(latlng);
	}-*/;
	
	public static native void setIcon(JSObject self, JSObject icon)/*-{
		self.setIcon(icon);
	}-*/;
	
	public static native void setZIndexOffset(JSObject self, int offset)/*-{
		self.setZIndexOffset(offset);
	}-*/;
	
	public static native void setOpacity(JSObject self, double opacity)/*-{
		return self.setOpacity(opacity);
	}-*/;
	
	public static native void update(JSObject self)/*-{
		self.update();
	}-*/;

	public static native void bindPopup(JSObject self, String content, JSObject options)/*-{
		self.bindPopup(content,options);
	}-*/;
	
	public static native void unbindPopup(JSObject self)/*-{
		self.unbindPopup();
	}-*/;
	
	public static native void openPopup(JSObject self)/*-{
		self.openPopup();
	}-*/;
	
	public static native void closePopup(JSObject self)/*-{
		self.closePopup();
	}-*/;
}

