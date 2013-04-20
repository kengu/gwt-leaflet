package org.discotools.gwt.leaflet.client.proj4;

import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.CssResource;
import com.google.gwt.resources.client.TextResource;

public interface LeafletProj4ClientBundle
  extends ClientBundle {
  //@Source( "proj4js-combined.js" )
  @Source( "proj4js-compressed.js" )
  TextResource proj4js();

  @Source( "proj4leaflet.js" )
  TextResource proj4leaflet();
}
