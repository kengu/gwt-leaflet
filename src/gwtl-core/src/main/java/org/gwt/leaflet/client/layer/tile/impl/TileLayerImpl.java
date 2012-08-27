package org.gwt.leaflet.client.layer.tile.impl;

import org.gwt.leaflet.client.Options;
import org.gwt.leaflet.client.layer.tile.TileLayer;

import com.google.gwt.core.client.JavaScriptObject;

public class TileLayerImpl extends JavaScriptObject implements TileLayer {

	/**
	 * TileLayer overlay type constructor. 
	 */
	protected TileLayerImpl() { }

	@Override
	public final TileLayer setOptions(Options options) {	
		// Forward to JNI method
		return setOptions(Options.toJSO(options, TileLayer.DEFAULT));
	}

	private final native TileLayer setOptions(JavaScriptObject options) /*-{	
		
		// TODO: Implement method
		
		// Finished
		return this;
	}-*/;	
}
