package org.discotools.gwt.leaflet.client.layers.raster;

import org.discotools.gwt.leaflet.client.jsobject.JSObject;
import org.discotools.gwt.leaflet.client.layers.ILayerImpl;

/**
 * TileLayer implementation class
 * @author Lionel Leiva-Marcon
 *
 */
public class TileLayerImpl extends ILayerImpl {

	public static native JSObject create(String url, JSObject options)/*-{				
		return new $wnd.L.tileLayer(url, options);
	}-*/;
	
}
