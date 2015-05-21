package org.discotools.gwt.leaflet.client.controls.crosshair;

import org.discotools.gwt.leaflet.client.Options;
import org.discotools.gwt.leaflet.client.controls.Control;
import org.discotools.gwt.leaflet.client.map.Map;

/**
 * <b>Crosshair control</bl>
 * <p>
 * A leaflet control that displays a crosshair in center of map and geographic
 * coordinates of the crosshair as the map is moved.
 *
 */
public class Crosshair extends
		Control
{
	public Crosshair(
			Options options ) {
		super(
				CrosshairImpl.create(options.getJSObject()));
	}

	/**
	 * <b>Adds the control to the map</b>.
	 *
	 * @param map
	 *            - {@link Map} instance
	 * @return {@link Control}
	 */
	@Override
	public Crosshair addTo(
			Map map ) {
		return (Crosshair) super.addTo(map);
	}
}
