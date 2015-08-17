package org.discotools.gwt.leaflet.client;

import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.TextResource;


/**
 * Extend the {@link ClientBundle} to provide Javascript
 * resource linkage for Leaflet.js mapping library.
 *
 * @author Kenneth Gulbrandsøy
 */
public interface LeafletBundle extends ClientBundle {

    /**
     * Inline leaflet.js
     * @return TextResource
     */
    @Source("libs/leaflet/v0.7.3/leaflet.js")
    TextResource getScript();

}