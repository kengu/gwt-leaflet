
package org.discotools.gwt.leaflet.client.handlers;

import org.discotools.gwt.leaflet.client.jsobject.JSObject;

/**
 * Implementation of {@link IHandler}
 * 
 * @author David Ignjic
 *
 * @see IHandler
 */
public class HandlerImpl extends JSObject implements IHandler {

    protected HandlerImpl() {
        super();
    }

    @Override
    public final native void enable() /*-{
        this.enable();
    }-*/;

    @Override
    public final native void disable() /*-{
        this.disable();
    }-*/;


    @Override
    public final native boolean enabled() /*-{
        return this.enabled();
    }-*/;
}
