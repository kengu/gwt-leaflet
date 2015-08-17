package org.discotools.gwt.leaflet.client.controls.measure;

import org.discotools.gwt.leaflet.client.Options;
import org.discotools.gwt.leaflet.client.controls.Control;
import org.discotools.gwt.leaflet.client.map.Map;

public class Measure extends
		Control
{
	public Measure(
			Options options ) {
		super(
				MeasureImpl.create(options.getJSObject()));
	}

	/**
	 * <b>Adds the control to the map</b>.
	 * @param map - {@link Map} instance
	 * @return {@link Control}
	 */
	@Override
	public Measure addTo(
			Map map ) {
		return (Measure) super.addTo(map);
	}
}
