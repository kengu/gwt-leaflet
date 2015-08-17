package org.discotools.gwt.leaflet.client.controls.coordinates;

import org.discotools.gwt.leaflet.client.Options;
import org.discotools.gwt.leaflet.client.controls.Control;
import org.discotools.gwt.leaflet.client.map.Map;


/**
 * <b>Coordinates control interface</b>
 * <p>
 * A leaflet control that displays geographic coordinates of the mouse
 * pointer, as it is moved about the map.
 *
 * @author Haley Boyd
 *
 */
public class Coordinates extends
		Control
{
	public Coordinates(
			Options options ) {
		super(
				CoordinatesImpl.create(options.getJSObject()));
	}

	/**
	 * <b>Adds the control to the map</b>.
	 *
	 * @param map
	 *            - {@link Map} instance
	 * @return {@link Control}
	 */
	@Override
	public Coordinates addTo(
			Map map ) {
		return (Coordinates) super.addTo(map);
	}
}
