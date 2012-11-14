package org.discotools.gwt.leaflet.client.layers.vector;

import org.discotools.gwt.leaflet.client.Options;

/**
 * 
 * @author David Ignjic
 *
 */
public class PathOptions extends Options {

    public PathOptions() {
        super();
    }
    
    public PathOptions setStroke(boolean  stroke) {
        return (PathOptions)setProperty("stroke", stroke);
    }
    
    public PathOptions setColor(String  color) {
        return (PathOptions)setProperty("color", color);
    }

    public PathOptions setWeight(int  weight) {
        return (PathOptions)setProperty("weight", weight);
    }

    public PathOptions setOpacity(double  opacity) {
        return (PathOptions)setProperty("opacity", opacity);
    }

    public PathOptions setFill(boolean  fill) {
        return (PathOptions)setProperty("fill", fill);
    }
    
    public PathOptions setFillColor(String  fillColor) {
        return (PathOptions)setProperty("fillColor", fillColor);
    }

    public PathOptions setFillOpacity(double  fillOpacity) {
        return (PathOptions)setProperty("fillOpacity", fillOpacity);
    }
    
    public PathOptions setDashArray(String  dashArray) {
        return (PathOptions)setProperty("dashArray", dashArray);
    }
    
    public PathOptions setClickable(boolean  clickable) {
        return (PathOptions)setProperty("clickable", clickable);
    }

}
