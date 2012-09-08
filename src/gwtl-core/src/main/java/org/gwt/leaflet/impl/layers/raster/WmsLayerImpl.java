package org.gwt.leaflet.impl.layers.raster;

import org.gwt.leaflet.api.Options;
import org.gwt.leaflet.api.layers.raster.WmsLayer;

import com.google.gwt.core.client.JavaScriptObject;

public class WmsLayerImpl extends JavaScriptObject implements WmsLayer {

	/**
	 * WmsLayer overlay type constructor. 
	 */
	protected WmsLayerImpl() { }
	
	@Override
	public final native WmsLayer setLayers(String layers) /*-{	
		// Forward
		this.layers = layers; return this;
	}-*/;	

	@Override
	public final native WmsLayer setStyles(String styles) /*-{	
		// Forward
		this.styles = styles; return this;
	}-*/;	

	@Override
	public final native WmsLayer setFormat(String format) /*-{	
		// Forward
		this.format = format; return this;
	}-*/;	

	@Override
	public final native WmsLayer setTransparent(boolean isTransparent) /*-{	
		// Forward
		this.transparent = isTransparent; return this;
	}-*/;	

	@Override
	public final native WmsLayer setVersion(String version) /*-{	
		// Forward
		this.version = version; return this;
	}-*/;	
	
	@Override
	public final WmsLayer setOptions(Options options) {
		// Forward to JNI method
		return setOptions(Options.toJSO(options, WmsLayer.DEFAULT));
	}

	private final native WmsLayer setOptions(JavaScriptObject options) /*-{	
		
		// TODO: Implement in TileLayer (subclassing not allowed with JavaScriptObject)
				
		// Set options
		if(options.layers != undefined) this.layers = options.layers;
		if(options.styles != undefined) this.styles = options.styles;
		if(options.format != undefined) this.format = options.format;
		if(options.transparent != undefined) this.layers = options.transparent;
		if(options.version != undefined) this.layers = options.version;
		
		// Finished
		return this;
	}-*/;	
}
