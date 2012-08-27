package org.gwt.leaflet.client.layer.impl;

import org.gwt.leaflet.client.LeafletException;
import org.gwt.leaflet.client.Options;
import org.gwt.leaflet.client.layer.LayerFactory;
import org.gwt.leaflet.client.layer.tile.TileLayer;
import org.gwt.leaflet.client.layer.tile.WmsLayer;
import org.gwt.leaflet.client.layer.tile.impl.TileLayerImpl;
import org.gwt.leaflet.client.layer.tile.impl.WmsLayerImpl;

import com.google.gwt.core.client.JavaScriptObject;

public class LayerFactoryImpl implements LayerFactory {


	@Override
	public TileLayerImpl tile(String url, Options options) throws LeafletException {				
		return nativeTile(url,Options.toJSO(options, TileLayer.DEFAULT));
	}
	
	private static final native TileLayerImpl nativeTile(String url, JavaScriptObject options) /*-{
	
		// Create tile layer
		return $wnd.L.tileLayer(url, options);
	
	}-*/;

	@Override
	public WmsLayerImpl wms(String url, Options options) throws LeafletException {				
		return nativeWms(url,Options.toJSO(options, WmsLayer.DEFAULT));
	}
	
	
	private static final native WmsLayerImpl nativeWms(String url, JavaScriptObject options) /*-{
	
		// Create tile layer
		return $wnd.L.tileLayer.wms(url, options);
	
	}-*/;
}
