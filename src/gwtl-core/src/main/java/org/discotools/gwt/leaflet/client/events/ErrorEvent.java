package org.discotools.gwt.leaflet.client.events;

/**
 * ErrorEvent
 * 
 * @author David Ignjic
 *
 */
public class ErrorEvent extends Event {

    /**
     * @return  Error message.
     */
    public final native String getMessage() /*-{
        return this.message;
    }-*/;

    /**
     * @return Error code (if applicable).
     */
    public final native int getCode() /*-{
        return this.code;
    }-*/;
    
}
