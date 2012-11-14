package org.discotools.gwt.leaflet.client.events;

import org.discotools.gwt.leaflet.client.jsobject.JSObject;
import org.discotools.gwt.leaflet.client.types.LatLng;
import org.discotools.gwt.leaflet.client.types.Point;


/**
 * MouseEvent
 * 
 * @author David Ignjic
 *
 * @see <a href="http://leafletjs.com/reference.html#event-objects">Event objects (Leaflet API)</a>
 */
public class MouseEvent extends Event {

    protected MouseEvent() {
        super();
    }

    /**
     * The original DOM mouse event fired by the browser.
     * @return javascript object DOMMouseEvent
     */
    public final native com.google.gwt.user.client.Event getOriginalEvent()  /*-{
        return this.originalEvent;
    }-*/;
    
    /**
     * 
     * @return The geographical point where the mouse event occured.
     */
    public final LatLng getLatLng(){
        return new LatLng(latLng());
    }
    
    
    /**
     * 
     * @return The geographical point where the mouse event occured.
     */
    private final native JSObject latLng()/*-{
        return this.latlng;
    }-*/;
    
    /**
     * 
     * @return Pixel coordinates of the point where the mouse event occured relative to the map layer.
     */
    public final Point getLayerPoint(){
        return new Point(layerPoint());
    }
    
    /**
     * 
     * @return Pixel coordinates of the point where the mouse event occured relative to the map layer.
     */
    public final Point getContainerPoint(){
        return new Point(containerPoint());
    }

    
    /**
     * 
     * @return Pixel coordinates of the point where the mouse event occured relative to the map layer.
     */
    private final native JSObject layerPoint()/*-{
        return this.layerPoint;
    }-*/;
    
    /**
     * 
     * @return Pixel coordinates of the point where the mouse event occured relative to the map layer.
     */
    private final native JSObject containerPoint()/*-{
        return this.containerPoint;
    }-*/;    
}