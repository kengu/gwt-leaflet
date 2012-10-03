/********************************************************************
 * 
 * Control.java is part of gwtl-lib. 
 * 
 * Copyright (c) 2012, DISCO Foundation. All rights reserved.
 * 
 * gwtl-lib is free software: you can redistribute it and/or modify 
 * it under the terms of the GNU General Public License as published 
 * by the Free Software Foundation, either version 3 of the License, 
 * or (at your option) any later version.
 * 
 * gwtl-lib is distributed in the hope that it will be useful, but 
 * WITHOUT ANY WARRANTY; without even the implied warranty of 
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. 
 * 
 * See the GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License 
 * along with gwtl-lib. If not, see http://www.gnu.org/licenses.
 * 
 *********************************************************************/
package org.gwt.leaflet.client.controls;


import org.gwt.leaflet.client.js.JSObject;
import org.gwt.leaflet.client.js.JSObjectWrapper;
import org.gwt.leaflet.client.map.Map;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.user.client.Element;
import com.google.gwt.user.client.DOM;

/**
 * <b>Prototype interface for all controls</b>
 * 
 * Represents a UI element in one of the corners of the map.
 * 
 * @author Lionel Leiva-Marcon
 *
 * @see <a href="http://leaflet.cloudmade.com/reference.html#icontrol">IControl (Leaflet API)</a>
 */
public abstract class IControl extends JSObjectWrapper {
	
	protected IControl(JSObject jsObject) {
		super(jsObject);
	}

	/**
	 * <b>Add control to given {@link Map} instance</b>.
	 * <p>
	 * Should contain code that creates all the necessary {@link DOM} elements for the control, 
	 * adds listeners on relevant map events, and returns the element containing the control.
	 * <p>
	 * Called on {@link Map#addControl(ILControl)} or control.addTo(map).
	 * </p>
	 * @param map - {@link Map} instance
	 * @return {@link Element}
	 */
	public final Element onAdd(Map map) {
		return onAdd(map.getJSObject());
	}

	protected Element onAdd(JavaScriptObject map) {
		return IControlImpl.onAdd(getJSObject(), map);
	}
	
	/**
	 * <b>Remove control from given {@link Map} instance (optional)</b>
	 * <p>
	 * Should contain all clean up code (removes control's event listeners etc). 
	 * 
	 * Called on map.removeControl(control) or control.removeFrom(map). 
	 * The control's DOM container is removed automatically.
	 * 
	 * @param map -
	 */
	public final IControl onRemove(Map map) {
		return onRemove(map.getJSObject());
	}
	
	protected IControl onRemove(JavaScriptObject map) {
		IControlImpl.onRemove(getJSObject(), map);
		return this;
	}
	

}
