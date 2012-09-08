package org.gwt.leaflet.api.crs;

import org.gwt.leaflet.api.LeafletException;
import org.gwt.leaflet.impl.crs.CRS;

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
