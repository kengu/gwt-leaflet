package org.discotools.gwt.leaflet.client.events;

import com.google.gwt.user.client.Element;

/**
 * TileEvent
 * 
 * @author David Ignjic
 *
 */
public class TileEvent extends Event {

    
    /**
     * @return  The source URL of the tile.
     */
    public final native String getURL() /*-{
        return this.url;
    }-*/;   
    
    /**
     * @return  The tile element (image).
     */
    public final native Element getTile() /*-{
        return this.tile;
    }-*/; 
}
