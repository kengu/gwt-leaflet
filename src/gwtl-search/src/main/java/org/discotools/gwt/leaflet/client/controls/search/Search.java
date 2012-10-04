package org.discotools.gwt.leaflet.client.controls.search;

import org.discotools.gwt.leaflet.client.Options;
import org.discotools.gwt.leaflet.client.controls.Control;
import org.discotools.gwt.leaflet.client.map.Map;

/**
 * <b>Search control interface</b>
 * <p>
 * A leaflet control that search markers location by attribute, 
 * with ajax/jsonp autocomplete feature
 * 
 * @author Lionel Leiva-Marcon
 *
 */
public class Search extends Control {

	public Search(Options options) {
		super(SearchImpl.create(options.getJSObject()));
	}
	
	/**
	 * <b>Adds the control to the map</b>.
	 * @param map - {@link Map} instance
	 * @return {@link Control}
	 */
	@Override
	public Search addTo(Map map) {
		return (Search)super.addTo(map);
	}
}
