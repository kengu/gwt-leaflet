package org.discotools.gwt.leaflet.client.draw;

import org.discotools.gwt.leaflet.client.Options;

/**
 * 
 * @author Haley Boyd
 *
 */
public class RectangleOptions extends
		Options
{
	public RectangleOptions() {
		super();
	}

	/**
	 * The options used when drawing the rectangle on the map.
	 * 
	 * @param shapeOptions
	 * @return
	 */
	public RectangleOptions setShapeOptions(
			org.discotools.gwt.leaflet.client.layers.vector.PathOptions shapeOptions ) {
		return (RectangleOptions) setProperty(
				"shapeOptions",
				shapeOptions);
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
