package org.discotools.gwt.leaflet.client.layers.others;

import org.discotools.gwt.leaflet.client.jsobject.JSObject;


/**
 * GeoJSONImpl implementation class
 * @author Lionel Leiva-Marcon
 *
 */
public class GeoJSONImpl extends FeatureGroupImpl {

	/**
	 * Create the GeoJSON.
	 * <p>
	 * Options methods are called by means of jnsi ( [instance-expr.]@class-name::methodName(args) )
	 * 
	 * @param data
	 * @param options
	 * @return
	 */
	public static native JSObject create(String data, GeoJSONOptions options)/*-{	
	    var json = JSON.parse(data);
		return new $wnd.L.geoJson(json,
		{
			pointToLayer : function(feature,latlng) {
				return options.@org.discotools.gwt.leaflet.client.layers.others.GeoJSONOptions::pointToLayer(Lorg/discotools/gwt/leaflet/client/jsobject/JSObject;Lorg/discotools/gwt/leaflet/client/jsobject/JSObject;)(feature, latlng);
			},
			
			onEachFeature : function(feature,layer) {
	      		return options.@org.discotools.gwt.leaflet.client.layers.others.GeoJSONOptions::onEachFeature(Lorg/discotools/gwt/leaflet/client/jsobject/JSObject;Lorg/discotools/gwt/leaflet/client/jsobject/JSObject;)(feature, layer);
			},
			
			style : function(feature) {
				return options.@org.discotools.gwt.leaflet.client.layers.others.GeoJSONOptions::style(Lorg/discotools/gwt/leaflet/client/jsobject/JSObject;)(feature);									
			},
			
			filter: function(feature,layer) {
				return options.@org.discotools.gwt.leaflet.client.layers.others.GeoJSONOptions::filter(Lorg/discotools/gwt/leaflet/client/jsobject/JSObject;Lorg/discotools/gwt/leaflet/client/jsobject/JSObject;)(feature, layer);
			}
		});
		
	}-*/;	
	
	public static native  void addData(JSObject self, String data) /*-{
	    var json = JSON.parse(data);
		self.addData(json);
	}-*/;

	public static native  void addTo(JSObject self, JSObject map) /*-{
		self.addTo(map);
	}-*/;
	
	public static native  void resetStyle(JSObject self, JSObject layer) /*-{
		self.resetStyle(layer);
	}-*/;
	
}
