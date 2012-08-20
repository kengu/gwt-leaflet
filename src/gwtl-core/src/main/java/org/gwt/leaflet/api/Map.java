package org.gwt.leaflet.api;

import org.gwt.leaflet.api.types.LatLng;

/**
 * The central class of the API — it is used to create a map on a page and manipulate it.
 * 
 * @author kennethg
 * 
 * @see <a href="http://leaflet.cloudmade.com/reference.html#map-class">L.Map (Leaflet API)</a>
 *
 */
public interface Map {
	
	@SuppressWarnings("serial")
	public final static Options DEFAULT = new Options(true){
		@Override void fill() {
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
	 * @param layer - {@link Layer} to add 
	 * @param bottom - id <code>true</code>, the layer is inserted under all others
	 * @return {@link Map}
	 */
	Map addLayer(Layer layer);
	
	/**
	 * <b>Adds the given layer to the map</b>. 
	 * <p> 
	 * If Bottom is set to <code>true</code>, the layer is inserted under 
	 * all others (useful when switching base tile layers).
	 * <p> 
	 * @param layer - {@link Layer} to add 
	 * @param bottom - id <code>true</code>, the layer is inserted under all others
	 * @return {@link Map}
	 */
	Map addLayer(Layer layer, boolean bottom);
	
	/**
	 * <b>Adds the given control to the map</b>. 
	 * @param control - {@link Control} to add 
	 * @return {@link Map}
	 */
	Map addControl(Control control);
	
}
