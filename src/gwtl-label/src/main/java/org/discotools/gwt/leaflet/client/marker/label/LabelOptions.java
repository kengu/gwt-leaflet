package org.discotools.gwt.leaflet.client.marker.label;

import org.discotools.gwt.leaflet.client.Options;

/**
 * Options for Label
 * @author David Ignjic
 *
 */
public class LabelOptions extends Options {

    /**
     * the css class to add to the label element
     * @param className
     */
    public LabelOptions setClassName(String className) {
        setProperty("className", className);
        return this;
    }

    /**
     * doesn't attach event handler for showing/hiding the label on mouseover/out.
     * @param noHide
     */
    public LabelOptions setNoHide(boolean noHide) {
        setProperty("noHide", noHide);
        return this;
    }

    /**
     * Remove nices border from label
     * @param withoutDefaultStyle
     */
    public LabelOptions setWithoutDefaultStyle(boolean withoutDefaultStyle) {
        setProperty("withoutDefaultStyle", withoutDefaultStyle);
        return this;
    }

    /**
     * 
     * @param paneName set panename (like "popupPane","markerPane","overlayPane") where label will be added (z-index)
     */
    public LabelOptions setPane(String paneName) {
        setProperty("pane", paneName);
        return this;
    }
}
