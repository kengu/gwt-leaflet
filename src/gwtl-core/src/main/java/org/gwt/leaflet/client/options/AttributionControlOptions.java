package org.gwt.leaflet.client.options;


/**
 * ControlAttributionOptions class
 * @author Lionel Leiva-Marcon
 *
 */
public class AttributionControlOptions extends ControlOptions  {

	public AttributionControlOptions() {
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
