package org.gwt.leaflet.api;

import org.gwt.leaflet.api.types.LatLng;

public interface MapFactory {

	public LatLng newLatLng(double lat, double lon) throws MapException;
	
	public Map newMap(String name, Options options) throws MapException;
	
	public TileLayer newTileLayer(String url, Options options) throws MapException;
}
