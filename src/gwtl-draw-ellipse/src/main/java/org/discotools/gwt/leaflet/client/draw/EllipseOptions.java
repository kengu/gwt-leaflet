package org.discotools.gwt.leaflet.client.draw;

import org.discotools.gwt.leaflet.client.Options;

/**
 *
 * @author Haley Boyd
 *
 */
public class EllipseOptions extends
		Options
{
	public EllipseOptions() {
		super();
	}

	/**
	 * The options used when drawing the circle on the map.
	 *
	 * @param shapeOptions
	 * @return
	 */
	public EllipseOptions setShapeOptions(
			org.discotools.gwt.leaflet.client.layers.vector.EllipseOptions shapeOptions ) {
		return (EllipseOptions) setProperty(
				"shapeOptions",
				shapeOptions);
	}

	/**
	 * Determines if the draw tool remains enabled after drawing a shape.
	 *
	 * @param repeatMode
	 * @return
	 */
	public EllipseOptions setRepeatMode(
			boolean repeatMode ) {
		return (EllipseOptions) setProperty(
				"repeatMode",
				repeatMode);
	}
}
