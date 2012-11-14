package org.discotools.gwt.leaflet.client.layers.vector;

import org.discotools.gwt.leaflet.client.events.handler.EventProvider;
import org.discotools.gwt.leaflet.client.jsobject.JSObject;
import org.discotools.gwt.leaflet.client.layers.ILayer;
import org.discotools.gwt.leaflet.client.map.Map;
import org.discotools.gwt.leaflet.client.popup.PopupOptions;
import org.discotools.gwt.leaflet.client.types.LatLng;
import org.discotools.gwt.leaflet.client.types.LatLngBounds;

/**
 * An abstract class that contains options and constants shared 
 * between vector overlays (Polygon, Polyline, Circle). 
 * 
 * Do not use it directly. 
 * 
 * @author Lionel Leiva-Marcon
 *
 */
public abstract class Path extends ILayer implements EventProvider {

	protected Path(JSObject jsObject) {
		super(jsObject);
	}

	/**
	 * Adds the layer to the map.
	 */
	public Path addTo(Map map) {
		PathImpl.addTo(getJSObject(), map.getJSObject());
		return this;
	}	
	
	/**
	 * Binds a popup with a particular HTML content to a click on this path.
	 */
	public  Path bindPopup(String htmlContent, PopupOptions options){
		PathImpl.bindPopup(getJSObject(), htmlContent, options.getJSObject());
		return this;
	}

	/**
	 * Opens the popup previously bound by the bindPopup method in the given point, or in one of the path's points if not specified.	
	 */
	public Path openPopup(LatLng latlng) {
		PathImpl.openPopup(getJSObject(), latlng.getJSObject());
		return this;
	} 	
	
	/**
	 * Changes the appearance of a Path based on the options in the Path options object.
	 */
	public Path setStyle(PathOptions options){
		PathImpl.setStyle(getJSObject(), options.getJSObject());
		return this;
	} 		 	
	
	/**
	 *  	Returns the LatLngBounds of the path.
	 */
	public LatLngBounds getBounds() {
		return new LatLngBounds(PathImpl.getBounds(getJSObject()));
	}

	/**
	 * Brings the layer to the top of all path layers.
	 */
	public Path bringToFront(){
		PathImpl.bringToFront(getJSObject());
		return this;
	}
	
	/**
	 * Brings the layer to the bottom of all path layers.
	 */
	public Path bringToBack(){
		PathImpl.bringToBack(getJSObject());
		return this;
	}
	
	
	/**
	 * Redraws the layer. Sometimes useful after you changed the coordinates that the path uses.
	 */
	public Path redraw() {
		PathImpl.redraw(getJSObject());
		return this;
	}
	
	
}
