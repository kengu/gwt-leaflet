package org.discotools.gwt.leaflet.client.example;

import org.discotools.gwt.leaflet.client.controls.ControlOptions;

public class CrosshairCheckboxOptions extends
		ControlOptions
{
	public CrosshairCheckboxOptions() {
		super();
	}
	
	/**
	 * Required. Sets options for coordiantes control such as position.
	 * 
	 * @param crosshairOptions
	 */
	public void setCrosshairOptions(
			ControlOptions crosshairOptions) {
		getJSObject().setProperty(
				"crosshairOptions",
				crosshairOptions.getJSObject());
	}
}
