package org.gwt.leaflet.client.impl;

import org.gwt.leaflet.api.Attribution;

import com.google.gwt.core.client.JavaScriptObject;

public class AttributionImpl extends JavaScriptObject implements Attribution {

	/**
	 * TileLayer overlay type constructor. 
	 */
	protected AttributionImpl() { }

	@Override
	public final native void setPrefix(String prefix) /*-{	
		
		// Finished
		return this.setPrefix(prefix);
		
	}-*/;	
	
	@Override
	public final native void addAttribution(String text) /*-{	
		
		// Finished
		return this.addAttribution(prefix);
		
	}-*/;	

	@Override
	public final native void removeAttribution(String text) /*-{	
		
		// Finished
		return this.addAttribution(prefix);
		
	}-*/;	


}
