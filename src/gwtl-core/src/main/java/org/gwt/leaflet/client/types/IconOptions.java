package org.gwt.leaflet.client.types;

import org.gwt.leaflet.client.Options;


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
	public IconOptions setIconUrl(String url) {
		 return (IconOptions)setProperty("iconUrl", url);
	}
	
	/**
	 * Size of the icon image in pixels.
	 * @param iconSize
	 */
	public IconOptions setIconSize(Point iconSize) {
		return (IconOptions)setProperty("iconSize", iconSize);
	}
	
	
	/**
	 * The coordinates of the "tip" of the icon (relative to its top left corner). 
	 * The icon will be aligned so that this point is at the marker's geographical 
	 * location. 
	 * Centered by default if size is specified, also can be set in CSS with negative 
	 * margins.
	 * @param iconSize
	 */
	public IconOptions setIconAnchor(Point iconAnchor) {
		return (IconOptions)setProperty("iconAnchor", iconAnchor);
	}

	/**
	 * The URL to the icon shadow image. If not specified, no shadow image will be
	 *  created.
	 * @param shadowUrl
	 */
	public IconOptions setShadowUrl(String shadowUrl) {
		return (IconOptions)setProperty("shadowUrl", shadowUrl);
	}

	/**
	 * Size of the shadow image in pixels.
	 * @param shadowUrl
	 */
	public IconOptions setShadowUrl(Point shadowSize) {
		return (IconOptions)setProperty("shadowSize", shadowSize);
	}

	 	 
	/**
	 * The coordinates of the "tip" of the shadow (relative to its top left corner) 
	 * (the same as iconAnchor if not specified).
	 * @param shadowUrl
	 */
	public IconOptions setShadowAnchor(Point shadowAnchor) {
		return (IconOptions)setProperty("shadowAnchor", shadowAnchor);
	}

	/**
 	 * The coordinates of the point from which popups will "open", relative to 
 	 * the icon anchor.
	 * @param shadowUrl
	 */
	public IconOptions setPopupAnchor(Point popupAnchor) {
		return (IconOptions)setProperty("popupAnchor", popupAnchor);
	}
	
}
