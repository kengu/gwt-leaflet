package org.gwt.leaflet.client.crs;

import org.gwt.leaflet.client.LeafletException;

/**
 * Leaflet {@link CRS} factory interface
 * 
 * @author kengu
 *
 */
public interface CRSFactory {

	/**
	 * Create {@link CRS} instance from given code
	 * @param code - {@link CRS} code
	 * @return {@link CRS}
	 */
	CRS create(String code) throws LeafletException;
	
	
	
}
