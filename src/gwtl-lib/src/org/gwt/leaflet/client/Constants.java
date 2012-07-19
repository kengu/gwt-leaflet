/********************************************************************
 * 
 * Constants.java is part of SAR-Man. 
 * 
 * Copyright (c) 2012, DISCO Foundation. All rights reserved.
 * 
 * SAR-Man is free software: you can redistribute it and/or modify 
 * it under the terms of the GNU General Public License as published 
 * by the Free Software Foundation, either version 3 of the License, 
 * or (at your option) any later version.
 * 
 * SAR-Man is distributed in the hope that it will be useful, but 
 * WITHOUT ANY WARRANTY; without even the implied warranty of 
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. 
 * 
 * See the GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License 
 * along with SAR-Man. If not, see http://www.gnu.org/licenses.
 * 
 *********************************************************************/
package org.gwt.leaflet.client;

import org.gwt.leaflet.api.Options;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * This class defines named constants and value methods
 * 
 * @author kennethg
 *
 */
public class Constants extends JavaScriptObject {

	public static final double DEG_TO_RAD;
	
	public static final double RAD_TO_DEG;
	
	public static final double MAX_MARGIN;
	
	public static final Options MAP_OPTIONS;
	
	static {
		DEG_TO_RAD = getDegToRad();
		RAD_TO_DEG = getRadToDeg();
		MAX_MARGIN = getMaxMargin();
		MAP_OPTIONS = createMapOptions();
	}

	/**
	 * Map overlay type constructor. 
	 */
	protected Constants() { }
	
	public static native double getDegToRad() /*-{
	    return $wnd.L.LatLng.DEG_TO_RAD;
	}-*/;
	
	public static native double getRadToDeg() /*-{
	    return $wnd.L.LatLng.RAD_TO_DEG;
	}-*/;		
	
	public static native double getMaxMargin() /*-{
	    return $wnd.L.LatLng.MAX_MARGIN;
	}-*/;
	
	public static final Options createMapOptions() {
		Options options = new Options();
		return options;
	}
	
}
