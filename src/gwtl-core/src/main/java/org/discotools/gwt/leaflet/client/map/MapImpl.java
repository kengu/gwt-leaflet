package org.discotools.gwt.leaflet.client.map;

import org.discotools.gwt.leaflet.client.jsobject.JSObject;

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
	
	public static native JSObject addControl(JSObject self,JSObject control) /*-{	
		self.addControl(control); 		
		return self;
	}-*/;

	
	public static native JSObject fitBounds(JSObject self,JSObject bounds) /*-{	
		self.fitBounds(bounds); 		
	}-*/;
}
