package org.discotools.gwt.leaflet.client.controls.coordinates;

import org.discotools.gwt.leaflet.client.controls.ControlOptions;

/**
 *
 * @author Haley Boyd
 *
 */
public class CoordinatesOptions extends
		ControlOptions
{
	public CoordinatesOptions() {
		super();
	}

	/**
	 * optional default 4
	 *
	 * @param decimals
	 */
	public void setDecimals(
			int decimals ) {
		getJSObject().setProperty(
				"decimals",
				decimals);
	}

	/**
	 * optional default "."
	 *
	 * @param decimalSeperator
	 */
	public void setDecimalSeperator(
			String decimalSeperator ) {
		getJSObject().setProperty(
				"decimalSeperator",
				decimalSeperator);
	}

	/**
	 * optional default "Lat: {y}"
	 *
	 * @param labelTemplateLat
	 */
	public void setLabelTemplateLat(
			String labelTemplateLat ) {
		getJSObject().setProperty(
				"labelTemplateLat",
				labelTemplateLat);
	}

	/**
	 * optional default "Lng: {x}"
	 *
	 * @param labelTemplateLng
	 */
	public void setLabelTemplateLng(
			String labelTemplateLng ) {
		getJSObject().setProperty(
				"labelTemplateLng",
				labelTemplateLng);
	}

	/**
	 * optional default true
	 *
	 * @param enableUserInput
	 */
	public void setEnableUserInput(
			boolean enableUserInput ) {
		getJSObject().setProperty(
				"enableUserInput",
				enableUserInput);
	}

	/**
	 * optional default false
	 *
	 * @param useDMS
	 */
	public void setUseDMS(
			boolean useDMS ) {
		getJSObject().setProperty(
				"useDMS",
				useDMS);
	}

	/**
	 * ordering of labels, default false-> lng-lat
	 *
	 * @param useLatLngOrder
	 */
	public void setUseLatLngOrder(
			boolean useLatLngOrder ) {
		getJSObject().setProperty(
				"useLatLngOrder",
				useLatLngOrder);
	}

}
