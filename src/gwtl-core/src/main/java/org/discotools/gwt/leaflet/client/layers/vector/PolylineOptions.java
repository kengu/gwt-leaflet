package org.discotools.gwt.leaflet.client.layers.vector;

/**
 * 
 * @author David Ignjic
 *
 */
public class PolylineOptions extends PathOptions {

    public PathOptions setEditable(boolean  editable) {
        return (PathOptions)setProperty("editable", editable);
    }
}
