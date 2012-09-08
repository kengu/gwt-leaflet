package org.gwt.leaflet.impl.controls;

import org.gwt.leaflet.api.Options;
import org.gwt.leaflet.api.controls.Layers;
import org.gwt.leaflet.api.layers.ILayer;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <p>Leaflet layer switcher control implementation</p>
 * 
 * @author kengu
 *
 */
public class LayersImpl extends NativeControl implements Layers {

	// --------------------------------------------------------
	// JSNI (overlay) constructors 
	// --------------------------------------------------------	
	
	/**
	 * LayersImpl overlay type constructor. 
	 */
	protected LayersImpl() { }

	// --------------------------------------------------------
	// Layers interface implementation 
	// --------------------------------------------------------	
	
	@Override
	public final native Layers setCollapsed(boolean isCollapsed) /*-{	
		// Forward
		this.collapsed = isCollapsed; return this;
	}-*/;

	@Override
	public final Layers setOptions(Options options) {	
		// Forward to JNI method
		return nativeSetOptions(Options.toJSO(options, Layers.DEFAULT));
	}

	private final native Layers nativeSetOptions(JavaScriptObject options) /*-{	
		
		// Set options
		if(options.collapsed != undefined) this.collapsed = options.collapsed;
		
		// Finished
		return this;
	}-*/;
		
	@Override
	public final native Layers addBaseLayer(ILayer layer, String name) /*-{	
		// Forward
		this.addBaseLayer(layer,name); return this;
	}-*/;

	@Override
	public final native Layers addOverlay(ILayer layer, String name) /*-{	
		// Forward
		this.addOverlay(layer,name); return this;
	}-*/;

	@Override
	public final native Layers removeLayer(String layer) /*-{	
		// Forward
		this.removeLayer(layer); return this;
	}-*/;

}
