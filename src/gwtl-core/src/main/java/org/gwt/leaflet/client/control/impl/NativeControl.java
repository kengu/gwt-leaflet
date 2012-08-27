package org.gwt.leaflet.client.control.impl;

import org.gwt.leaflet.client.Literal;
import org.gwt.leaflet.client.control.Control;
import org.gwt.leaflet.client.map.Map;

/**
 * <p>Native Leaflet control implementation</p>
 * 
 * @author kengu
 *
 */
class NativeControl extends PrototypeControl implements Control {

	// --------------------------------------------------------
	// JSNI (overlay) constructors 
	// --------------------------------------------------------	
	
	/**
	 * Control overlay type constructor. 
	 */
	protected NativeControl() { }
	
	// --------------------------------------------------------
	// Control interface implementation
	// --------------------------------------------------------
	
	@Override
	public final Literal getPosition() {
		return Position.getByName(this.nativeGetPosition());
	};
	
	private final native String nativeGetPosition() /*-{
		return this.getPosition();
	}-*/;
	
	@Override
	public final Control setPosition(Literal position) {
		return nativeSetPosition(position.getLiteral());
	};
	
	private final native Control nativeSetPosition(String position) /*-{		
		return this.setPosition(position);
	}-*/;

	@Override
	public final native Control addTo(Map map) /*-{		
		return this.addTo(map);
	}-*/;
	
	@Override
	public final native Control removeFrom(Map map) /*-{		
		return this.removeFrom(map);
	}-*/;	
	

}
