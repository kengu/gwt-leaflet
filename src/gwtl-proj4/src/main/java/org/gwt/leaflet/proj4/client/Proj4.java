package org.gwt.leaflet.proj4.client;

import org.gwt.leaflet.client.crs.CRS;
import org.gwt.leaflet.client.math.ScaleFunction;
import org.gwt.leaflet.client.math.Transformation;

import com.google.gwt.core.client.GWT;

public interface Proj4 {
	
	static Proj4 INSTANCE = GWT.create(Proj4.class);

	CRS crs(String code, Transformation transition);
	
	CRS crs(String code, Transformation transition, ScaleFunction scale);
	
	CRS crs(String code, String definition, Transformation transition);
	
	CRS crs(String code, String definition, Transformation transition, ScaleFunction scale);
	
}
