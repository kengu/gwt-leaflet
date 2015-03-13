package org.discotools.gwt.leaflet.client.draw;

import org.discotools.gwt.leaflet.client.Options;

/**
 * 
 * @author Haley Boyd
 *
 */
public class DrawError extends
		Options
{
	public DrawError() {
		super();
	}

	public DrawError setColor(
			String color ) {
		return (DrawError) setProperty(
				"color",
				color);
	}

	public DrawError setTimeout(
			long timeout ) {
		return (DrawError) setProperty(
				"timeout",
				timeout);
	}

}
