package org.discotools.gwt.leaflet.client.layers.raster;

import org.discotools.gwt.leaflet.client.Options;
import org.discotools.gwt.leaflet.client.jsobject.JSObject;
import org.discotools.gwt.leaflet.client.layers.ILayer;

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
	
	/**
	 * Modify options in one operation.
	 * @param options {@link Options} instance.
	 * @return {@link TileLayer}
	 */
	public TileLayer setOptions(Options options) {
		return (TileLayer)super.setOptions(options);
	}
		
}
