package org.gwt.leaflet.client.map;

import org.gwt.leaflet.client.LeafletException;
import org.gwt.leaflet.client.Options;

/**
 * Leaflet {@link Map} instance factory
 * 
 * @author kengu
 *
 */
public interface MapFactory {

	/**
	 * Create {@link Map} instance
	 * @param name - used as identifies in html.
	 * @param options - {@link Options} instance
	 * @return {@link Map}
	 * @throws LeafletException
	 */
	public Map create(String name, Options options) throws LeafletException;
	
}
