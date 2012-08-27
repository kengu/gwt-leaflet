package org.gwt.leaflet.client.map;

import org.gwt.leaflet.client.Options;
import org.gwt.leaflet.client.control.IControl;
import org.gwt.leaflet.client.layer.ILayer;
import org.gwt.leaflet.client.type.LatLng;

/**
 * The central class of the API — it is used to create a map on a page and manipulate it.
 * 
 * @author kennethg
 * 
 * @see <a href="http://leaflet.cloudmade.com/reference.html#map-class">L.Map (Leaflet API)</a>
 *
 */
public interface Map {
	
	/**
	 * Default {@link Map} options.
	 */
	@SuppressWarnings("serial")
	public final static Options DEFAULT = new Options(true){
		@Override protected void fill() {
			// TODO: Add required options (one at this point)
		}
	};
	
	/**
	 * Get {@link Map} name
	 * @return String
	 */
	String getName();
	
	/**
	 * <b>Sets the view of the map (geographical center and zoom)</b>. 
	 * <p>
	 * If reset is set to <code>true</code>, the map is reloaded even 
	 * if it's eligible for pan or zoom animation (false by default).
	 * <p>
	 * @param center - center {@link LatLng} coordinate.
	 * @param zoom - zoom level.
	 * @param reset - if <code>true</code>, reload map.
	 * @return {@link Map}
	 */
	Map setView(LatLng center, double zoom, boolean reset);
	
	/**
	 * Sets the zoom of the map. 
	 * @param center - center {@link LatLng} coordinate.
	 * @return {@link Map}
	 */
	Map setZoom(double zoom);

	/**
	 * Increases the zoom of the map by 1. 
	 * @return {@link Map}
	 */
	Map zoomIn();
	
	/**
	 * Decreases the zoom of the map by 1. 
	 * @return {@link Map}
	 */
	Map zoomOut();
	
	/**
	 * <b>Adds the given layer to the map</b>. 
	 * <p> 
	 * The layer is inserted above all others.
	 * <p> 
	 * @param layer - {@link ILayer} to add 
	 * @param bottom - id <code>true</code>, the layer is inserted under all others
	 * @return {@link Map}
	 */
	Map addLayer(ILayer layer);
	
	/**
	 * <b>Adds the given layer to the map</b>. 
	 * <p> 
	 * If Bottom is set to <code>true</code>, the layer is inserted under 
	 * all others (useful when switching base tile layers).
	 * <p> 
	 * @param layer - {@link ILayer} to add 
	 * @param bottom - id <code>true</code>, the layer is inserted under all others
	 * @return {@link Map}
	 */
	Map addLayer(ILayer layer, boolean bottom);
	
	/**
	 * <b>Adds the given control to the map</b>. 
	 * @param control - {@link IControl} to add 
	 * @return {@link Map}
	 */
	Map addControl(IControl control);
	
}
