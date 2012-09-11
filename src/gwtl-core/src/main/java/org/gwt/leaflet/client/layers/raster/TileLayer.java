package org.gwt.leaflet.client.layers.raster;

import org.gwt.leaflet.client.jswraps.JSObject;
import org.gwt.leaflet.client.layers.ILayer;
import org.gwt.leaflet.client.options.Options;

/**
 * Used to load and display tile layers on the map.
 * 
 * @author kennethg
 * @author Lionel Leiva-Marcon
 * 
 * @see <a href="http://leaflet.cloudmade.com/reference.html#tilelayer">L.TileLayer (Leaflet API)</a>
 *
 */
public class TileLayer extends ILayer {

	protected TileLayer(JSObject element) {
		super(element);
	}

	public TileLayer(String url, Options options) {
		this (TileLayerImpl.create(url, options.getJSObject()));
	}
	
}
