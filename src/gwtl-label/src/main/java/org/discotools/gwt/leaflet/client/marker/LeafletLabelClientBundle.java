package org.discotools.gwt.leaflet.client.marker;

import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.CssResource;
import com.google.gwt.resources.client.TextResource;

public interface LeafletLabelClientBundle
  extends ClientBundle {
  //    @Source("leaflet.label-src.js")
  @Source( "leaflet.label.js" )
  TextResource baseScript();

  @Source( "leaflet.label.css" )
  @CssResource.NotStrict
  CssResource css();
}
