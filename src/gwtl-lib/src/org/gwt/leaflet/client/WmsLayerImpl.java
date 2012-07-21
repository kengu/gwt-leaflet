package org.gwt.leaflet.client;

import org.gwt.leaflet.api.Layers;
import org.gwt.leaflet.api.Options;
import org.gwt.leaflet.api.WmsLayer;

import com.google.gwt.core.client.JavaScriptObject;

public class WmsLayerImpl extends JavaScriptObject implements WmsLayer {

	/**
	 * WmsLayer overlay type constructor. 
	 */
	protected WmsLayerImpl() { }
	
	@Override
	public final native Layers setLayers(String layers) /*-{	
		// Forward
		this.layers = layers; return this;
	}-*/;	

	@Override
	public final native Layers setStyles(String styles) /*-{	
		// Forward
		this.styles = styles; return this;
	}-*/;	

	@Override
	public final native Layers setFormat(String format) /*-{	
		// Forward
		this.format = format; return this;
	}-*/;	

	@Override
	public final native Layers setTransparent(boolean isTransparent) /*-{	
		// Forward
		this.transparent = isTransparent; return this;
	}-*/;	

	@Override
	public final native Layers setVersion(String version) /*-{	
		// Forward
		this.version = version; return this;
	}-*/;	
	
	@Override
	public final Layers setOptions(Options options) {
		// Forward to JNI method
		return setOptions(MapFactoryImpl.toJSO(options, WmsLayer.DEFAULT));
	}

	private final native Layers setOptions(JavaScriptObject options) /*-{	
		
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
