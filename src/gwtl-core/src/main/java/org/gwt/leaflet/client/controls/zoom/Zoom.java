package org.gwt.leaflet.client.controls.zoom;

import org.gwt.leaflet.client.Options;
import org.gwt.leaflet.client.controls.Control;
import org.gwt.leaflet.client.map.Map;

/**
 * <b>Scale control interface</b>
 * <p>
 * A basic zoom control with two buttons (zoom in and zoom out). 
 * It is put on the map by default unless you set its zoomControl 
 * option to false. 
 * <p>
 * <b>Options</b>
 * <nl>
 * <li>{@link #POSITION}</li>
 * </nl>
 * </p>
 * 
 * @author kennethg
 * @author Lionel Leiva-Marcon
 *
 * @see <a href="http://leaflet.cloudmade.com/reference.html#control-zoom">L.Control.Zoom (Leaflet API)</a>
 */
public class Zoom extends Control {
	
	public Zoom(Options options) {
		super(ZoomImpl.create(options.getJSObject()));
	}
	
	/**
	 * <b>Adds the control to the map</b>.
	 * <p>
	 * <b>NOTE</b>: Set map center and zoom first.
	 * </p>
	 * @param map - {@link Map} instance
	 * @return {@link Control}
	 */
	public void addTo(Map map) {
		ZoomImpl.addTo(getJSObject(), map.getJSObject());
	}

}
