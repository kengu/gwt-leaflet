package org.gwt.leaflet.client.layer;

import org.gwt.leaflet.client.LeafletException;
import org.gwt.leaflet.client.Options;
import org.gwt.leaflet.client.layer.tile.TileLayer;
import org.gwt.leaflet.client.layer.tile.WmsLayer;

public interface LayerFactory {

	/**
	 * Create {@link TileLayer} instance
	 * @param url - <a href="http://leaflet.cloudmade.com/reference.html#url-template">url template</a>
	 * @param options - {@link Options} instance
	 * @return {@link TileLayer}
	 * @throws LeafletException
	 */
	public TileLayer tile(String url, Options options) throws LeafletException;
	
	/**
	 * Create {@link WmsLayer} instance.
	 * @param url - Base url to WMS service, no parameters allowed
	 * @param options - {@link Options} instance, use this to add custom parameters to WMS requests.
	 * @return {@link WmsLayer}
	 * @throws LeafletException
	 */
	public WmsLayer wms(String url, Options options) throws LeafletException;	
}
