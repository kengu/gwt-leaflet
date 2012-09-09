package org.gwt.leaflet.impl.layers.raster;

import org.gwt.leaflet.api.jsutils.JSObject;

public class LTileLayerImpl  {

	public static native JSObject create(String url, JSObject options)/*-{				
		return new $wnd.L.tileLayer(url, options);
	}-*/;	
}
