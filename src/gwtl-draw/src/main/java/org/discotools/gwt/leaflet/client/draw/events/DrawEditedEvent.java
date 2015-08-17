package org.discotools.gwt.leaflet.client.draw.events;

import org.discotools.gwt.leaflet.client.events.Event;
import org.discotools.gwt.leaflet.client.jsobject.JSObject;
import org.discotools.gwt.leaflet.client.layers.others.LayerGroup;

/**
 * 
 * @author Haley Boyd
 *
 */
public class DrawEditedEvent extends
		Event
{

	protected DrawEditedEvent() {
		super();
	}

    /**
     * The original DOM mouse event fired by the browser.
     * @return javascript object DOMMouseEvent
     */
    public final native com.google.gwt.user.client.Event getOriginalEvent() /*-{
        return this.originalEvent;
    }-*/;

    /**
     * List of all layers just edited on the map.
     * 
     * @return
     */
	public final LayerGroup getLayers() {
		return new LayerGroup(layers());
	}
	
	private final native JSObject layers() /*-{
		return this.layers;
	}-*/;
}
