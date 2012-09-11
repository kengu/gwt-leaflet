package org.gwt.leaflet.client.layers.vector;

import org.gwt.leaflet.client.jswraps.JSObjectArray;
import org.gwt.leaflet.client.map.Map;
import org.gwt.leaflet.client.options.Options;
import org.gwt.leaflet.client.types.LatLng;

/**
 * An abstract class that contains options and constants shared 
 * between vector overlays (Polygon, Polyline, Circle). 
 * 
 * Do not use it directly. 
 * 
 * @author Lionel Leiva-Marcon
 *
 */
public class Polyline extends Path{
 
	public Polyline(LatLng[] latlngs, Options options) {
 		super(PolylineImpl.create(new JSObjectArray(latlngs).getJSObject(), options.getJSObject()));
	} 

	@Override
	public void addTo(Map map) {
		PolylineImpl.addTo(getJSObject(), map.getJSObject());		
	}

	@Override
	public void bindPopup(String htmlContent, Options options) {
		PolylineImpl.bindPopup(getJSObject(), htmlContent, options.getJSObject());		
	}

	@Override
	public void openPopup(LatLng latlng) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setStyle(Options object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void bringToFront() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void bringToBack() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void redraw() {
		// TODO Auto-generated method stub
		
	}
	
}
