package org.gwt.leaflet.client.map;

import org.gwt.leaflet.client.controls.IControl;
import org.gwt.leaflet.client.jswraps.JSObject;
import org.gwt.leaflet.client.jswraps.JSObjectWrapper;
import org.gwt.leaflet.client.layers.ILayer;
import org.gwt.leaflet.client.options.Options;
import org.gwt.leaflet.client.types.LatLng;
import org.gwt.leaflet.client.types.LatLngBounds;

/**
 * The central class of the API — it is used to create a map on a page and manipulate it.
 * 
 * @author kennethg
 * @author Lionel Leiva-Marcon
 * 
 * @see <a href="http://leaflet.cloudmade.com/reference.html#map-class">L.Map (Leaflet API)</a>
 * 
 * @version 0.1 : Add of JSObjectWrapper Inheritance (inspired from GWT-OpenLayer) 
 */
public class Map extends JSObjectWrapper {

    protected Map(JSObject e) {
        super(e);
    }

    public Map(String name, Options options) {
        this(MapImpl.create(name, options.getJSObject()));
    } 
    
    public void setView(LatLng center, double zoom, boolean reset) {
    	MapImpl.setView(getJSObject(), center.getJSObject(), zoom, reset);
    }
    public void setZoom(double zoom) {
    	MapImpl.setZoom(getJSObject(), zoom);

    }
    public void zoomIn(){
    	MapImpl.zoomIn(getJSObject());
    	
    }
    public void zoomOut() {
    	MapImpl.zoomOut(getJSObject());
    }
    public void addLayer(ILayer layer, boolean bottom) {
    	MapImpl.addLayer(getJSObject(), layer.getJSObject(), bottom);
    }
    public void addLayer(ILayer layer) {
    	MapImpl.addLayer(getJSObject(), layer.getJSObject());
    }
    
    public void addControl(IControl control) {
    	MapImpl.addControl(getJSObject(), control.getJSObject());
    }
    
    public void fitBounds(LatLngBounds bounds) {
    	MapImpl.fitBounds(getJSObject(), bounds.getJSObject());		
	}


}
