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
package org.gwt.leaflet.api.types;

/**
 * Used to define a coordinate reference system (CRS).
 * 
 * @author kennethg
 *
 */
public interface Crs {
	
	/**
	 * EPSG:4326 (Plate Carree), very popular among GIS enthusiasts.
	 */
	public static final String EPSG_4326 = "EPSG:4326";
	
	/**
	 * EPSG:3857 (Spherical Mercator), used by most of commercial map providers (CloudMade, Google, Yahoo, Bing, etc.).
	 */
	public static final String EPSG_3857 = "EPSG:3857";

	/**
	 * EPSG:3395 (True Mercator), used by some map providers.
	 */
	public static final String EPSG_3395 = "EPSG:3395";
	
	/**
	 * Natively supported CRS.
	 */
	public static final String[] EPSG = new String[]{
		EPSG_4326, EPSG_3857, EPSG_3395
	};

	/**
	 * Get name of this <a href="http://en.wikipedia.org/wiki/Spatial_reference_system">CRS</a>. 
	 * @return String
	 */
	String getName();
	
	/**
	 * Get <a href="http://spatialreference.org/ref/epsg/">EPSG code</a> .
	 * @return String
	 */
	String getEPSG();

	/**
	 * 
	 * Get <a href="http://en.wikipedia.org/wiki/SRID">Spatial Reference ID</a>. 
	 * @return int
	 */
	int getSRID();

}
