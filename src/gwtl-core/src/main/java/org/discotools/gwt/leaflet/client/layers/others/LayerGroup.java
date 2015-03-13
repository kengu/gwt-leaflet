package org.discotools.gwt.leaflet.client.layers.others;

import org.discotools.gwt.leaflet.client.Options;
import org.discotools.gwt.leaflet.client.jsobject.JSObject;
import org.discotools.gwt.leaflet.client.jsobject.JSObjectArray;
import org.discotools.gwt.leaflet.client.layers.ILayer;
import org.discotools.gwt.leaflet.client.map.Map;

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

	public LayerGroup(JSObject element) {
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
	 * @return LayerGroup
	 * 
	 */
	public LayerGroup addLayer(ILayer layer) {
		LayerGroupImpl.addLayer(getJSObject(), layer.getJSObject());
		return this;
	}

	/**
	 * Removes a given layer from the group.
	 * @param layer to remove
	 * @return LayerGroup
	 * 
	 */
	public LayerGroup removeLayer(ILayer layer) {
		LayerGroupImpl.removeLayer(getJSObject(), layer.getJSObject());
		return this;
	}

	/**
	 * Removes all the layers from the group.
	 * @return LayerGroup
	 * 
	 */
	public LayerGroup clearLayers() {
		LayerGroupImpl.clearLayers(getJSObject());
		return this;
	}
	
	public ILayer[] getLayers() {
		JSObject[] objects = LayerGroupImpl.getLayers(getJSObject());
		ILayer[] layers = new ILayer[objects.length];
		for (int i = 0; i < objects.length; i++) {
			layers[i] = new ILayer(objects[i]);
		}
		return layers;
	}

	/**
	 * Adds the group of layers to the map.
	 * @param map
	 * @return LayerGroup
	 */
	public LayerGroup addTo(Map map) {
		LayerGroupImpl.addTo(getJSObject(), map.getJSObject());		
		return this;
	}
	
	/**
	 * Modify options in one operation.
	 * @param options {@link Options} instance.
	 * @return {@link LayerGroup}
	 */
	public LayerGroup setOptions(Options options) {
		return (LayerGroup)super.setOptions(options);
	}

}
