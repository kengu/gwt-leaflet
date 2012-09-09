package org.gwt.leaflet.api.map;

import org.gwt.leaflet.api.LOptions;
import org.gwt.leaflet.api.controls.IControl;
import org.gwt.leaflet.api.jsutils.JSObject;
import org.gwt.leaflet.api.jsutils.JSObjectWrapper;
import org.gwt.leaflet.api.layers.ILLayer;
import org.gwt.leaflet.api.types.LLatLng;

/**
 * The central class of the API — it is used to create a map on a page and manipulate it.
 * 
 * @author kennethg
 * @author lionel leiva
 * 
 * @see <a href="http://leaflet.cloudmade.com/reference.html#map-class">L.Map (Leaflet API)</a>
 * 
 * @version 0.1 : Add of JSObjectWrapper Inheritance (inspired from GWT-OpenLayer) 
 */
public class LMap extends JSObjectWrapper {

    protected LMap(JSObject e) {
        super(e);
    }

    public LMap(String name, LOptions options) {
        this(LMapImpl.create(name, options.getJSObject()));
    }
    
    public void setView(LLatLng center, double zoom, boolean reset) {
    	LMapImpl.setView(getJSObject(), center.getJSObject(), zoom, reset);
    }
    public void setZoom(double zoom) {
    	LMapImpl.setZoom(getJSObject(), zoom);

    }
    public void zoomIn(){
    	LMapImpl.zoomIn(getJSObject());
    	
    }
    public void zoomOut() {
    	LMapImpl.zoomOut(getJSObject());
    }
    public void addLayer(ILLayer layer, boolean bottom) {
    	LMapImpl.addLayer(getJSObject(), layer.getJSObject(), bottom);
    }
    public void addLayer(ILLayer layer) {
    	LMapImpl.addLayer(getJSObject(), layer.getJSObject());
    }
    
    public void addControl(IControl control) {
    	LMapImpl.addControl(getJSObject(), control);
    }
    

}
