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

import com.google.gwt.core.client.JavaScriptObject;

/**
 * Represents a geographical point with a certain latitude and longitude.
 *  
 * @author kennethg
 *
 * @see <a href="http://leaflet.cloudmade.com/reference.html#latlng">L.LatLng (Leaflet API)</a>
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
	
	/**
	 * {@link LatLng} constants.
	 * 
	 * @author kennethg
	 *
	 */
	public final class Constants extends JavaScriptObject {

		public static final double DEG_TO_RAD;
		
		public static final double RAD_TO_DEG;
		
		public static final double MAX_MARGIN;
		
		static {
			DEG_TO_RAD = getDegToRad();
			RAD_TO_DEG = getRadToDeg();
			MAX_MARGIN = getMaxMargin();
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
	}	
}
