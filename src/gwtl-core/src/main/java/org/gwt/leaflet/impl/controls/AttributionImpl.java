package org.gwt.leaflet.impl.controls;

import org.gwt.leaflet.api.controls.Attribution;

/**
 * <p>Leaflet layer switcher control implementation</p>
 * 
 * @author kengu
 *
 */
public class AttributionImpl extends NativeControl implements Attribution {

	// --------------------------------------------------------
	// JSNI (overlay) constructors 
	// --------------------------------------------------------
	
	/**
	 * TileLayer overlay type constructor. 
	 */
	protected AttributionImpl() { }

	// --------------------------------------------------------
	// Attribution interface implementation
	// --------------------------------------------------------	
	
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
