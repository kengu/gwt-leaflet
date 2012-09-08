package org.gwt.leaflet.api.controls;

import org.gwt.leaflet.api.Options;
import org.gwt.leaflet.api.controls.Control.Position;
import org.gwt.leaflet.api.map.Map;

/**
 * <b>Scale control interface</b>
 * <p>
 * A simple scale control that shows the scale of the current 
 * center of screen in metric (m/km) and imperial (mi/ft) systems. 
 * <p>
 * <b>Options</b>
 * <nl>
 * <li>{@link #POSITION}</li>
 * <li>{@link #MAX_WIDTH}</li>
 * <li>{@link #METRIC}</li>
 * <li>{@link #IMPERIAL}</li>
 * <li>{@link #UPDATE_WHEN_IDLE}</li>
 * </nl>
 * </p>
 * 
 * @author kennethg
 *
 * @see <a href="http://leaflet.cloudmade.com/reference.html#control-scale">L.Control.Scale (Leaflet API)</a>
 */
public interface Scale extends Control {

	/**
	 * The initial position of the control (one of the map corners).
	 * <p>
	 * Default: {@link Position#BOTTOM_LEFT}.
	 */
	public static final String POSITION = "position";
	
	/**
	 * Maximum width of the control in pixels. The width is set dynamically to show round values (e.g. 100, 200, 500).
	 * <p>
	 * DEFAULT: <code>100</code>
	 */
	final static String MAX_WIDTH = "maxWidth";

	/**
	 * Whether to show the metric scale line (m/km).
	 * <p>
	 * DEFAULT: <code>true</code>
	 */
	final static String METRIC = "metric";
	
	/**
	 * Whether to show the imerial scale line (mi/ft).
	 * <p>
	 * DEFAULT: <code>true</code>
	 */
	final static String IMPERIAL = "imperial";
	
	/**
	 * If <code>true</code>, the control is updated on 'moveend', otherwise it's always up-to-date (updated on move).
	 * <p>
	 * DEFAULT: <code>false</code>
	 */
	final static String UPDATE_WHEN_IDLE = "updateWhenIdle";
	
	
	/**
	 * Default {@link Options}.
	 */
	@SuppressWarnings("serial")
	public final static Options DEFAULT = new Options(true){
		@Override protected void fill() {
			put(POSITION, Position.TOP_RIGHT.getLiteral());
			put(MAX_WIDTH, 100);
			put(METRIC, true);
			put(IMPERIAL, true);
			put(UPDATE_WHEN_IDLE, false);
		}
	};
	
	/**
	 * <b>Adds the control to the map</b>.
	 * <p>
	 * <b>NOTE</b>: Set map center and zoom first.
	 * </p>
	 * @param map - {@link Map} instance
	 * @return {@link Control}
	 */
	Control addTo(Map map);	
	
}
