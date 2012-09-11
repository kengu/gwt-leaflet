package org.gwt.leaflet.client.options;


/**
 * ControlZoomOptions class
 * @author Lionel Leiva-Marcon
 *
 */
public class ZoomControlOptions extends ControlOptions  {

	public ZoomControlOptions() {
		 super();
	}

	public void setPosition(String position) {
		 setProperty("position", position);
	}

}
