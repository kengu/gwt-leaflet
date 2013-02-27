package org.discotools.gwt.leaflet.client.popup;

import org.discotools.gwt.leaflet.client.jsobject.JSObject;
import org.discotools.gwt.leaflet.client.layers.ILayer;
import org.discotools.gwt.leaflet.client.map.Map;
import org.discotools.gwt.leaflet.client.types.LatLng;

import com.google.gwt.dom.client.Element;



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

    /* TODO refactor to JavaScript Overlay Type*/
	public Popup(JSObject element) {
		super(element);
	}

	public Popup(PopupOptions options) {
		this (PopupImpl.create(options.getJSObject()));
	}
 
	public Popup addTo(Map map) {
		PopupImpl.addTo(getJSObject(), map.getJSObject());
		return this;
	}
	
	public Popup openOn(Map map) {
		PopupImpl.openOn(getJSObject(), map.getJSObject());
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

    public Popup setContent(Element htmlElement) {
        PopupImpl.setContent(getJSObject(),htmlElement);
        return this;
    }
	
	/* removed after refactoring */
    public boolean equalsPopup(Popup obj) {
        return obj.getJSObject().equals(getJSObject());
    }

	
}
