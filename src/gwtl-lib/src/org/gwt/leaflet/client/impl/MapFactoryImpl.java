package org.gwt.leaflet.client.impl;

import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;

import org.gwt.leaflet.api.Layers;
import org.gwt.leaflet.api.Map;
import org.gwt.leaflet.api.MapException;
import org.gwt.leaflet.api.MapFactory;
import org.gwt.leaflet.api.Options;
import org.gwt.leaflet.api.TileLayer;
import org.gwt.leaflet.api.WmsLayer;
import org.gwt.leaflet.api.types.Crs;
import com.google.gwt.core.client.JavaScriptObject;

public class MapFactoryImpl implements MapFactory {

	/**
	 * MapFactory overlay type constructor. 
	 */
	protected MapFactoryImpl() { }

	@Override
	public final CrsImpl newCrs(String name) throws MapException {
		
		// Try natively supported first
		if(isCrs_EPSG(name)) return newCrs_EPSG(name);

		// Try WKT conversion?
		if(isCrs_WKT(name)) return newCrs_WKT(name);
		
		// Unrecoverable, notify caller
		throw new UnsupportedOperationException("CRS ["  + name + "] ist not supported");
	}	
	
	private static final boolean isCrs_EPSG(String name) {
		return name.toUpperCase().startsWith("EPSG");
	}

	private static final CrsImpl newCrs_EPSG(String name) throws MapException {
		
		// Try natively supported first
		if(Crs.EPSG_4326.equalsIgnoreCase(name)) return newEPSG_4326();
		else if(Crs.EPSG_3857.equalsIgnoreCase(name)) return newEPSG_3857();
		else if(Crs.EPSG_3395.equalsIgnoreCase(name)) return newEPSG_3395();

		// Unrecoverable, notify caller
		throw new UnsupportedOperationException("CRS ["  + name + "] ist not supported");
	}	
	
	private static final native CrsImpl newEPSG_4326() throws MapException /*-{
		
		// Create object
		var crs = $wnd.L.CRS.EPSG4326;
		
		// Set gwt attributes
		crs.gwt = [];
		crs.gwt.name = "EPSG:4326";
		crs.gwt.epsg = "EPSG:4326";
		crs.gwt.srid = 4326;
		
		// Finished
		return crs;
	
	}-*/;

	private static final native CrsImpl newEPSG_3857() throws MapException /*-{
	
		// Create object
		var crs = $wnd.L.CRS.EPSG3857;
		
		// Set gwt attributes
		crs.gwt = [];
		crs.gwt.name = "EPSG:3857";
		crs.gwt.epsg = "EPSG:3857";
		crs.gwt.srid = 3857;
		
		console.log(crs);
		
		// Finished
		return crs;
	
	}-*/;

	private static final native CrsImpl newEPSG_3395() throws MapException /*-{
	
		// Create object
		var crs = $wnd.L.CRS.EPSG3395;
		
		// Set gwt attributes
		crs.gwt = [];
		crs.gwt.name = "EPSG:3395";
		crs.gwt.epsg = "EPSG:3395";
		crs.gwt.srid = 3395;
		
		// Finished
		return crs;
	
	}-*/;

	private static final boolean isCrs_WKT(String name) {
		name = name.toUpperCase();
		return name.startsWith("PROJCS") 		// Projected CS
			  | name.startsWith("GEOGCS")		// Geographic CS
			  | name.startsWith("GEOCCS")		// Geocentric CS
			  | name.startsWith("VERT_CS");	// Vertical CS
	}

	private static final CrsImpl newCrs_WKT(String name) {
		throw new UnsupportedOperationException("WKT -> CRS conversion is not supported.");
	}
	
	
	@Override
	public final native LatLngImpl newLatLng(double lat, double lon) throws MapException /*-{
	
		// Create object
		return new $wnd.L.LatLng(lat, lon);
	
	}-*/;

	
	@Override
	public final MapImpl newMap(String name, Options options) throws MapException {
		return newMap(name, toJSO(options, Map.DEFAULT));
	}
		
	private static final native MapImpl newMap(String name, JavaScriptObject options) /*-{
		
		// Initialize maps array?
		if($wnd.gwt==undefined) {
			$wnd.gwt = [];
			$wnd.gwt.maps = [];
		}

		// 'name' is also by third-party javascript, rename to prevent mangling.
		var _name = name;

		// Initialize the map on the "name" div with a given center and zoom
		var map = new $wnd.L.Map(_name, options);

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
		$wnd.gwt.maps[_name] = map;
		
		// Finished
		return map; 
		
  	}-*/;

	@Override
	public TileLayerImpl newTileLayer(String url, Options options) throws MapException {				
		return newTileLayer(url,toJSO(options, TileLayer.DEFAULT));
	}
	
	
	private static final native TileLayerImpl newTileLayer(String url, JavaScriptObject options) /*-{
	
		// Create tile layer
		return new $wnd.L.TileLayer(url, options);
	
	}-*/;

	@Override
	public WmsLayerImpl newWmsLayer(String url, Options options) throws MapException {				
		return newWmsLayer(url,toJSO(options, WmsLayer.DEFAULT));
	}
	
	
	private static final native WmsLayerImpl newWmsLayer(String url, JavaScriptObject options) /*-{
	
		// Create tile layer
		return new $wnd.L.TileLayer.WMS(url, options);
	
	}-*/;
	
	@Override
	public LayersImpl newLayers(Options bases, Options overlays) throws MapException {				
		return newLayers(
				toJSO(bases, Layers.DEFAULT),
				toJSO(overlays, Layers.DEFAULT));
	}
	
	
	private static final native LayersImpl newLayers(JavaScriptObject bases, JavaScriptObject overlays) /*-{
	
		// Create Layers
		return new $wnd.L.Control.Layers(bases, overlays);
	
	}-*/;	

	@Override
	public final native AttributionImpl newAttribution(String prefix, String text) /*-{
	
		// Create Attribution
		var a = new $wnd.L.Control.Attribution();
		
		// Set prefix and text
		a.setPrefix(prefix);
		a.addAttribution(text);
		
		// Finished
		return a;
	
	}-*/;	
	
	
	/**
	 * Convert {@link Options} into {@link JavaScriptObject}
	 * 
	 * @param options {@link Options} to assert 
	 * @param required Required {@link Options}
	 * @return {@link JavaScriptObject}
	 */
	public static final JavaScriptObject toJSO(Options options, Options required) {
		// Make mutable clone
		required = required.clone(false);
		// Overwrite default values
		required.putAll(options);
		// Collection options with empty values
		Set<String> keys = new HashSet<String>(options.size());
		// Sanity check
		assertOptions(required);
		// Remove empty non-required options (default values will be used by the Leaflet instead)
		if(!keys.isEmpty()) required.keySet().removeAll(keys);
		// Finished
		return options.toJSON().getJavaScriptObject();
	}

	private static final Set<String> assertOptions(Options options) {
		Set<String> remove = new HashSet<String>(options.size());
		for(Entry<String,Object> e : options.entrySet()) {
			// Get key and value
			String key = e.getKey();
			Object object = e.getValue();
			// Sanity check
			String value = assertOption(options, key, object);
			// Add to keys? (applies on to only mutable options)
			if(!options.isImmutable() && (value==null || value.isEmpty())) remove.add(key);
		}		
		// Finished
		return remove;
	}
	
	private static final String assertOption(Options options, String key, Object value) {
		// Cast to string
		String s = (value != null ? String.valueOf(value): null);		
		// Sanity check
		if(options.isRequired(key) && (s==null || s.isEmpty())) {
			// Option missing?
			String reason = (options.containsKey(key) ? "no option found" : "no value set");
			// Raise exception
			throw new MapException("Option ["+key+"] is required: " + reason);				
		}
		// Option is valid
		return s;
	}
	
}
