package org.gwt.leaflet.client;

import org.gwt.leaflet.api.Layers;
import org.gwt.leaflet.api.Options;
import org.gwt.leaflet.api.TileLayer;

import com.google.gwt.core.client.JavaScriptObject;

public class TileLayerImpl extends JavaScriptObject implements TileLayer {

	/**
	 * TileLayer overlay type constructor. 
	 */
	protected TileLayerImpl() { }

	@Override
	public final Layers setOptions(Options options) {	
		// Forward to JNI method
		return setOptions(MapFactoryImpl.toJSO(options, TileLayer.DEFAULT));
	}

	private final native Layers setOptions(JavaScriptObject options) /*-{	
		
		// TODO: Implement method
		
		// Finished
		return this;
	}-*/;	
}
