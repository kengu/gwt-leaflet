package org.gwt.leaflet.client.layers.vector;

import org.gwt.leaflet.client.Options;
import org.gwt.leaflet.client.js.JSObject;
import org.gwt.leaflet.client.js.JSObjectWrapper;
import org.gwt.leaflet.client.map.Map;
import org.gwt.leaflet.client.types.LatLng;
import org.gwt.leaflet.client.types.LatLngBounds;

/**
 * An abstract class that contains options and constants shared 
 * between vector overlays (Polygon, Polyline, Circle). 
 * 
 * Do not use it directly. 
 * 
 * @author Lionel Leiva-Marcon
 *
 */
public abstract class Path extends JSObjectWrapper{

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
	public  Path bindPopup(String htmlContent, Options options){
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
	public Path setStyle(Options options){
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
