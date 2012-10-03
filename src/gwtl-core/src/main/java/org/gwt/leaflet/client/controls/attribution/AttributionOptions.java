package org.gwt.leaflet.client.controls.attribution;

import org.gwt.leaflet.client.controls.ControlOptions;


/**
 * ControlAttributionOptions class
 * @author Lionel Leiva-Marcon
 *
 */
public class AttributionOptions extends ControlOptions  {

	public AttributionOptions() {
		 super();
	}

	/**
	 * The position of the control (one of the map corners). 
	 * See control positions.
	 */
	public void setPosition(String position) {
		 setProperty("position", position);
	}

	/**
	 * The HTML text shown before the attributions. 
	 * Pass false to disable.
	 * @param prefix
	 */
	public void setPrefix(String prefix) {
		 setProperty("prefix", prefix);
	}

}
