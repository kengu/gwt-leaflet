package org.gwt.leaflet.client.layers.raster;

import org.gwt.leaflet.client.jswraps.JSObject;

/**
 * TileLayer implementation class
 * @author Lionel Leiva-Marcon
 *
 */
public class TileLayerImpl  {

	public static native JSObject create(String url, JSObject options)/*-{				
		return new $wnd.L.tileLayer(url, options);
	}-*/;	
}
