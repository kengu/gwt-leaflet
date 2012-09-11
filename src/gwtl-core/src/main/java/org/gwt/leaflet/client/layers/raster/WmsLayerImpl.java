package org.gwt.leaflet.client.layers.raster;

import org.gwt.leaflet.client.jswraps.JSObject;

/**
 * WmsLayer implementation class
 * @author Lionel Leiva-Marcon
 * 
 */
public class WmsLayerImpl  {

	public static native JSObject create(String url, JSObject options)/*-{				
		return new $wnd.L.tileLayer(url, options);
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
	
	public static native JSObject setOptions(JSObject self, JSObject options) /*-{	
		// Set options
		if(options.layers != undefined) self.layers = options.layers;
		if(options.styles != undefined) self.styles = options.styles;
		if(options.format != undefined) self.format = options.format;
		if(options.transparent != undefined) self.layers = options.transparent;
		if(options.version != undefined) self.layers = options.version;
		
		// Finished
		return self;
	}-*/;	
}
