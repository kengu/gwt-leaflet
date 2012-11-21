package org.discotools.gwt.leaflet.client.controls;

import org.discotools.gwt.leaflet.client.Options;


/**
 * ControlOptions class
 * @author Lionel Leiva-Marcon
 *
 */
public class ControlOptions extends Options  {

	public ControlOptions() {
		super();
	}
	
	public ControlOptions(String position) {
		super();
		setPosition(position);
	}	

	public ControlOptions setPosition(String position) {
		 return (ControlOptions)setProperty("position", position);
	}

}
