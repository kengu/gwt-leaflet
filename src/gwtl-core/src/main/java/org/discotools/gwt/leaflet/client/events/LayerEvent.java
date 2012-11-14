package org.discotools.gwt.leaflet.client.events;

import org.discotools.gwt.leaflet.client.jsobject.JSObject;
import org.discotools.gwt.leaflet.client.layers.ILayer;

/**
 * 
 * @author David Ignjic
 *
 */
public class LayerEvent extends Event {

    protected LayerEvent() {
        super();
    }
    /**
     * @return  The layer that was added or removed.
     */
    public final ILayer getLayer() {
        return new ILayer(layer());
    }
    
    protected final native JSObject layer()/*-{
        return this.layer;
    }-*/;

}
