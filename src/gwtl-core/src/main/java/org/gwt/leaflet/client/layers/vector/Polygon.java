package org.gwt.leaflet.client.layers.vector;

import org.gwt.leaflet.client.jswraps.JSObject;
import org.gwt.leaflet.client.jswraps.JSObjectArray;
import org.gwt.leaflet.client.map.Map;
import org.gwt.leaflet.client.options.Options;
import org.gwt.leaflet.client.types.LatLng;

/**
 * A class for drawing polygon overlays on a map. 
 * Extends Polyline. 
 * Use Map#addLayer to add it to the map.
 * Note that points you pass when creating a polygon shouldn't have 
 * an additional last point equal to the first one,it's better to filter out 
 * such points.
 * 
 * @author Lionel Leiva-Marcon
 *
 */
public class Polygon extends Polyline{
  
	/**
	 * Constructor used for inheritance
	 * @param object
	 */
	public Polygon(JSObject object) {
 		super(object);
	} 

	/**
	 * Default constructor
	 * @param latlngs
	 * @param options
	 */
	public Polygon(LatLng[] latlngs, Options options) {
 		super(PolygonImpl.create(new JSObjectArray(latlngs).getJSObject(), options.getJSObject()));
	} 

//	@Override
//	public void addTo(Map map) {
//		PolygonImpl.addTo(getJSObject(), map.getJSObject());		
//	}	
}
