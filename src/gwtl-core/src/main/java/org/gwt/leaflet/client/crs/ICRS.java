/********************************************************************
 * 
 * CRS.java is part of gwtl-lib. 
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
package org.gwt.leaflet.client.crs;

import org.gwt.leaflet.client.js.JSObject;
import org.gwt.leaflet.client.js.JSObjectWrapper;
import org.gwt.leaflet.client.types.LatLng;
import org.gwt.leaflet.client.types.Point;
 
/**
 * <b>Leaflet CRS prototype interface</b>
 * <p>
 * Defines coordinate reference systems for projecting geographical points into pixel 
 * (screen) coordinates and back (and to coordinates in other units for WMS services). 
 * See <a href="http://en.wikipedia.org/wiki/Coordinate_reference_system">Spatial reference system</a>.
 * </p>
 * 
 * @author kennethg
 * 
 * @see <a href="http://leaflet.cloudmade.com/reference.html#icrs">ICRS (Leaflet API)</a>.
 */
public abstract class ICRS extends JSObjectWrapper{
	
	protected ICRS(JSObject jsObject) {
		super(jsObject);
	}

	/**
	 * Get name of this <a href="http://en.wikipedia.org/wiki/Spatial_reference_system">CRS</a>.
	 * <p>
	 * For example a <a href="http://spatialreference.org/ref/epsg/">EPSG code</a> or
	 * some other <a href="http://en.wikipedia.org/wiki/SRID">Spatial Reference ID</a>.
	 * </p> 
	 * @return String
	 */
	abstract String getCode();
	
	/**
	 * Projects geographical coordinates on a given zoom into pixel coordinates.
	 * <p>
	 * @param coords - {@link LatLng} instance
	 * @param zoom - Given map zoom
	 * @return {@link #Point}
	 */
	abstract Point toPoint(LatLng coords, double zoom);
	
	/**
	 * <b>Projects geographical coordinates into coordinates in units accepted for this CRS</b> 
	 * <p>
	 * For example meters for EPSG:3857, for passing it to WMS services.
	 * </p>
	 * @param coords - {@link LatLng} instance
	 * @return {@link #Point}
	 */
	abstract Point project(LatLng coords);
	
	/**
	 * <b>The inverse of {@link #toPoint(LatLng, double)}</b>. 
	 * <p>
	 * Projects pixel coordinates on a given zoom into geographical coordinates.
	 * </p>
	 * @param point {@link #Point} instance 
	 * @param zoom
	 * @return {@link LatLng}
	 */
	abstract LatLng toLatLng(Point point, double zoom);
	
	/**
	 * <b>Returns the scale used when transforming projected coordinates into pixel coordinates for a particular zoom</b>. 
	 * <p>
	 * For example, it returns 256 * 2^zoom for Mercator-based CRS.
	 * </p>
	 * @param zoom - Given map zoom
	 * @return double
	 */
	abstract double scale(double zoom);
	
	
}
