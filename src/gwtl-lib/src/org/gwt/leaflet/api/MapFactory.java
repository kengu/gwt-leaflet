package org.gwt.leaflet.api;

import org.gwt.leaflet.api.types.Crs;
import org.gwt.leaflet.api.types.LatLng;

public interface MapFactory {

	/**
	 * Create {@link Crs} instance
	 * @param name a {@link Crs.EPSG_*} constant
	 * @return {@link Crs}
	 * @throws MapException
	 */
	public Crs newCrs(String name) throws MapException;

	/**
	 * Create {@link LatLng} instance.
	 * @param lat - Latitude
	 * @param lon - Longitude
	 * @return {@link LatLng}
	 * @throws MapException
	 */
	public LatLng newLatLng(double lat, double lon) throws MapException;
	
	/**
	 * Create {@link Map} instance
	 * @param name - used as identifies in html.
	 * @param options - {@link Options} instance
	 * @return {@link Map}
	 * @throws MapException
	 */
	public Map newMap(String name, Options options) throws MapException;
	
	/**
	 * Create {@link TileLayer} instance
	 * @param url - <a href="http://leaflet.cloudmade.com/reference.html#url-template">url template</a>
	 * @param options - {@link Options} instance
	 * @return {@link TileLayer}
	 * @throws MapException
	 */
	public TileLayer newTileLayer(String url, Options options) throws MapException;
	
	/**
	 * Create {@link WmsLayer} instance.
	 * @param url - Base url to WMS service, no parameters allowed
	 * @param options - {@link Options} instance, use this to add custom parameters to WMS requests.
	 * @return {@link WmsLayer}
	 * @throws MapException
	 */
	public WmsLayer newWmsLayer(String url, Options options) throws MapException;

	/**
	 * Create {@link Layers} instance.
	 * @param bases - {@link Options} instance with layer name to base {@link Layer} instance.
	 * @param overlays - {@link Options} instance with layer name to overlay {@link Layer} instance.
	 * @return {@link Layers}
	 * @throws MapException
	 */
	public Layers newLayers(Options bases, Options overlays) throws MapException;

	/**
	 * Create {@link Attribution} instance.
	 * @param prefix - Attribution prefix
	 * @param text - Attribution text
	 * @return {@link Attribution}
	 * @throws MapException
	 */
	public Attribution newAttribution(String prefix, String text) throws MapException;
	
}
