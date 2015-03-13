package org.discotools.gwt.leaflet.client.marker;

import org.discotools.gwt.leaflet.client.Options;
import org.discotools.gwt.leaflet.client.events.handler.EventProvider;
import org.discotools.gwt.leaflet.client.jsobject.JSObject;
import org.discotools.gwt.leaflet.client.layers.ILayer;
import org.discotools.gwt.leaflet.client.map.Map;
import org.discotools.gwt.leaflet.client.types.Icon;
import org.discotools.gwt.leaflet.client.types.LatLng;



/**
 * Used to put markers on the map.
 * 
 * @author kennethg
 * @author Lionel Leiva-Marcon
 * 
 * @see <a href="http://leaflet.cloudmade.com/reference.html#marker">L.Marker (Leaflet API)</a>
 *
 */
public class Marker extends ILayer implements EventProvider {

	public Marker(JSObject element) {
		super(element);
	}

	public Marker(LatLng latlng, Options options) {
		this (MarkerImpl.create(latlng.getJSObject(), options.getJSObject()));
	}
 
	public LatLng getLatLng() {
		return new LatLng(MarkerImpl.getLatLng(getJSObject()));
	}
	
	public Marker setLatLng(LatLng latlng) {
		MarkerImpl.setLatLng(getJSObject(),latlng.getJSObject());
		return this;
	}
	
	public Marker setIcon(Icon icon) {
		MarkerImpl.setIcon(getJSObject(),icon.getJSObject());
		return this;
	}
	
	public Marker setZIndexOffset(int offset) {
		MarkerImpl.setZIndexOffset(getJSObject(),offset);
		return this;
	}
	
	public Marker setOpacity(double opacity) {
		MarkerImpl.setOpacity(getJSObject(),opacity);
		return this;
	}
	
	public Marker update() {
		MarkerImpl.update(getJSObject());
		return this;
	}
	
	public Marker addTo(Map map) {
		MarkerImpl.addTo(getJSObject(), map.getJSObject());
		return this;
	}
	
	public Marker bindPopup(String content) {
		MarkerImpl.bindPopup(getJSObject(), content, new Options().getJSObject());
		return this;
	}
	
	public Marker bindPopup(String content, Options options) {
		MarkerImpl.bindPopup(getJSObject(), content, options.getJSObject());
		return this;
	}
	
	public Marker unbindPopup() {
		MarkerImpl.unbindPopup(getJSObject());
		return this;
	}
	
	public Marker openPopup() {
		MarkerImpl.openPopup(getJSObject());
		return this;
	}
	
	public Marker closePopup() {
		MarkerImpl.closePopup(getJSObject());
		return this;
	}
}
