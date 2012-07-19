package org.gwt.leaflet.client;

import org.gwt.leaflet.api.types.LatLng;

import com.google.gwt.core.client.JavaScriptObject;

public class LatLngImpl extends JavaScriptObject implements LatLng {

	/**
	 * LatLng overlay type constructor. 
	 */
	protected LatLngImpl() { }
	
	@Override
	public final native double lat() /*-{
		return new this.lat;
	}-*/;

	@Override
	public final native double lon() /*-{
		return new this.lat;
	}-*/;

	@Override
	public final native double distanceTo(LatLng other) /*-{
		return this.distanceTo(other);
	}-*/;
	
	@Override
	public final native double equalTo(LatLng other) /*-{
		return this.equals(other);
	}-*/;

}
