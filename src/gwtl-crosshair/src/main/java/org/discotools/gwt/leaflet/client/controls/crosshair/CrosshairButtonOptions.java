package org.discotools.gwt.leaflet.client.controls.crosshair;

import org.discotools.gwt.leaflet.client.controls.ControlOptions;

public class CrosshairButtonOptions extends
		ControlOptions
{
	public CrosshairButtonOptions() {
		super();
		getJSObject().setProperty(
				"text",
				"Show Crosshair");
	}

	/**
	 * Sets crosshair button text. Default is "Show Crosshair"
	 *
	 * @param text
	 */
	public void setText(
			String text ) {
		getJSObject().setProperty(
				"text",
				text);
	}

	/**
	 * Required. Sets options for crosshair control such as position.
	 *
	 * @param crosshairOptions
	 */
	public void setCrosshairOptions(
			ControlOptions crosshairOptions ) {
		getJSObject().setProperty(
				"crosshairOptions",
				crosshairOptions.getJSObject());
	}

}
