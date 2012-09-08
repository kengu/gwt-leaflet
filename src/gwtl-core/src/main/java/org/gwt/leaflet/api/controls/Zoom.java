package org.gwt.leaflet.api.controls;

import org.gwt.leaflet.api.Options;
import org.gwt.leaflet.api.controls.Control.Position;

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
 *
 * @see <a href="http://leaflet.cloudmade.com/reference.html#control-zoom">L.Control.Zoom (Leaflet API)</a>
 */
public interface Zoom extends Control {
	
	/**
	 * The initial position of the control (one of the map corners).
	 * <p>
	 * Default: {@link Position#TOP_LEFT}.
	 */
	public static final String POSITION = "position";
	
	/**
	 * Default {@link Options}.
	 */
	@SuppressWarnings("serial")
	public final static Options DEFAULT = new Options(true){
		@Override protected void fill() {
			put(POSITION, Position.TOP_LEFT.getLiteral());
		}
	};
}
