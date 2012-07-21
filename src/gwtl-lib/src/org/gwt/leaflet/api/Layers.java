/********************************************************************
 * 
 * Layers.java is part of SAR-Man.
 * 
 * Copyright (c) 2012, DISCO Foundation. All rights reserved.
 * 
 * SAR-Man is free software: you can redistribute it and/or modify it under the
 * terms of the GNU General Public License as published by the Free Software
 * Foundation, either version 3 of the License, or (at your option) any later
 * version.
 * 
 * SAR-Man is distributed in the hope that it will be useful, but WITHOUT ANY
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR
 * A PARTICULAR PURPOSE.
 * 
 * See the GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License along with
 * SAR-Man. If not, see http://www.gnu.org/licenses.
 * 
 *********************************************************************/
package org.gwt.leaflet.api;

/**
 * Layers control interface.
 * 
 * This interface gives users the ability to switch between different base layers 
 * and switch overlays on/off). It should be created and added explicitly to 
 * the map using {@link Map#addControl}.
 * 
 * <b>Options</b>
 * 
 * 
 * 
 * @author kennethg
 *
 * @see <a href="http://leaflet.cloudmade.com/reference.html#control-layers">L.Control.Layers (Leaflet API)</a>
 */
public interface Layers extends Control {
	
	final static String COLLAPSED = "collapsed";
	
	@SuppressWarnings("serial")
	public final static Options DEFAULT = new Options(true){
		@Override void fill() {
			// TODO: Add required options (one at this point)
		}
	};
	
	/**
	 * Set <em>collapsed</em> option.
	 * @param isCollapsed 
	 * @return {@link Layers}
	 */
	Layers setCollapsed(boolean isCollapsed);
	
	/**
	 * Modify options in one operation.
	 * @param options {@link Options} instance.
	 * @return {@link Layers}
	 */
	Layers setOptions(Options options);
	
	/**
	 * Adds a base layer (radio button entry) with the given name to the control.
	 * @param layer {@link Layer} instance
	 * @param name {@link Layer} name
	 * @return {@link Layers}
	 */
	Layers addBaseLayer(Layer layer, String name);
	
	/**
	 * Adds an overlay (checkbox entry) with the given name to the control.
	 * @param layer {@link Layer} instance
	 * @param name {@link Layer} name
	 * @return {@link Layers}
	 */
	Layers addOverlay(Layer layer, String name);
	
	/**
	 * Remove the given layer from the control.
	 * @param layer {@link Layer} instance
	 * @return {@link Layers}
	 */
	Layers removeLayer(String layer);

}
