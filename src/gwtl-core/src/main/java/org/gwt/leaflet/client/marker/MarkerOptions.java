package org.gwt.leaflet.client.marker;

import org.gwt.leaflet.client.Options;
import org.gwt.leaflet.client.types.Icon;


/**
 * MarkerOptions class
 * @author Lionel Leiva-Marcon
 *
 */
public class MarkerOptions extends Options  {

	public MarkerOptions() {
		 super();
	}

	public MarkerOptions setIcon(Icon icon) {
		 return (MarkerOptions)setProperty("icon", icon.getJSObject());
	}
	
	public MarkerOptions setTitle(String title) {
		 return (MarkerOptions)setProperty("title", title);
	}
	
	public MarkerOptions setClickable(boolean clickable) {
		 return (MarkerOptions)setProperty("clickable", clickable);
	}

	public MarkerOptions setDraggable(boolean draggable) {
		 return (MarkerOptions)setProperty("draggable", draggable);
	}
	
	public MarkerOptions setZIndexOffset(int offset) {
		 return (MarkerOptions)setProperty("zIndexOffset", offset);
	}
	
	public MarkerOptions setOpacity(double opacity) {
		 return (MarkerOptions)setProperty("opacity", opacity);
	}
	
}
