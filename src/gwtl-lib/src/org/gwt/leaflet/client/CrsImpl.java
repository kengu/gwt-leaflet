package org.gwt.leaflet.client;

import org.gwt.leaflet.api.types.Crs;

import com.google.gwt.core.client.JavaScriptObject;

public class CrsImpl extends JavaScriptObject implements Crs {

	/**
	 * {@link Crs} overlay type constructor. 
	 */
	protected CrsImpl() { }
	
	@Override
	public final native String getName() /*-{
		return this.gwt.name;
	}-*/;

	@Override
	public final native String getEPSG() /*-{
		return this.gwt.epsg;
	}-*/;

	@Override
	public final native int getSRID() /*-{
		return this.gwt.srid;
	}-*/;	
	
}
