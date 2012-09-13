package org.gwt.leaflet.client.controls.search;

import org.gwt.leaflet.client.controls.Control;
import org.gwt.leaflet.client.map.Map;
import org.gwt.leaflet.client.options.Options;

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
	public void addTo(Map map) {
		SearchImpl.addTo(getJSObject(), map.getJSObject());
	}
}
