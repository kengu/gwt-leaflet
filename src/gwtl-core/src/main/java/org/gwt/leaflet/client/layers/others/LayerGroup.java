package org.gwt.leaflet.client.layers.others;

import org.gwt.leaflet.client.jswraps.JSObject;
import org.gwt.leaflet.client.jswraps.JSObjectArray;
import org.gwt.leaflet.client.layers.ILayer;
import org.gwt.leaflet.client.map.Map;

/**
 * Used to group several layers and handle them as one. 
 * If you add it to the map, any layers added or removed from the group 
 * will be added/removed on the map as well. 
 * Implements ILayer interface.
 * 
 * @author Lionel Leiva-Marcon
 * 
 * @see <a href="http://leaflet.cloudmade.com/reference.html#layergroup">L.LayerGroup (Leaflet API)</a>
 *
 */
public class LayerGroup extends ILayer {

	protected LayerGroup(JSObject element) {
		super(element);
	}

	public LayerGroup(ILayer[] layers) {
		this (LayerGroupImpl.create(new JSObjectArray(layers).getJSObject()));
	}

	public LayerGroup(String alias, ILayer[] layers) {
		this (LayerGroupImpl.create(new JSObjectArray(layers).getJSObject()));
		setAlias(alias);
	}
	
	/**
	 * Adds a given layer to the group.
	 * @param layer
	 */
	public void addLayer(ILayer layer) {
		LayerGroupImpl.addTo(getJSObject(), layer.getJSObject());		
	}

	/**
	 * Adds the group of layers to the map.
	 * @param map
	 */
	public void addTo(Map map) {
		LayerGroupImpl.addTo(getJSObject(), map.getJSObject());		
	}

}
