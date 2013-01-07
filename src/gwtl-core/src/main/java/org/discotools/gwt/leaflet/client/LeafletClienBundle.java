package org.discotools.gwt.leaflet.client;

import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.CssResource;
import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.resources.client.TextResource;

public interface LeafletClienBundle extends ClientBundle {
	
//    @Source("leaflet-src.js")
    @Source("leaflet.js")
    TextResource baseScript();

    @Source("leaflet.css")
    @CssResource.NotStrict
    CssResource css();
 
    @Source("images/zoom-in.png")
    ImageResource zoomIn();

    @Source("images/zoom-out.png")
    ImageResource zoomOut();

    @Source("images/layers.png")
    ImageResource layers();

}
