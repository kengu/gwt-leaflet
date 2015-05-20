package org.discotools.gwt.leaflet.client.map;

import org.discotools.gwt.leaflet.client.controls.IControl;
import org.discotools.gwt.leaflet.client.events.handler.EventProvider;
import org.discotools.gwt.leaflet.client.jsobject.JSObject;
import org.discotools.gwt.leaflet.client.jsobject.JSObjectWrapper;
import org.discotools.gwt.leaflet.client.layers.ILayer;
import org.discotools.gwt.leaflet.client.popup.Popup;
import org.discotools.gwt.leaflet.client.types.LatLng;
import org.discotools.gwt.leaflet.client.types.LatLngBounds;
import org.discotools.gwt.leaflet.client.types.Point;

import com.google.gwt.dom.client.Element;

/**
 * The central class of the API — it is used to create a map on a page and manipulate it.
 *
 * @author kennethg
 * @author Lionel Leiva-Marcon
 *
 * @see <a href="http://leaflet.cloudmade.com/reference.html#map-class">L.Map (Leaflet API)</a>
 *
 * @version 0.1 : Add of JSObjectWrapper Inheritance (inspired from GWT-OpenLayer)
 */
public class Map extends JSObjectWrapper implements EventProvider {

    protected Map(JSObject e) {
        super(e);
    }

    public Map(String name) {
        this(name, new MapOptions());
    }

    public Map(String name, MapOptions options) {
        this(MapImpl.create(name, options.getJSObject()));
    }

    /**
     * Sets the view of the map (geographical center and zoom).
     * <p>
     * If 'reset' is set to <code>true</code>, the map is reloaded
     * even if it's eligible for pan or zoom animation (false by default).
     *
     * @param center - {@link LatLng} instance
     * @param zoom - Map zoom
     * @param reset - Force reset of map
     * @return {@link Map}
     */
    public Map setView(LatLng center, double zoom, boolean reset) {
    	MapImpl.setView(getJSObject(), center.getJSObject(), zoom, reset);
    	return this;
    }

    public Map setZoom(double zoom) {
    	MapImpl.setZoom(getJSObject(), zoom);
    	return this;
    }

    public Map zoomIn(){
    	MapImpl.zoomIn(getJSObject());
    	return this;
    }

    public Map remove(){
    	MapImpl.remove(getJSObject());
    	return this;
    }

    public Map zoomOut() {
    	MapImpl.zoomOut(getJSObject());
    	return this;
    }

    public Map addLayer(ILayer layer, boolean bottom) {
    	MapImpl.addLayer(getJSObject(), layer.getJSObject(), bottom);
    	return this;
    }

    public Map addLayer(ILayer layer) {
    	MapImpl.addLayer(getJSObject(), layer.getJSObject());
    	return this;
    }

    /**
     * Adds the given control to the map.
     * @param control - {@link IControl} instance
     * @return {@link Map}
     */
    public Map addControl(IControl control) {
    	MapImpl.addControl(getJSObject(), control.getJSObject());
    	return this;
    }

    /**
     * Removes the given control from the map.
     * @param control
     * @return {@link Map}
     */
    public Map removeControl(IControl control) {
    	MapImpl.removeControl(getJSObject(), control.getJSObject());
    	return this;
    }


    public Map fitBounds(LatLngBounds bounds) {
    	MapImpl.fitBounds(getJSObject(), bounds.getJSObject());
    	return this;
	}

    /**
     * Sets a map view that mostly contains the whole world with the maximum zoom level possible.
     *
     * @return
     */
    public Map fitWorld() {
    	MapImpl.fitWorld(getJSObject());
    	return this;
    }

    public Map removeLayer(ILayer layer) {
        MapImpl.removeLayer(getJSObject(), layer.getJSObject());
        return this;
    }

    /**
     * Returns the map layer point that corresponds to the given geographical coordinates (useful for placing overlays on the map).
     * @param latLng
     * @return
     */
    public Point latLngToLayerPoint(LatLng latLng){
        return new Point(MapImpl.latLngToLayerPoint(getJSObject(),latLng.getJSObject()));
    }

    /**
     * Returns the geographical coordinates of a given map layer point.
     * @param point
     * @return
     */
    public LatLng layerPointToLatLng(Point point){
        return new LatLng(MapImpl.layerPointToLatLng(getJSObject(),point.getJSObject()));
    }

    /**
     *
     * @return Returns the LatLngBounds of the current map view.
     */
    public LatLngBounds getBounds() {
        return new LatLngBounds(MapImpl.getBounds(getJSObject()));
    }
    
    /**
     * 
     * @return Returns the geographical center of the map view.
     */
    public LatLng getCenter() {
    	return new LatLng(MapImpl.getCenter(getJSObject()));
    }

    /**
     * Pans the map to a given center. Makes an animated pan if new center is not more than one screen away from the current one.
     * @param latLng
     */
    public Map panTo(LatLng latLng) {
        MapImpl.panTo(getJSObject(),latLng.getJSObject());
        return this;
    }

    /**
     * Opens the specified popup while closing the previously opened (to make sure only one is opened at one time for usability).
     * @param popup
     * @return this
     */
    public Map openPopup(Popup popup) {
        MapImpl.openPopup(getJSObject(),popup.getJSObject());
        return this;
    }

    /**
     * Closes the popup opened with {@link #openPopup(Popup)}
     * @return this
     */
    public Map closePopup() {
        MapImpl.closePopup(getJSObject());
        return this;
    }

    /**
     *
     * @return Returns the current zoom of the map view.
     */
    public int getZoom() {
        return MapImpl.getZoom(getJSObject());
    }

    /**
     * Checks if the map container size changed and updates the map if so — call it after you've changed the map size dynamically. If animate is true, map animates the update
     * @param animate
     * @return
     */
    public Map invalidateSize(boolean animate){
        MapImpl.invalidateSize(getJSObject(),animate);
        return this;
    }

    /**
     *
     * @return Returns the container element of the map.
     */
    public Element getContainer() {
        return MapImpl.getContainer(getJSObject());
    }

    /**
     * Pans the map to the closest view that would lie inside the given bounds (if it's not already).
     * @param bounds
     * @return
     */
    public Map panInsideBounds(LatLngBounds bounds) {
        MapImpl.panInsideBounds(getJSObject(),bounds.getJSObject());
        return this;
    }

    /**
     * Pans the map by a given number of pixels (animated).
     *
     * @param point
     * @return
     */
    public Map panBy(Point point) {
    	MapImpl.panBy(getJSObject(), point.getJSObject());
    	return this;
    }

    /**
     * Returns the current size of the map container.
     *
     * @return
     */
    public Point getSize() {
    	return new Point(MapImpl.getSize(getJSObject()));
    }
}
