package org.discotools.gwt.leaflet.client.types;

import org.discotools.gwt.leaflet.client.Options;


/**
 * IconControlOptions class
 * @author Lionel Leiva-Marcon
 *
 */
public class DivIconOptions extends Options  {

	public DivIconOptions() {
		 super();
	}

    /**
     *The coordinates of the "tip" of the icon (relative to its top left corner). 
     *The icon will be aligned so that this point is at the marker's geographical location. 
     *Centered by default if size is specified, also can be set in CSS with negative margins.
     * @param iconSize
     */
    public DivIconOptions setIconAnchor(Point iconAnchor) {
        return (DivIconOptions)setProperty("iconAnchor", iconAnchor);
    }

    
	/**
	 * Size of the icon in pixels. Can be also set through CSS.
	 * @param iconSize
	 */
	public DivIconOptions setIconSize(Point iconSize) {
		return (DivIconOptions)setProperty("iconSize", iconSize);
	}
	

    /**
     * A custom class name to assign to the icon. 'leaflet-div-icon' by default.
     * @param className
     */
    public DivIconOptions setClassName(String className) {
        return (DivIconOptions)setProperty("className", className);
    }

    /**
     * A custom HTML code to put inside the div element, empty by default.
     * @param html
     */
    public DivIconOptions setHtml(String html) {
        return (DivIconOptions)setProperty("html", html);
    }
    

	
}
