package org.discotools.gwt.leaflet.client.controls.search;

import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.CssResource;
import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.resources.client.TextResource;

public interface LeafletSearchControlClientBundle
  extends ClientBundle {
  @Source( "leaflet-search.js" )
  TextResource baseScript();

  @Source( "leaflet-search.css" )
  @CssResource.NotStrict
  CssResource css();

  @Source( "images/search-icon.png" )
  ImageResource searchIcon();
}
