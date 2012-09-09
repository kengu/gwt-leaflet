package org.gwt.leaflet.api.layers.ui;

import org.gwt.leaflet.api.Options;
import org.gwt.leaflet.api.jsutils.JSObject;
import org.gwt.leaflet.api.jsutils.JSObjectWrapper;
import org.gwt.leaflet.api.map.Map;
import org.gwt.leaflet.api.types.LLatLng;
import org.gwt.leaflet.impl.layers.ui.MarkerImpl;



/**
 * Used to load and display tile layers on the map.
 * 
 * @author kennethg
 * 
 * @see <a href="http://leaflet.cloudmade.com/reference.html#tilelayer">L.TileLayer (Leaflet API)</a>
 *
 */
public class Marker  extends JSObjectWrapper {

	protected Marker(JSObject element) {
		super(element);
	}

	public Marker(LLatLng latlng) {
		this (MarkerImpl.create(latlng.getJSObject()));
	}

	public void addTo(String mapname) {
		MarkerImpl.addTo(getJSObject(), mapname);
	}

	@SuppressWarnings("serial")
	public final static Options DEFAULT = new Options(true){
		@Override
		protected void fill() {
			// TODO: Add required options (one at this point)
		}
	};
	
}
