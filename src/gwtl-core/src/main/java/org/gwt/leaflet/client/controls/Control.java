package org.gwt.leaflet.client.controls;

import org.gwt.leaflet.client.jswraps.JSObject;
import org.gwt.leaflet.client.map.Map;
import org.gwt.leaflet.client.options.Options;

import com.google.gwt.dom.client.Element;

/**
 * <b>Base class for all Leaflet controls</b>
 * <p>
 * Implements IControl interface. You can add controls to the map like this:
 * 
 * <pre>
 * control.addTo(map);
 * // the same as
 * map.addControl(control);
 * </pre>
 * 
 * </p>
 * 
 * @author kengu
 * @author Lionel Leiva-Marcon
 * 
 * @see <a href="http://leaflet.cloudmade.com/reference.html#control">L.Control
 *      (Leaflet API)</a>
 */
public class Control extends IControl {

	protected Control(JSObject element) {
		super(element);
	}

	public Control(Options options) {
		this(ControlImpl.create(options.getJSObject()));
	}

	// --------------------------------------------------------
	// Control base implementation
	// --------------------------------------------------------

	/**
	 * Returns the current position of the control.
	 * 
	 * @return
	 */
	public String getPosition() {
		return ControlImpl.getPosition(getJSObject());
	};

	/**
	 * Sets the position of the control. See control positions.
	 * 
	 * @param position
	 */
	public void setPosition(String position) {
		ControlImpl.setPosition(getJSObject(), position);
	};

	/**
	 * Adds the control to the map.
	 * 
	 * @param map
	 */
	public void addTo(Map map) {
		ControlImpl.addTo(getJSObject(), map.getJSObject());
	}

	/**
	 * Removes the control from the map.
	 * 
	 * @param map
	 */
	public void removeFrom(Map map) { 
		ControlImpl.removeFrom(getJSObject(), map.getJSObject());
	}

	public void attribution(String text, Options options) {
		ControlImpl.attribution(text, options.getJSObject());
	}

	@Override
	public Element onAdd(Map map) {
		return ControlImpl.onAdd(map.getJSObject());
	}

	@Override
	public void onRemove(Map map) {
	}

}
