package org.discotools.gwt.leaflet.client.events;

import org.discotools.gwt.leaflet.client.jsobject.JSObject;

/**
 * The base event object. All other event objects contain these properties too.
 * 
 * @author David Ignjic
 *
 * @see <a href="http://leafletjs.com/reference.html#event-objects">Event objects (Leaflet API)</a>
 */
public class Event extends JSObject {

    protected Event() {
        super();
    }

    /**
     * @return The event type (e.g. 'click').
     */
    public final native String getType() /*-{
        return this.type;
    }-*/;

    /**
     * 
     * @return The object that fired the event.
     */
    public final native JSObject getTarget() /*-{
        return this.target;
    }-*/;
    

}
