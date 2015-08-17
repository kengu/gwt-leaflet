package org.discotools.gwt.leaflet.client.draw;

import org.discotools.gwt.leaflet.client.Options;
import org.discotools.gwt.leaflet.client.types.Icon;

/**
 * 
 * @author Haley Boyd
 *
 */
public class MarkerOptions extends
		Options
{
	public MarkerOptions() {
		super();
	}

	public MarkerOptions setIcon(
			Icon icon ) {
		return (MarkerOptions) setProperty(
				"icon",
				icon);
	}

	/**
	 * This should be a high number to ensure that you can draw over all other
	 * layers on the map.
	 * 
	 * @param zIndexOffset
	 * @return
	 */
	public MarkerOptions setZIndexOffset(
			int zIndexOffset ) {
		return (MarkerOptions) setProperty(
				"zIndexOffset",
				zIndexOffset);
	}

	/**
	 * Determines if the draw tool remains enabled after drawing a shape.
	 * 
	 * @param repeatMode
	 * @return
	 */
	public MarkerOptions setRepeatMode(
			boolean repeatMode ) {
		return (MarkerOptions) setProperty(
				"repeatMode",
				repeatMode);
	}
}
