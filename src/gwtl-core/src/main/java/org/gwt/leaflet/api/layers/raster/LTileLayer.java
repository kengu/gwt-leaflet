package org.gwt.leaflet.api.layers.raster;

import org.gwt.leaflet.api.LOptions;
import org.gwt.leaflet.api.jsutils.JSObject;
import org.gwt.leaflet.api.layers.ILLayer;
import org.gwt.leaflet.impl.layers.raster.LTileLayerImpl;

/**
 * Used to load and display tile layers on the map.
 * 
 * @author kennethg
 * @author lionel leiva
 * 
 * @see <a href="http://leaflet.cloudmade.com/reference.html#tilelayer">L.TileLayer (Leaflet API)</a>
 *
 */
public class LTileLayer extends ILLayer {

	protected LTileLayer(JSObject element) {
		super(element);
	}

	public LTileLayer(String url, LOptions options) {
		this (LTileLayerImpl.create(url, options.getJSObject()));
	}
	
}
