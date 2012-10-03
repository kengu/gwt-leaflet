package org.gwt.leaflet.client.controls.zoom;

import org.gwt.leaflet.client.controls.ControlOptions;


/**
 * ControlZoomOptions class
 * @author Lionel Leiva-Marcon
 *
 */
public class ZoomOptions extends ControlOptions  {

	public ZoomOptions() {
		 super();
	}

	public void setPosition(String position) {
		 setProperty("position", position);
	}

}
