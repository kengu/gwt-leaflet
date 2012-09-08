package org.gwt.leaflet.impl.map;


import org.gwt.leaflet.api.controls.IControl;
import org.gwt.leaflet.api.layers.ILayer;
import org.gwt.leaflet.api.map.Map;
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
		return this.gwtl.name;
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
	public final Map addLayer(ILayer layer) {
		return addLayer(layer, false);
	}

	@Override
	public final native Map addLayer(ILayer layer, boolean bottom) /*-{	
		// Forward
		this.addLayer(layer,bottom); return this;
	}-*/;
	
	@Override
	public final native Map addControl(IControl control) /*-{	
		// Forward
		this.addControl(control); return this;
	}-*/;
}
