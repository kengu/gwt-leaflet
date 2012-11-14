package org.discotools.gwt.leaflet.client.map;

import org.discotools.gwt.leaflet.client.jsobject.JSObject;
import org.discotools.gwt.leaflet.client.types.Point;

/**
 * Map implementation
 * @author Lionel Leiva-Marcon
 */
class MapImpl {
 
	public static native JSObject create(String name, JSObject options) /*-{
	
		// Initialize maps array?
		if($wnd.gwtl==undefined) {
			$wnd.gwtl = [];
			$wnd.gwtl.maps = [];
		}
	
		// 'name' is also by third-party javascript, rename to prevent mangling.
		var _name = name;
	
		// Initialize the map on the "name" div with a given center and zoom
		var map = $wnd.L.map(_name, options);	
			
		// Set gwt attributes
		map.gwt = [];
		map.gwt.name = _name;
	
		// Associate map instance with given name
		$wnd.gwtl.maps[_name] = map;
		
		// Finished
		return map; 
	}-*/;
	

	public static native JSObject setView(JSObject self,JSObject center, double zoom, boolean reset) /*-{		
		self.setView(center,zoom,reset); return self;
  	}-*/;

	public static native JSObject setZoom(JSObject self,double zoom) /*-{	
		self.setZoom(zoom); return self;
	}-*/;

	public static native JSObject zoomIn(JSObject self) /*-{	
		self.zoomIn(); return self;
	}-*/;

	public static native JSObject zoomOut(JSObject self) /*-{	
		self.zoomOut(); return self;
	}-*/;

	public static JSObject addLayer(JSObject self,JSObject layer) {
		return addLayer(self, layer, false);
	}

	public static native JSObject addLayer(JSObject self,JSObject layer, boolean bottom) /*-{	
		self.addLayer(layer,bottom); 
		return self;
	}-*/;
	
    public static native JSObject removeLayer(JSObject self,JSObject layer) /*-{  
        self.removeLayer(layer); 
        return self;
    }-*/;
    
	public static native JSObject addControl(JSObject self,JSObject control) /*-{	
		self.addControl(control); 		
		return self;
	}-*/;

	
	public static native JSObject fitBounds(JSObject self,JSObject bounds) /*-{	
		self.fitBounds(bounds); 		
	}-*/;


    public static native Point latLngToLayerPoint(JSObject self, JSObject latLng) /*-{
        return self.latLngToLayerPoint(latLng);
    }-*/;


    public static native JSObject layerPointToLatLng(JSObject self, Point point) /*-{
        return self.layerPointToLatLng(point);
    }-*/;


    public static native JSObject getBounds(JSObject self) /*-{
        return self.getBounds();
    }-*/;


    public static native void panTo(JSObject self, JSObject latLng)/*-{
        self.panTo(latLng);
    }-*/;


    public static native void openPopup(JSObject self, JSObject popup) /*-{
        self.openPopup(popup);
    }-*/;



    public static native void closePopup(JSObject self) /*-{
        self.closePopup();
    }-*/;


    public static native int getZoom(JSObject self) /*-{
        return self.getZoom();
    }-*/;


    public static native void invalidateSize(JSObject self, boolean animate) /*-{
        self.invalidateSize( animate);
    }-*/;






}
