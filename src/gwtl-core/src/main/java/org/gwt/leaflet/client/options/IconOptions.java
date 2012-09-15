package org.gwt.leaflet.client.options;

import org.gwt.leaflet.client.types.Point;


/**
 * IconControlOptions class
 * @author Lionel Leiva-Marcon
 *
 */
public class IconOptions extends Options  {

	public IconOptions() {
		 super();
	}

	/**
	 * 	(required) The URL to the icon image (absolute or relative to your script path).
	 * @param url
	 */
	public void setIconUrl(String url) {
		 setProperty("iconUrl", url);
	}
	
	/**
	 * Size of the icon image in pixels.
	 * @param iconSize
	 */
	public void setIconSize(Point iconSize) {
		 setProperty("iconSize", iconSize);
	}
	
	
	/**
	 * The coordinates of the "tip" of the icon (relative to its top left corner). 
	 * The icon will be aligned so that this point is at the marker's geographical 
	 * location. 
	 * Centered by default if size is specified, also can be set in CSS with negative 
	 * margins.
	 * @param iconSize
	 */
	public void setIconAnchor(Point iconAnchor) {
		setProperty("iconAnchor", iconAnchor);
	}

	/**
	 * The URL to the icon shadow image. If not specified, no shadow image will be
	 *  created.
	 * @param shadowUrl
	 */
	public void setShadowUrl(String shadowUrl) {
		setProperty("shadowUrl", shadowUrl);
	}

	/**
	 * Size of the shadow image in pixels.
	 * @param shadowUrl
	 */
	public void setShadowUrl(Point shadowSize) {
		setProperty("shadowSize", shadowSize);
	}

	 	 
	/**
	 * The coordinates of the "tip" of the shadow (relative to its top left corner) 
	 * (the same as iconAnchor if not specified).
	 * @param shadowUrl
	 */
	public void setShadowAnchor(Point shadowAnchor) {
		setProperty("shadowAnchor", shadowAnchor);
	}

	/**
 	 * The coordinates of the point from which popups will "open", relative to 
 	 * the icon anchor.
	 * @param shadowUrl
	 */
	public void setPopupAnchor(Point popupAnchor) {
		setProperty("popupAnchor", popupAnchor);

	}
	
}
