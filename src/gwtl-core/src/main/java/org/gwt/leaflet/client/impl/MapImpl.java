package org.gwt.leaflet.client.impl;


import org.gwt.leaflet.api.Control;
import org.gwt.leaflet.api.Layer;
import org.gwt.leaflet.api.Map;
import org.gwt.leaflet.api.types.LatLng;

import com.google.gwt.core.client.JavaScriptObject;

public class MapImpl extends JavaScriptObject implements Map {

	/**
	 * Map overlay type constructor. 
	 */
	protected MapImpl() { }

	@Override
	public final native String getName() /*-{		
		// Forward
		return this.gwt.name;
	}-*/;

	@Override
	public final native MapImpl setView(LatLng center, double zoom, boolean reset) /*-{		
		// Forward
		this.setView(center,zoom,reset); return this;
  	}-*/;

	@Override
	public final native MapImpl setZoom(double zoom) /*-{	
		// Forward
		this.setZoom(zoom); return this;
	}-*/;

	@Override
	public final native Map zoomIn() /*-{	
		// Forward
		this.zoomIn(); return this;
	}-*/;

	@Override
	public final native Map zoomOut() /*-{	
		// Forward
		this.zoomOut(); return this;
	}-*/;

	@Override
	public final Map addLayer(Layer layer) {
		return addLayer(layer, false);
	}

	@Override
	public final native Map addLayer(Layer layer, boolean bottom) /*-{	
		// Forward
		this.addLayer(layer,bottom); return this;
	}-*/;
	
	@Override
	public final native Map addControl(Control control) /*-{	
		// Forward
		this.addControl(control); return this;
	}-*/;
}
