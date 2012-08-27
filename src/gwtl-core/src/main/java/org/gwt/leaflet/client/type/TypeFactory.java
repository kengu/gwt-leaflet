package org.gwt.leaflet.client.type;

import org.gwt.leaflet.client.LeafletException;

/**
 * Leaflet Basic Type Factory Interface
 * 
 * @author kengu
 *
 */
public interface TypeFactory {

	/**
	 * Create {@link Point} instance.
	 * <p>
	 * @param x - coordinate in x-direction
	 * @param y - coordinate in y-direction
	 * @param round - Round coordinates
	 * @return {@link LatLng}
	 * @throws LeafletException
	 */
	public Point point(double x, double y, boolean round) throws LeafletException;
	
	/**
	 * Create {@link LatLng} instance.
	 * <p>
	 * @param lat - Latitude
	 * @param lon - Longitude
	 * @return {@link LatLng}
	 * @throws LeafletException
	 */
	public LatLng latlng(double lat, double lon) throws LeafletException;
	
	
}
