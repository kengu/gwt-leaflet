package org.gwt.leaflet.impl.controls;

import org.gwt.leaflet.api.controls.IControl;
import org.gwt.leaflet.api.map.Map;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.Element;

/**
 * <p>Native Leaflet control implementation</p>
 * 
 * @author kengu
 *
 */
class PrototypeControl extends JavaScriptObject implements IControl {

	// --------------------------------------------------------
	// JSNI (overlay) constructors 
	// --------------------------------------------------------	
	
	/**
	 * PrototypeControl overlay type constructor. 
	 */
	protected PrototypeControl() { }
	
	// --------------------------------------------------------
	// IControl interface implementation
	// --------------------------------------------------------
	
	@Override
	public final native Element onAdd(Map map) /*-{
		return this.onAdd(map);
	}-*/;
	
	@Override
	public final native void onRemove(Map map) /*-{
		return this.onRemove(map);
	}-*/;
	

}
