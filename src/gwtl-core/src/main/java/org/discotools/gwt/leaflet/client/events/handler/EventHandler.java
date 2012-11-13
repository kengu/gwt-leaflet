package org.discotools.gwt.leaflet.client.events.handler;

import org.discotools.gwt.leaflet.client.events.Event;

/**
 * Simple interface for handling events
 * 
 * @author David Ignjic
 *
 */
public interface EventHandler<T extends Event> {
    /**
     * Posible events registered in EventHandlerManager
     * @author David Ignjic
     *
     */
    public enum Events{
        click, dblclick, mousedown, mouseup, mouseenter, mouseleave, mousemove, contextmenu, focus, blur, preclick, load, popupopen, popupclose, mouseover, mouseout
    }
    public void handle(T event);
}
