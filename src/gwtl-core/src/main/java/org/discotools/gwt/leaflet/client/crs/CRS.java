package org.discotools.gwt.leaflet.client.crs;

import org.discotools.gwt.leaflet.client.types.LatLng;
import org.discotools.gwt.leaflet.client.types.Point;

/**
 * <b>Base {@link ICRS} implementation class</b>
 * <p>
 * 
 * @author kengu
 * @author Lionel Leiva-Marcon
 * 
 * @see @see <a href="http://leaflet.cloudmade.com/reference.html#icrs">L.CRS
 *      (Leaflet API)</a>
 * 
 */
public class CRS extends ICRS {

	/**
	 * EPSG:4326 (Plate Carree), very popular among GIS enthusiasts.
	 */
	public static final String EPSG4326 = "EPSG:4326";

	/**
	 * EPSG:3857 (Spherical Mercator), used by most of commercial map providers
	 * (CloudMade, Google, Yahoo, Bing, etc.).
	 */
	public static final String EPSG3857 = "EPSG:3857";

	/**
	 * EPSG:3395 (True Mercator), used by some map providers.
	 */
	public static final String EPSG3395 = "EPSG:3395";

	/**
	 * A simple CRS that maps longitude and latitude into x and y directly. May
	 * be used for maps of flat surfaces (e.g. game maps).
	 */
	public static final String SIMPLE = "Simple";

	/**
	 * Natively supported CRS.
	 */
	public static final String[] EPSG = new String[] { EPSG4326, EPSG3857,
			EPSG3395, SIMPLE };

	/**
	 * CRS overlay type constructor.
	 */
	protected CRS(String code){
		super(CRSImpl.create(code));
	}
	
	@Override
	String getCode() {
		return CRSImpl.getCode();
	}

	@Override
	Point toPoint(LatLng coords, double zoom) {
		return CRSImpl.toPoint(coords, zoom);
	}

	@Override
	Point project(LatLng coords) {
		return CRSImpl.project(coords);
	}

	@Override
	LatLng toLatLng(Point point, double zoom) {
		return CRSImpl.toLatLng(point, zoom);
	}

	@Override
	double scale(double zoom) {
		return CRSImpl.scale(zoom);
	}
}
