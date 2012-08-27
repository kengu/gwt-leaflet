package org.gwt.leaflet.client.control.impl;

import static org.gwt.leaflet.client.Options.toJSO;

import org.gwt.leaflet.client.LeafletException;
import org.gwt.leaflet.client.Options;
import org.gwt.leaflet.client.control.ControlFactory;
import org.gwt.leaflet.client.control.Layers;
import org.gwt.leaflet.client.control.Scale;
import org.gwt.leaflet.client.control.Zoom;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * {@link ControlFactory} implementation.
 * 
 * @author kengu
 *
 */
public final class ControlFactoryImpl implements ControlFactory {

	@Override
	public LayersImpl layers(Options bases, Options overlays, Options options) throws LeafletException {				
		return newLayers(
				toJSO(bases, Options.EMPTY),
				toJSO(overlays, Options.EMPTY),
				toJSO(options, Layers.DEFAULT));
	}
		
	private static native LayersImpl newLayers(
			JavaScriptObject bases, 
			JavaScriptObject overlays, 
			JavaScriptObject options) /*-{
	
		// Create Layers
		return $wnd.L.control.layers(bases, overlays, options);
	
	}-*/;	

	@Override
	public native AttributionImpl attribution(String text, Options options) /*-{
	
		// Create Attribution
		var a = $wnd.L.control.attribution(options);
		
		// Set prefix and text
		a.addAttribution(text);
		
		// Finished
		return a;
	
	}-*/;	
	
	
	@Override
	public native Scale scale(Options options) throws LeafletException /*-{
	
		return $wnd.L.control.scale(options);
	
	}-*/;	
	
	@Override
	public native Zoom zoom(Options options) throws LeafletException /*-{
	
		return $wnd.L.control.zoom(options);
	
	}-*/;	
	

}
