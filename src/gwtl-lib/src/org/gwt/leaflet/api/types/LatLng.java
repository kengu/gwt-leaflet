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
package org.gwt.leaflet.api.types;

/**
 * @author kennethg
 *
 */
public interface LatLng {

	/**
	 * Latitude in degrees
	 * @return double
	 */
	double lat();
	
	/**
	 * Longitude in degrees.
	 * @return double
	 */
	double lon();
	
	/**
	 * Get distance (in meters) to the given {@link LatLng} 
	 * calculated using the Haversine formula. See description 
	 * on <a href="http://en.wikipedia.org/wiki/Haversine_formula">wikipedia</a>.
	 * @param other - calculate distance from this to other {@link LatLng}
	 * @return double
	 */
	double distanceTo(LatLng other);
	
	/**
	 * Check if the given LatLng point is at the same position (within a small margin of error).
	 * @param other - compare this to other {@link LatLng}
	 * @return boolean
	 */
	double equalTo(LatLng other);
	
	/**
	 * Get string representation of the point (for debugging purposes).
	 * @return String
	 */
	String toString();
}
