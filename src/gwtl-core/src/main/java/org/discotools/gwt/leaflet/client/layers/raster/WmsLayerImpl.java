package org.discotools.gwt.leaflet.client.layers.raster;

import org.discotools.gwt.leaflet.client.jsobject.JSObject;
import org.discotools.gwt.leaflet.client.layers.ILayerImpl;

/**
 * WmsLayer implementation class
 * @author Lionel Leiva-Marcon
 * 
 */
public class WmsLayerImpl extends ILayerImpl {

	public static native JSObject create(String url, JSObject options)/*-{				
		return new $wnd.L.tileLayer.wms(url, options);
	}-*/;	
	
	public static native JSObject setLayers(JSObject self, String layers) /*-{	
		self.layers = layers; 
		return self;
	}-*/;	

	public static native JSObject setStyles(JSObject self, String styles) /*-{	
		self.styles = styles; 
		return self;
	}-*/;	

	public static native JSObject setFormat(JSObject self, String format) /*-{	
		self.format = format;
		return self;
	}-*/;	

	public static native JSObject setTransparent(JSObject self, boolean isTransparent) /*-{	
		self.transparent = isTransparent; 
		return self;
	}-*/;	

	public static native JSObject setVersion(JSObject self, String version) /*-{	
		self.version = version; 
		return self;
	}-*/;	
	
}
