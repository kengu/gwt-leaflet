package org.discotools.gwt.leaflet.client.events;

import org.discotools.gwt.leaflet.client.jsobject.JSObject;
import org.discotools.gwt.leaflet.client.popup.Popup;

/**
 * Popup event
 * 
 * @author David Ignjic
 *
 */
public class PopupEvent extends Event {

    protected PopupEvent() {
        super();
    }


    /**
     * @return  The popup that was opened or closed.
     */
    public final Popup getPopup(){
        return new Popup(popup());
    }
    
    
    /**
     * @return  The popup that was opened or closed.
     */
    protected final native JSObject popup() /*-{
        return this.popup;
    }-*/;        
}
