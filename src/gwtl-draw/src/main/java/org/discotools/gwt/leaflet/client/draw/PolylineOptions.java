package org.discotools.gwt.leaflet.client.draw;

import org.discotools.gwt.leaflet.client.Options;

/**
 * 
 * @author Haley Boyd
 *
 */
public class PolylineOptions extends
		Options
{
	public PolylineOptions() {
		super();
	}

	/**
	 * Determines if line segments can cross.
	 * 
	 * @param allowIntersection
	 * @return
	 */
	public PolylineOptions setAllowIntersection(
			boolean allowIntersection ) {
		return (PolylineOptions) setProperty(
				"allowIntersection",
				allowIntersection);
	}

	/**
	 * Configuration options for the error that displays if an intersection is
	 * detected.
	 * 
	 * @param drawError
	 * @return
	 */
	public PolylineOptions setDrawError(
			DrawError drawError ) {
		return (PolylineOptions) setProperty(
				"drawError",
				drawError);
	}

	/**
	 * Distance in pixels between each guide dash.
	 * 
	 * @param guidelineDistance
	 * @return
	 */
	public PolylineOptions setGuidelineDistance(
			int guidelineDistance ) {
		return (PolylineOptions) setProperty(
				"guidelineDistance",
				guidelineDistance);
	}

	/**
	 * The options used when drawing the polyline/polygon on the map.
	 * 
	 * @param shapeOptions
	 * @return
	 */
	public PolylineOptions setShapeOptions(
			org.discotools.gwt.leaflet.client.layers.vector.PolylineOptions shapeOptions ) {
		return (PolylineOptions) setProperty(
				"shapeOptions",
				shapeOptions);
	}

	/**
	 * Determines which measurement system (metric or imperial) is used.
	 * 
	 * @param metric
	 * @return
	 */
	public PolylineOptions setMetric(
			boolean metric ) {
		return (PolylineOptions) setProperty(
				"metric",
				metric);
	}

	/**
	 * This should be a high number to ensure that you can draw over all other
	 * layers on the map.
	 * 
	 * @param zIndexOffset
	 * @return
	 */
	public PolylineOptions setZIndexOffset(
			int zIndexOffset ) {
		return (PolylineOptions) setProperty(
				"zIndexOffset",
				zIndexOffset);
	}

	/**
	 * Determines if the draw tool remains enabled after drawing a shape.
	 * 
	 * @param repeatMode
	 * @return
	 */
	public PolylineOptions setRepeatMode(
			boolean repeatMode ) {
		return (PolylineOptions) setProperty(
				"repeatMode",
				repeatMode);
	}

}
