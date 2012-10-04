package org.discotools.gwt.leaflet.client.controls.scale;

import org.discotools.gwt.leaflet.client.Options;
import org.discotools.gwt.leaflet.client.controls.Control;
import org.discotools.gwt.leaflet.client.map.Map;

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
 * @author Lionel Leiva-Marcon
 *
 * @see <a href="http://leaflet.cloudmade.com/reference.html#control-scale">L.Control.Scale (Leaflet API)</a>
 */
public class Scale extends Control {

	public Scale(Options options) {
		super(ScaleImpl.create(options.getJSObject()));
	}	

	/**
	 * <b>Adds the control to the map</b>.
	 * <p>
	 * <b>NOTE</b>: Set map center and zoom first.
	 * </p>
	 * @param map - {@link Map} instance
	 * @return {@link Control}
	 */
	public Scale addTo(Map map) {
		return (Scale)super.addTo(map);
	}
	
	@Override
	public Scale setPosition(String position) {
		return (Scale)super.setPosition(position);
	}

	@Override
	public Scale removeFrom(Map map) {
		return (Scale)super.removeFrom(map);
	}

}
