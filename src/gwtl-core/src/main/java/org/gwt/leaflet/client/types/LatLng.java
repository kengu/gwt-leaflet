/********************************************************************
 * 
 * LatLng.java is part of SAR-Man. 
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
package org.gwt.leaflet.client.types;

import org.gwt.leaflet.client.jsobject.JSObject;
import org.gwt.leaflet.client.jsobject.JSObjectWrapper;

/**
 * Represents a geographical point with a certain latitude and longitude.
 *  
 * @author kennethg
 * @author Lionel Leiva-Marcon
 *
 * @see <a href="http://leaflet.cloudmade.com/reference.html#latlng">L.LatLng (Leaflet API)</a>
 *
 */
public class LatLng extends JSObjectWrapper {

	public LatLng(JSObject element) {
		super(element); 
	}
	
	public LatLng(double lon, double lat) {
		this (LatLngImpl.create(lon, lat));
	}
	
	public double lng() {
		return LatLngImpl.lng(getJSObject());
	}

	public double lat() {
		return LatLngImpl.lat(getJSObject());
	}
	
	public String toString() {
		return "["+LatLngImpl.lat(getJSObject())+","+LatLngImpl.lng(getJSObject())+"]";
	}
}
