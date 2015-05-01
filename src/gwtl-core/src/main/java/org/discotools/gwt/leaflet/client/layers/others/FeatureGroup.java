package org.discotools.gwt.leaflet.client.layers.others;

import org.discotools.gwt.leaflet.client.Options;
import org.discotools.gwt.leaflet.client.jsobject.JSObject;
import org.discotools.gwt.leaflet.client.jsobject.JSObjectArray;
import org.discotools.gwt.leaflet.client.layers.ILayer;
import org.discotools.gwt.leaflet.client.map.Map;
import org.discotools.gwt.leaflet.client.types.LatLngBounds;

/**
 * Extended LayerGroup that also has mouse events (propagated
 * from members of the group) and a shared bindPopup method.
 * Implements ILayer interface.
 *
 * @author Lionel Leiva-Marcon
 *
 * @see <a href="http://leaflet.cloudmade.com/reference.html#featuregroup">L.FeatureGroup (Leaflet API)</a>
 *
 */
public class FeatureGroup extends LayerGroup {

	public FeatureGroup(JSObject element) {
		super(element);
	}

	public FeatureGroup() {
		this(FeatureGroupImpl.create());
	}

	public FeatureGroup(ILayer[] layers) {
		this (FeatureGroupImpl.create(new JSObjectArray(layers).getJSObject()));
	}

	public FeatureGroup(String alias, ILayer[] layers) {
		this (FeatureGroupImpl.create(new JSObjectArray(layers).getJSObject()));
		setAlias(alias);
	}

	/**
	 * Adds a given layer to the group.
	 * @param layer
	 * @return {@link FeatureGroup}
	 */
	public FeatureGroup addLayer(ILayer layer) {
		FeatureGroupImpl.addLayer(getJSObject(), layer.getJSObject());
		return this;
	}

	/**
	 * Adds the group of layers to the map.
	 * @param map
	 * @return {@link FeatureGroup}
	 */
	public FeatureGroup addTo(Map map) {
		FeatureGroupImpl.addTo(getJSObject(), map.getJSObject());
		return this;
	}

	/**
	 * Binds a popup with a particular HTML content to a click on any layer
	 * from the group that has a bindPopup method.
	 * @param htmlContent
	 * @param options
	 * @return {@link FeatureGroup}
	 */
	public FeatureGroup bindPopup(String htmlContent, Options options) {
		FeatureGroupImpl.addPopup(getJSObject(), htmlContent, options.getJSObject());
		return this;
	}

	/**
	 * Returns the LatLngBounds of the Feature Group (created from bounds
	 * and coordinates of its children).
	 * @return {@link LatLngBounds}
	 */
	public LatLngBounds getBounds() {
		return FeatureGroupImpl.getBounds(getJSObject());
	}

	/**
	 * Sets the given path options to each layer of
	 * the group that has a setStyle method.
	 * @param options
	 * @return {@link FeatureGroup}
	 */
	public FeatureGroup setStyle(Options options) {
		FeatureGroupImpl.setStyle(getJSObject(),options.getJSObject());
		return this;
	}


	/**
	 * Brings the layer group to the top of all other layers.
	 * @return {@link FeatureGroup}
	 */
	public FeatureGroup bringToFront() {
		FeatureGroupImpl.bringToFront(getJSObject());
		return this;
	}

	/**
	 * Brings the layer group to the bottom of all other layers.
	 * @return {@link FeatureGroup}
	 */
	public FeatureGroup bringToBack() {
		FeatureGroupImpl.bringToBack(getJSObject());
		return this;
	}

	@Override
	public FeatureGroup setOptions(Options options) {
		return (FeatureGroup)super.setOptions(options);
	}

	@Override
	public FeatureGroup setAlias(String alias) {
		return (FeatureGroup)super.setAlias(alias);
	}

}
