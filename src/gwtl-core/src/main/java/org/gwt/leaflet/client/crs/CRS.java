package org.gwt.leaflet.client.crs;

import org.gwt.leaflet.client.types.LatLng;
import org.gwt.leaflet.client.types.Point;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>Base {@link ICRS} implementation class</b>
 * <p>
 *  
 * @author kengu
 * 
 * @see @see <a href="http://leaflet.cloudmade.com/reference.html#icrs">L.CRS (Leaflet API)</a>
 *
 */
public class CRS extends JavaScriptObject implements ICRS {

	/**
	 * EPSG:4326 (Plate Carree), very popular among GIS enthusiasts.
	 */
	public static final String EPSG4326 = "EPSG:4326";
	
	/**
	 * EPSG:3857 (Spherical Mercator), used by most of commercial map providers (CloudMade, Google, Yahoo, Bing, etc.).
	 */
	public static final String EPSG3857 = "EPSG:3857";

	/**
	 * EPSG:3395 (True Mercator), used by some map providers.
	 */
	public static final String EPSG3395 = "EPSG:3395";
	
	/**
	 * A simple CRS that maps longitude and latitude into x and y directly. May be used for maps of flat surfaces (e.g. game maps).
	 */
	public static final String SIMPLE = "Simple";
	
	/**
	 * Natively supported CRS.
	 */
	public static final String[] EPSG = new String[]{
		EPSG4326, EPSG3857, EPSG3395, SIMPLE
	};
	
	// --------------------------------------------------------
	// JSNI (overlay) constructor
	// --------------------------------------------------------	
	
	/**
	 * CRS overlay type constructor. 
	 */
	protected CRS() { }
	
	// --------------------------------------------------------
	// ICRS interface implementation
	// --------------------------------------------------------	
	
	@Override
	public native final String getCode() /*-{
		return this.code;
	}-*/;
	 
	@Override
	public native final Point toPoint(LatLng coords, double zoom) /*-{
		return this.toPoint(coords,zoom);
	}-*/;
	
	@Override
	public native final Point project(LatLng coords) /*-{
		return this.project(coords,zoom);
	}-*/;
	
	@Override
	public native final LatLng toLatLng(Point point, double zoom) /*-{
		return this.toLatLng(point,zoom);
	}-*/;
	
	@Override
	public native final double scale(double zoom) /*-{
		return this.scale(zoom);
	}-*/;
	
	// --------------------------------------------------------
	// Default implementations
	// --------------------------------------------------------

	

}
