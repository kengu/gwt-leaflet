package org.gwt.leaflet.proj4.client.impl;

import org.gwt.leaflet.client.crs.CRS;
import org.gwt.leaflet.client.util.Transformation;
import org.gwt.leaflet.proj4.client.Proj4;
import org.gwt.leaflet.proj4.client.ScaleFunction;

public final class Proj4Impl implements Proj4 {

	@Override
	public CRS crs(String code, Transformation transformation) {
		return crs(code, null, transformation);
	}
	
	@Override
	public CRS crs(String code, Transformation transformation, ScaleFunction scale) {
		return crs(code, null, transformation, scale);
	}
	
	@Override
	public CRS crs(String code, String definition, Transformation transformation) {
		return crs(code, definition, transformation, ScaleFunction.IDENTITY);
	}

	@Override
	public native CRS crs(String code, String definition, 
			Transformation transformation, ScaleFunction scale) /*-{
		
		// Create L.CRS instance
		var crs = $wnd.L.CRS.proj4js(code,definition,transformation);
		
		// Set scale function (required by Leaflet v.0.0.4)
		crs.scale = scale;
			
		// Finished
		return crs;
		
	}-*/;

}
