package org.discotools.gwt.leaflet.client.draw;

import org.discotools.gwt.leaflet.client.Options;

/**
 * The following options will allow you to configure the individual draw
 * handlers.
 * 
 * @author Haley Boyd
 *
 */
public class DrawOptions extends
		Options
{
	public DrawOptions() {
		super();
	}

	/**
	 * Polyline draw handler options. Set to false to disable handler.
	 * 
	 * @param polylineOptions
	 * @return
	 */
	public DrawOptions setPolylineOptions(
			PolylineOptions polylineOptions ) {
		return (DrawOptions) setProperty(
				"polyline",
				polylineOptions);
	}
	
	/**
	 * Polyline draw handler options. Set to false to disable handler.
	 * 
	 * @param polylineOptions
	 * @return
	 */
	public DrawOptions setPolylineOptions(
			boolean polylineOptions ) {
		return (DrawOptions) setProperty(
				"polyline",
				polylineOptions);
	}

	/**
	 * Polygon draw handler options. Set to false to disable handler.
	 * 
	 * @param polygonOptions
	 * @return
	 */
	public DrawOptions setPolygonOptions(
			PolygonOptions polygonOptions ) {
		return (DrawOptions) setProperty(
				"polygon",
				polygonOptions);
	}
	
	/**
	 * Polygon draw handler options. Set to false to disable handler.
	 * 
	 * @param polygonOptions
	 * @return
	 */
	public DrawOptions setPolygonOptions(
			boolean polygonOptions ) {
		return (DrawOptions) setProperty(
				"polygon",
				polygonOptions);
	}

	/**
	 * Rectangle draw handler options. Set to false to disable handler.
	 * 
	 * @param rectangleOptions
	 * @return
	 */
	public DrawOptions setRectangleOptions(
			RectangleOptions rectangleOptions ) {
		return (DrawOptions) setProperty(
				"rectangle",
				rectangleOptions);
	}
	
	/**
	 * Rectangle draw handler options. Set to false to disable handler.
	 * 
	 * @param rectangleOptions
	 * @return
	 */
	public DrawOptions setRectangleOptions(
			boolean rectangleOptions ) {
		return (DrawOptions) setProperty(
				"rectangle",
				rectangleOptions);
	}

	/**
	 * Circle draw handler options. Set to false to disable handler.
	 * 
	 * @param circleOptions
	 * @return
	 */
	public DrawOptions setCircleOptions(
			CircleOptions circleOptions ) {
		return (DrawOptions) setProperty(
				"circle",
				circleOptions);
	}
	
	/**
	 * Circle draw handler options. Set to false to disable handler.
	 * 
	 * @param circleOptions
	 * @return
	 */
	public DrawOptions setCircleOptions(
			boolean circleOptions ) {
		return (DrawOptions) setProperty(
				"circle",
				circleOptions);
	}

	/**
	 * Marker draw handler options. Set to false to disable handler.
	 * 
	 * @param markerOptions
	 * @return
	 */
	public DrawOptions setMarkerOptions(
			MarkerOptions markerOptions ) {
		return (DrawOptions) setProperty(
				"marker",
				markerOptions);
	}
	
	/**
	 * Marker draw handler options. Set to false to disable handler.
	 * 
	 * @param markerOptions
	 * @return
	 */
	public DrawOptions setMarkerOptions(
			boolean markerOptions ) {
		return (DrawOptions) setProperty(
				"marker",
				markerOptions);
	}
}
