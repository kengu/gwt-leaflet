package org.gwt.leaflet.client.controls;

import org.gwt.leaflet.client.jswraps.JSObject;
import org.gwt.leaflet.client.map.Map;
import org.gwt.leaflet.client.options.Options;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.Element;

/**
 * <b>Base class for all Leaflet controls</b>
 * <p>
 * Implements IControl interface. You can add controls to the map like this:
 * 
 * <ul>
 * <li>control.addTo(map);
 * <li>map.addControl(control);
 * </ul>
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

	/**
	 * Default constructor
	 * @param options
	 */
	public Control(Options options) {
		this(options, false, false);
	}
	
	/**
	 * Advanced constructor
	 * When custom controls hqve to be create by extending this class, methods onAdd and onRemove
	 * must be defined.
	 * If your custom controls are not set in the library itself (ie scale, zoom),
	 * this is a very convenience constructor.
	 * @param options
	 * @param customOnAdd When true, allow to define a custom onAdd in children class
	 * @param customOnRemove When true, allow to define a custom onRemove in children class
	 */
	public Control(Options options, boolean customOnAdd, boolean customOnRemove) {
		this(ControlImpl.create(options.getJSObject()));
		if(customOnAdd) {
			ControlImpl.customOnAdd(this, getJSObject());
		}
		if(customOnRemove) {
			ControlImpl.customOnRemove(this, getJSObject());			
		}
		
	} 

	// --------------------------------------------------------
	// Custom implementations
	// --------------------------------------------------------
	
	/**
	 * Call by the ControlImpl::customOnAdd
	 * Should be overriden to create some custom layout
	 * @param map
	 * @return Element (generally a div element)
	 */
	public Element customOnAdd(JavaScriptObject map) {
		return null;
	}
	
	/**
	 * Call by the ControlImpl::customOnRemove
	 * Should be overriden to clean up the control
	 * @param map
	 */
	public void customOnRemove(JavaScriptObject map) {
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

}
