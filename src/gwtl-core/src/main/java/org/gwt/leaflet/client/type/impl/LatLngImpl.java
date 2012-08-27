package org.gwt.leaflet.client.type.impl;

import org.gwt.leaflet.client.type.LatLng;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * {@link LatLng} implementation.
 * 
 * @author kengu
 *
 */
public class LatLngImpl extends JavaScriptObject implements LatLng {

	// --------------------------------------------------------
	// JSNI (overlay) constructors 
	// --------------------------------------------------------
	
	/**
	 * LatLngImpl overlay type constructor. 
	 */
	protected LatLngImpl() { }
	
	// --------------------------------------------------------
	// LatLng interface implementation
	// --------------------------------------------------------

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
