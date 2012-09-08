package org.gwt.leaflet.impl.layers;

import org.gwt.leaflet.api.LeafletException;
import org.gwt.leaflet.api.Options;
import org.gwt.leaflet.api.layers.LayerFactory;
import org.gwt.leaflet.api.layers.raster.TileLayer;
import org.gwt.leaflet.api.layers.raster.WmsLayer;
import org.gwt.leaflet.impl.layers.raster.TileLayerImpl;
import org.gwt.leaflet.impl.layers.raster.WmsLayerImpl;

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
