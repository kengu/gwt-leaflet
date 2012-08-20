package org.gwt.leaflet.client.impl;

import org.gwt.leaflet.api.Layer;
import org.gwt.leaflet.api.Layers;
import org.gwt.leaflet.api.Options;

import com.google.gwt.core.client.JavaScriptObject;

public class LayersImpl extends JavaScriptObject implements Layers {

	/**
	 * TileLayer overlay type constructor. 
	 */
	protected LayersImpl() { }

	@Override
	public final native Layers setCollapsed(boolean isCollapsed) /*-{	
		// Forward
		this.collapsed = isCollapsed; return this;
	}-*/;

	@Override
	public final Layers setOptions(Options options) {	
		// Forward to JNI method
		return setOptions(MapFactoryImpl.toJSO(options, Layers.DEFAULT));
	}

	private final native Layers setOptions(JavaScriptObject options) /*-{	
		
		// Set options
		if(options.collapsed != undefined) this.collapsed = options.collapsed;
		
		// Finished
		return this;
	}-*/;
		
	@Override
	public final native Layers addBaseLayer(Layer layer, String name) /*-{	
		// Forward
		this.addBaseLayer(layer,name); return this;
	}-*/;

	@Override
	public final native Layers addOverlay(Layer layer, String name) /*-{	
		// Forward
		this.addOverlay(layer,name); return this;
	}-*/;

	@Override
	public final native Layers removeLayer(String layer) /*-{	
		// Forward
		this.removeLayer(layer); return this;
	}-*/;

}
