package org.gwt.leaflet.impl.map;


import org.gwt.leaflet.api.LeafletException;
import org.gwt.leaflet.api.Options;
import org.gwt.leaflet.api.map.Map;
import org.gwt.leaflet.api.map.MapFactory;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * {@link MapFactory} implementation.
 * 
 * @author kengu
 *
 */
public class MapFactoryImpl implements MapFactory {

	@Override
	public final MapImpl create(String name, Options options) throws LeafletException {
		return newMap(name, Options.toJSO(options, Map.DEFAULT));
	}
		
	private static final native MapImpl newMap(String name, JavaScriptObject options) /*-{
		
		// Initialize maps array?
		if($wnd.gwtl==undefined) {
			$wnd.gwtl = [];
			$wnd.gwtl.maps = [];
		}

		// 'name' is also by third-party javascript, rename to prevent mangling.
		var _name = name;

		// Initialize the map on the "name" div with a given center and zoom
		var map = $wnd.L.map(_name, options);
		
//		// Add lat/lon popup
//		map.on('click', onMapClick);
//		var popup = new $wnd.L.Popup();
//		function onMapClick(e) {
//			var latlngStr = '(' + e.latlng.lat.toFixed(3) + ', ' + e.latlng.lng.toFixed(3) + ')';
//
//			popup.setLatLng(e.latlng);
//			popup.setContent("You clicked the map at " + latlngStr);
//			map.openPopup(popup);
//		}
		
		// Set gwt attributes
		map.gwt = [];
		map.gwt.name = _name;

		// Assoicate map instance with given name
		$wnd.gwtl.maps[_name] = map;
		
		// Finished
		return map; 
		
  	}-*/;

	
}
