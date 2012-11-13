package org.discotools.gwt.leaflet.client.events.handler;

import org.discotools.gwt.leaflet.client.events.handler.EventHandler.Events;
import org.discotools.gwt.leaflet.client.jsobject.JSObject;
import org.discotools.gwt.leaflet.client.map.Map;


/**
 * Helper class to add event handler to event on objects
 * defined in L.Mixin
 * @author David Ignjic
 *
 */
public class EventHandlerManager  {
    /**
     * Register event handler to class
     *  
     * @param eventProvider Class which implement L.Mixin (ex. {@link Map}
     * @param eventName Event name in leaflet documentation
     * @param handler handle event
     * @return registered function in event map listeners
     */
    public static EventRegisteredFunction addEventHandler(EventProvider eventProvider, Events eventName, EventHandler<?> handler){
        return addEventHandler(eventProvider.getJSObject(), eventName.name(), handler);
    }
    

    private static native EventRegisteredFunction addEventHandler(JSObject eventProvider, String eventName, EventHandler<?> handler)/*-{
        var _handler = $entry(function(event) {
          handler.@org.discotools.gwt.leaflet.client.events.handler.EventHandler::handle(Lorg/discotools/gwt/leaflet/client/events/Event;)(event);
        });
        eventProvider.on(eventName,_handler); 
        return _handler;    
    }-*/;
    
    /**
     * Deregister event hadler from class
     * 
     * @param eventProvider Class when called method {@link #addEventHandler(EventProvider, String, EventHandler)}
     * @param eventName Event name when called method {@link #addEventHandler(EventProvider, String, EventHandler)}
     * @param function object returned from method {@link #addEventHandler(EventProvider, String, EventHandler)}
     */
    public static void removeEventHandler(EventProvider eventProvider, Events eventName, EventRegisteredFunction function) {
        removeEventHandler(eventProvider.getJSObject(), eventName.name(), function);
    }
    
    private static native void removeEventHandler(JSObject eventProvider,String eventName,EventRegisteredFunction eventRegisteredFunction)/*-{
        eventProvider.off(eventName,eventRegisteredFunction);
    }-*/;

    /**
     * Deregister all event handlers for event 
     *  
     * @param eventProvider
     * @param eventName 
     */
    public static void clearEventHandler(EventProvider eventProvider, Events eventName) {
        clearEventHandler(eventProvider.getJSObject(), eventName.name());
    }

    private static native void clearEventHandler(JSObject eventProvider,String eventName)/*-{
        eventProvider.off(eventName);
    }-*/;
}
