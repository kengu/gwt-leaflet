package org.gwt.leaflet.client.layers.vector;

import org.gwt.leaflet.client.jswraps.JSObject;
import org.gwt.leaflet.client.jswraps.JSObjectWrapper;
import org.gwt.leaflet.client.map.Map;
import org.gwt.leaflet.client.options.Options;
import org.gwt.leaflet.client.types.LatLng;

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
	public abstract void addTo(Map map);	
	/**
	 * Binds a popup with a particular HTML content to a click on this path.
	 */
	public abstract  void bindPopup(String htmlContent, Options options); 	
	/**
	 * Opens the popup previously bound by the bindPopup method in the given point, or in one of the path's points if not specified.
	
	 */
	public abstract  void openPopup(LatLng latlng); 	 
	/**
	 * Changes the appearance of a Path based on the options in the Path options object.
	 */
	public abstract  void setStyle(Options object); 	 	
	/**
	 *  	Returns the LatLngBounds of the path.
	 */
	//TODO
	//public abstract LagetBounds(); 	

	/**
	 * Brings the layer to the top of all path layers.
	 */
	public abstract  void bringToFront();
	/**
	 * Brings the layer to the bottom of all path layers.
	 */
	public abstract  void bringToBack();
	/**
	 * Redraws the layer. Sometimes useful after you changed the coordinates that the path uses.
	 */
	public abstract  void redraw();
	
	
}
