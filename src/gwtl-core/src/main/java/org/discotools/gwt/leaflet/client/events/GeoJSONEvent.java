package org.discotools.gwt.leaflet.client.events;

import org.discotools.gwt.leaflet.client.jsobject.JSObject;

/**
 * GeoJSON Event
 * @author David Ignjic
 *
 */
public class GeoJSONEvent extends LayerEvent {

    
    protected GeoJSONEvent() {
        super();
    }

    /**
     * @return  GeoJSON properties of the feature.
     */
    public final native JSObject getProperties() /*-{
        return this.properties;
    }-*/;    

    /**
     * @return  GeoJSON geometry type of the feature.
     */
    public final native String getGeometryType() /*-{
        return this.geometryType;
    }-*/;    

    /**
     * @return  GeoJSON ID of the feature (if present).
     */
    public final native String getId() /*-{
        return this.id;
    }-*/;    
}
