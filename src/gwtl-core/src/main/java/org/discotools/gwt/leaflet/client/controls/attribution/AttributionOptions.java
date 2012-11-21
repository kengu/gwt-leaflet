package org.discotools.gwt.leaflet.client.controls.attribution;

import org.discotools.gwt.leaflet.client.controls.ControlOptions;


/**
 * ControlAttributionOptions class
 * @author Lionel Leiva-Marcon
 *
 */
public class AttributionOptions extends ControlOptions  {

	public AttributionOptions() {
		 super();
	}
	
	public AttributionOptions(String prefix, String position) {
		 super();
		 setPrefix(prefix);
		 setPosition(position);
	}
	

	/**
	 * The position of the control (one of the map corners). 
	 * See control positions.
	 */
	public AttributionOptions setPosition(String position) {
		 return (AttributionOptions)setProperty("position", position);
	}

	/**
	 * The HTML text shown before the attributions. 
	 * Pass false to disable.
	 * @param prefix
	 */
	public AttributionOptions setPrefix(String prefix) {
		return (AttributionOptions)setProperty("prefix", prefix);
	}

}
