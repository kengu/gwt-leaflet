package org.discotools.gwt.leaflet.client.popup;

import org.discotools.gwt.leaflet.client.Options;


/**
 * MarkerOptions class
 * @author Lionel Leiva-Marcon
 *
 */
public class PopupOptions extends Options  {

	public PopupOptions() {
		 super();
	}

	public void setTitle(String title) {
		 setProperty("title", title);
	}

}
