package org.discotools.gwt.leaflet.client.draw.events.handler;

import org.discotools.gwt.leaflet.client.events.handler.EventHandler.EventName;

/**
 * 
 * @author Haley Boyd
 *
 */
public enum DrawEvents
		implements
		EventName {
	draw_created(
			"draw:created"),
	draw_edited(
			"draw:edited");

	private String label;

	private DrawEvents(
			String label ) {
		this.label = label;
	}

	public String getName() {
		return label;
	}
}
