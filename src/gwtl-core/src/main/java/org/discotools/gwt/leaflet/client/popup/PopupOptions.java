package org.discotools.gwt.leaflet.client.popup;

import org.discotools.gwt.leaflet.client.Options;


/**
 * PopupOptions class
 * @author Lionel Leiva-Marcon
 *
 */
public class PopupOptions extends Options  {

	public PopupOptions() {
		 super();
	}

	/**
	 * 
	 * @param maxWidth Max width of the popup. Default 350.
	 */
	public void setMaxWidth(int maxWidth) {
		 setProperty("maxWidth", maxWidth);
	}

    /**
     * 
     * @param minWidth Min width of the popup.Default 50.
     */
    public void setMinWidth(int minWidth) {
         setProperty("minWidth", minWidth);
    }
	
}
