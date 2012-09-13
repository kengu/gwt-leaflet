package org.gwt.leaflet.client.layers.others;

import org.gwt.leaflet.client.jswraps.JSObject;
import org.gwt.leaflet.client.options.GeoJsonOptions;


/**
 * GeoJSONImpl implementation class
 * @author Lionel Leiva-Marcon
 *
 */
public class GeoJSONImpl  {

	/**
	 * Create the GeoJSON
	 * Options methods are called by means of jnsi ( [instance-expr.]@class-name::methodName(args) )
	 * 
	 * @param data
	 * @param options
	 * @return
	 */
	public static native JSObject create(String data, GeoJsonOptions options)/*-{	
	    var json = JSON.parse(data);
		return new $wnd.L.geoJson(json,
			{
					pointToLayer : function(feature,latlng) {
										return  options.@org.gwt.leaflet.client.options.GeoJsonOptions::pointToLayer(Lorg/gwt/leaflet/client/jswraps/JSObject;Lorg/gwt/leaflet/client/jswraps/JSObject;)(feature, latlng);
								  },
					onEachFeature : function(feature,layer) {
			      						return options.@org.gwt.leaflet.client.options.GeoJsonOptions::onEachFeature(Lorg/gwt/leaflet/client/jswraps/JSObject;Lorg/gwt/leaflet/client/jswraps/JSObject;)(feature, layer);
								  },
					style : function(feature) {
			      						return options.@org.gwt.leaflet.client.options.GeoJsonOptions::style(Lorg/gwt/leaflet/client/jswraps/JSObject;)(feature);									
								  }
								  ,
					filter: function(feature,layer) {
			      						return options.@org.gwt.leaflet.client.options.GeoJsonOptions::filter(Lorg/gwt/leaflet/client/jswraps/JSObject;Lorg/gwt/leaflet/client/jswraps/JSObject;)(feature, layer);
								  }
			}
	  );
	}-*/;	
	
	public static native  void addData(JSObject self, String data) /*-{
	    var json = JSON.parse(data);
		self.addData(json);
	}-*/;

	public static native  void addTo(JSObject self, JSObject map) /*-{
		self.addTo(map);
	}-*/;
	
}
