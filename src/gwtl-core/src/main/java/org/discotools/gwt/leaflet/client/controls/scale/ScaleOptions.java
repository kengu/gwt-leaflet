package org.discotools.gwt.leaflet.client.controls.scale;

import org.discotools.gwt.leaflet.client.controls.ControlOptions;


/**
 * ControlScaleOptions class
 * @author Lionel Leiva-Marcon
 *
 */
public class ScaleOptions extends ControlOptions  {

	public ScaleOptions() {
		 super();
	}

	/**
	 * The position of the control (one of the map corners). 
	 * See control positions.
	 */
	public ScaleOptions setPosition(String position) {
		 return (ScaleOptions)setPosition(position);
	}

	/**
	 * The HTML text shown before the attributions. 
	 * Pass false to disable.
	 * @param prefix
	 */
	public ScaleOptions setMaxWidth(int value) {
		 return (ScaleOptions)setProperty("maxWidth", value);
	}

	/**
	 * Whether to show the metric scale line (m/km).
	 * @param value
	 */
	public ScaleOptions setMetric(boolean value) {
		return (ScaleOptions)setProperty("metric", value);
	}

	/**
	 * Whether to show the imperial scale line (mi/ft).
	 * @param value
	 */
	public ScaleOptions setImperal(boolean value) {
		return (ScaleOptions)setProperty("imperial", value);
	}

	/**
	 * If true, the control is updated on moveend, 
	 * otherwise it's always up-to-date (updated on move).
	 * @param value
	 */
	public ScaleOptions setUpdateWhenIdle(boolean value) {
		return (ScaleOptions)setProperty("updateWhenIdle", value);
	}

	
}
