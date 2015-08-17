package org.discotools.gwt.leaflet.client.draw;

import org.discotools.gwt.leaflet.client.Options;

/**
 * 
 * @author Haley Boyd
 *
 */
public class CircleOptions extends
		Options
{
	public CircleOptions() {
		super();
	}

	/**
	 * The options used when drawing the circle on the map.
	 * 
	 * @param shapeOptions
	 * @return
	 */
	public CircleOptions setShapeOptions(
			org.discotools.gwt.leaflet.client.layers.vector.PathOptions shapeOptions ) {
		return (CircleOptions) setProperty(
				"shapeOptions",
				shapeOptions);
	}

	/**
	 * Determines if the draw tool remains enabled after drawing a shape.
	 * 
	 * @param repeatMode
	 * @return
	 */
	public CircleOptions setRepeatMode(
			boolean repeatMode ) {
		return (CircleOptions) setProperty(
				"repeatMode",
				repeatMode);
	}
}
