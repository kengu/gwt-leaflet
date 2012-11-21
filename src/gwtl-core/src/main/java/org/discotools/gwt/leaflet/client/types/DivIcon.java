package org.discotools.gwt.leaflet.client.types;

import org.discotools.gwt.leaflet.client.jsobject.JSObject;

/**
 * Represents a lightweight icon for markers that uses a simple div element instead of an image.
 * 
 * @author David Ignjic
 *
 */
public class DivIcon extends Icon {

    public DivIcon(JSObject element) {
        super(element);
    }

    public DivIcon(DivIconOptions options) {
        super(DivIconImpl.create(options.getJSObject()));
    }

}
