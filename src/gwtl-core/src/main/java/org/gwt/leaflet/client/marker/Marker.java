package org.gwt.leaflet.client.marker;

import org.gwt.leaflet.client.Options;
import org.gwt.leaflet.client.jswraps.JSObject;
import org.gwt.leaflet.client.layers.ILayer;
import org.gwt.leaflet.client.map.Map;
import org.gwt.leaflet.client.types.LatLng;



/**
 * Used to load and display tile layers on the map.
 * 
 * @author kennethg
 * @author Lionel Leiva-Marcon
 * 
 * @see <a href="http://leaflet.cloudmade.com/reference.html#tilelayer">L.TileLayer (Leaflet API)</a>
 *
 */
public class Marker extends ILayer {

	protected Marker(JSObject element) {
		super(element);
	}

	public Marker(LatLng latlng, Options options) {
		this (MarkerImpl.create(latlng.getJSObject(), options.getJSObject()));
	}
 
	public void addTo(Map map) {
		MarkerImpl.addTo(getJSObject(), map.getJSObject());
	}
	
	public void bindPopup(String content) {
		MarkerImpl.bindPopup(getJSObject(), content);
	}
}
