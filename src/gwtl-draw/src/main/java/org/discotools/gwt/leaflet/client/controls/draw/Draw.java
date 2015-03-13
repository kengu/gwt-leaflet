package org.discotools.gwt.leaflet.client.controls.draw;

import org.discotools.gwt.leaflet.client.Options;
import org.discotools.gwt.leaflet.client.controls.Control;
import org.discotools.gwt.leaflet.client.map.Map;

/**
 * <b>Draw control interface</b>
 * <p>
 * A leaflet control that adds support for drawing and editing 
 * vectors and markers
 * 
 * @author Haley Boyd
 *
 */
public class Draw extends
		Control
{
	public Draw(
			Options options ) {
		super(
				DrawImpl.create(options.getJSObject()));
	}

	/**
	 * <b>Adds the control to the map</b>.
	 * @param map - {@link Map} instance
	 * @return {@link Control}
	 */
	@Override
	public Draw addTo(
			Map map ) {
		return (Draw) super.addTo(map);
	}
}
