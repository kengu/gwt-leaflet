package org.discotools.gwt.leaflet.client.events;

import org.discotools.gwt.leaflet.client.jsobject.JSObject;
import org.discotools.gwt.leaflet.client.types.LatLng;
import org.discotools.gwt.leaflet.client.types.LatLngBounds;

/**
 * 
 * @author David Ignjic
 *
 */
public class LocationEvent extends Event {

    /**
     * 
     * @return Detected geographical location of the user.
     */
    public final  LatLng getLatLng(){
        return new LatLng(latLng());
    }

    /**
     * 
     * @return Detected geographical location of the user.
     */
    private final native JSObject latLng()/*-{
        return this.latlng;
    }-*/;

    
    /**
     * 
     * @return Geographical bounds of the area user is located in (with respect to the accuracy of location).
     */
    public final  LatLngBounds getBounds(){
        return new LatLngBounds(bounds());
    }
    
    /**
     * 
     * @return Geographical bounds of the area user is located in (with respect to the accuracy of location).
     */
    private final native JSObject bounds()/*-{
        return this.bounds;
    }-*/;
    
    /**
     * 
     * @return Accuracy of location in meters.
     */
    public final native double getAccuracy()/*-{
        return this.accuracy;
    }-*/;  
}
