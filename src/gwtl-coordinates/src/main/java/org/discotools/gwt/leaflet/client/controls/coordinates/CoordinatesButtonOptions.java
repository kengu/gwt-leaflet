package org.discotools.gwt.leaflet.client.controls.coordinates;

import org.discotools.gwt.leaflet.client.controls.ControlOptions;

/**
 *
 * @author Haley Boyd
 *
 */
public class CoordinatesButtonOptions extends
		ControlOptions
{
	public CoordinatesButtonOptions() {
		super();
		getJSObject().setProperty(
				"text",
				"Track Cursor");
	}

	/**
	 * Sets coordinates button text.
	 * Default is "Track Cursor"
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
	 * Required. Sets options for coordinates control such as position.
	 *
	 * @param coordinatesOptions
	 */
	public void setCoordinatesOptions(
			ControlOptions coordinatesOptions ) {
		getJSObject().setProperty(
				"coordinatesOptions",
				coordinatesOptions.getJSObject());
	}

}
