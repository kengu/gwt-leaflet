package org.gwt.leaflet.impl.layers.raster;

import org.gwt.leaflet.api.LeafletException;
import org.gwt.leaflet.api.Options;
import org.gwt.leaflet.api.layers.raster.TileLayer;

import com.google.gwt.core.client.JavaScriptObject;

public class TileLayerImpl extends JavaScriptObject implements TileLayer {

	/**
	 * TileLayer overlay type constructor. 
	 */
	protected TileLayerImpl() { }

	public static final TileLayerImpl create(String url, Options options) throws LeafletException {				
		return nativeTile(url,Options.toJSO(options, TileLayer.DEFAULT));
	}
	
	private static final native TileLayerImpl nativeTile(String url, JavaScriptObject options) /*-{
		return $wnd.L.tileLayer(url, options);
	}-*/;
	
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
