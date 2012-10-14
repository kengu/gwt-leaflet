package org.discotools.gwt.leaflet.client.layers.others;

import org.discotools.gwt.leaflet.client.jsobject.JSObject;
import org.discotools.gwt.leaflet.client.layers.ILayerImpl;

/**
 * {@link LayerGroup} implementation class
 * 
 * @author Lionel Leiva-Marcon
 *
 */
public class LayerGroupImpl extends ILayerImpl {

	public static native JSObject create(JSObject layers)/*-{				
		return new $wnd.L.layerGroup(layers);
	}-*/;	
	
	public static native  void addLayer(JSObject self, JSObject layer) /*-{
		self.addLayer(layer);
	}-*/;
	
	public static native  void removeLayer(JSObject self, JSObject layer) /*-{
		self.removeLayer(layer);
	}-*/;
	
	public static native  void clearLayers(JSObject self) /*-{
		self.clearLayers();
	}-*/;
	

	public static native  void addTo(JSObject self, JSObject map) /*-{
		self.addTo(map);
	}-*/;
	

}
