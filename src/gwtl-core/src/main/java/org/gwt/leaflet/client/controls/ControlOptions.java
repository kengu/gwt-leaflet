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

	public ControlOptions setPosition(String position) {
		 return (ControlOptions)setProperty("position", position);
	}

}
