package org.gwt.leaflet.client.popup;

import org.gwt.leaflet.client.Options;
import org.gwt.leaflet.client.jsobject.JSObject;
import org.gwt.leaflet.client.layers.ILayer;
import org.gwt.leaflet.client.map.Map;
import org.gwt.leaflet.client.types.LatLng;



/**
 * Used to open popups in certain places of the map. Use {@link Map#openPopup} to open popups 
 * while making sure that only one popup is open at one time (recommended for usability), or use 
 * {@link Map#addLayer(ILayer)} to open as many as you want.
 * 
 * @author kennethg
 * @author Lionel Leiva-Marcon
 * 
 * @see <a href="http://leaflet.cloudmade.com/reference.html#popup">L.Popup (Leaflet API)</a>
 *
 */
public class Popup extends ILayer {

	protected Popup(JSObject element) {
		super(element);
	}

	public Popup(LatLng latlng, Options options) {
		this (PopupImpl.create(latlng.getJSObject(), options.getJSObject()));
	}
 
	public Popup addTo(Map map) {
		PopupImpl.addTo(getJSObject(), map.getJSObject());
		return this;
	}
	
	public Popup openOn(Map map) {
		PopupImpl.addTo(getJSObject(), map.getJSObject());
		return this;
	}
	
	public Popup setLatLng(LatLng latlng) {
		PopupImpl.setLatLng(getJSObject(),latlng.getJSObject());
		return this;
	}
	
	public Popup setContent(String htmlContent) {
		PopupImpl.setContent(getJSObject(),htmlContent);
		return this;
	}
}
