package org.gwt.leaflet.client.controls;

import org.gwt.leaflet.client.Options;


/**
 * ControlOptions class
 * @author Lionel Leiva-Marcon
 *
 */
public class ControlOptions extends Options  {

	public ControlOptions() {
		 super();
	}

	public void setPosition(String position) {
		 setProperty("position", position);
	}

}
