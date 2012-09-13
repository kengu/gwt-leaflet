package org.gwt.leaflet.client.options;


/**
 * ControlScaleOptions class
 * @author Lionel Leiva-Marcon
 *
 */
public class ScaleControlOptions extends ControlOptions  {

	public ScaleControlOptions() {
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
	public void setMaxWidth(int value) {
		 setProperty("maxWidth", value);
	}

	/**
	 * Whether to show the metric scale line (m/km).
	 * @param value
	 */
	public void setMetric(boolean value) {
		 setProperty("metric", value);
	}

	/**
	 * Whether to show the imerial scale line (mi/ft).
	 * @param value
	 */
	public void setImeral(boolean value) {
		 setProperty("imerial", value);
	}

	/**
	 * If true, the control is updated on moveend, 
	 * otherwise it's always up-to-date (updated on move).
	 * @param value
	 */
	public void setUpdateWhenIdle(boolean value) {
		 setProperty("updateWhenIdle", value);
	}

	
}
