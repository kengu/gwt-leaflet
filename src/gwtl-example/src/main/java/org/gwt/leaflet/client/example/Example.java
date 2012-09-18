/*******************************************************************************
 * Copyright 2011 Google Inc. All Rights Reserved.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
package org.gwt.leaflet.client.example;

import org.gwt.leaflet.client.controls.Position;
import org.gwt.leaflet.client.controls.layers.Layers;
import org.gwt.leaflet.client.controls.scale.Scale;
import org.gwt.leaflet.client.controls.search.Search;
import org.gwt.leaflet.client.controls.zoom.Zoom;
import org.gwt.leaflet.client.crs.epsg.EPSG3395;
import org.gwt.leaflet.client.jswraps.JSObject;
import org.gwt.leaflet.client.layers.others.GeoJSON;
import org.gwt.leaflet.client.layers.others.LayerGroup;
import org.gwt.leaflet.client.layers.raster.TileLayer;
import org.gwt.leaflet.client.layers.raster.WmsLayer;
import org.gwt.leaflet.client.layers.vector.Circle;
import org.gwt.leaflet.client.layers.vector.Polyline;
import org.gwt.leaflet.client.layers.vector.Rectangle;
import org.gwt.leaflet.client.map.Map;
import org.gwt.leaflet.client.marker.Marker;
import org.gwt.leaflet.client.options.ControlOptions;
import org.gwt.leaflet.client.options.GeoJsonOptions;
import org.gwt.leaflet.client.options.IconOptions;
import org.gwt.leaflet.client.options.MapOptions;
import org.gwt.leaflet.client.options.MarkerOptions;
import org.gwt.leaflet.client.options.Options;
import org.gwt.leaflet.client.options.ScaleControlOptions;
import org.gwt.leaflet.client.options.SearchControlOptions;
import org.gwt.leaflet.client.options.ZoomControlOptions;
import org.gwt.leaflet.client.options.features.GeoJsonFeatures;
import org.gwt.leaflet.client.types.Icon;
import org.gwt.leaflet.client.types.LatLng;
import org.gwt.leaflet.client.types.LatLngBounds;
import org.gwt.leaflet.client.types.Point;
import org.gwt.leaflet.client.widget.MapWidget;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Example implements EntryPoint {
		
	Map map;
	GeoJsonOptions choroplethOptions;
	GeoJSON choroplethJson;
	private InfoControl infoControl;
	private LegendControl legendControl;

	public void onModuleLoad() {
	
		// Fit MapWidget to device screen
		RootPanel rootPanel = RootPanel.get();
		rootPanel.setStyleName("gwt-Body");
		MapWidget mapWidget = new MapWidget("map");
		rootPanel.add(mapWidget);
		mapWidget.setHeight("");
		mapWidget.setStyleName("gwt-Map");

		// Create mutable WmsLayer options
//		Options options = Map.DEFAULT.clone(false);
	//	ICRS crs = L.crs().create(CRS.EPSG3857);
	//	options.put("crs", crs);
	//	options.put("zoomControl", false);
		
		// Create Map instance
		MapOptions loptions = new MapOptions();
		loptions.setCenter(new LatLng(0, 0));
		loptions.setZoom(13);

	 	map = new Map("map", loptions);
	 	
		// Create TileLayer url template
		String url = "http://{s}.tile.cloudmade.com/BC9A493B41014CAABB98F0471D759707/997/256/{z}/{x}/{y}.png";

		// Create mutable TileLayer options
		Options tileOptions = new Options();	
		tileOptions.setProperty("attribution", "Map data &copy; 2011 OpenStreetMap contributors, Imagery &copy; 2011 CloudMade");
		
		// Create TileLayer instance
		TileLayer tile = new TileLayer(url, tileOptions);
 
		// Create WmsLayer url
		url = "http://wms.latlon.org";
		
		// Create mutable WmsLayer options
		Options wmsOptions = new Options();	
		wmsOptions.setProperty("layers", "Map data &copy; 2011 OpenStreetMap contributors, Imagery &copy; 2011 CloudMade");
		wmsOptions.setProperty("attribution", "Map data &copy; 2011 OpenStreetMap contributors, Imagery &copy; 2011 CloudMade");

		// Required version: origin/master
		EPSG3395 vCRS_EPSG3395 = new EPSG3395();
//		EPSG4326 vCRS_EPSG4326 = new EPSG4326();
//		EPSG3857 vCRS_EPSG3857 = new EPSG3857();
		
		//Simple   vCRS_Simple   = new Simple(); 
		wmsOptions.setProperty("crs", vCRS_EPSG3395);
	
		// Create Leaflet WMSLayer instance
		WmsLayer wms = new WmsLayer(url, wmsOptions);

		
		// Create layer switcher control
		Options bases = new Options();	
		bases.setProperty("WMS",wms);
		bases.setProperty("Tile",tile);

		Options overlays =new Options();
		//overlays.setProperty("Test",tile);
		
		ControlOptions controlOptions = new ControlOptions(); 
		controlOptions.setPosition(Position.BOTTOM_RIGHT);

		// LayerGroup
		LatLng glatlng1 = new LatLng(59.920, 10.754);
		LatLng glatlng2 = new LatLng(59.922, 10.750);
		LatLng glatlng3 = new LatLng(59.924, 10.752);
		LatLng glatlng4 = new LatLng(59.926, 10.756);
		
		MarkerOptions opt1 = new MarkerOptions();
		opt1.setTitle("marker1");
		MarkerOptions opt2 = new MarkerOptions();
		opt2.setTitle("marker2");
		MarkerOptions opt3 = new MarkerOptions();
		opt3.setTitle("marker3");
		MarkerOptions opt4 = new MarkerOptions();
		opt4.setTitle("marker4");
		Marker marker1 = new Marker(glatlng1,opt1);
		Marker marker2 = new Marker(glatlng2,opt2);
		Marker marker3 = new Marker(glatlng3,opt3);
		Marker marker4 = new Marker(glatlng4,opt4);

		Marker[] markers = new Marker[] {marker1, marker2};
		LayerGroup groupMarkers1 = new LayerGroup(markers);

		Marker[] markers2 = new Marker[] {marker3, marker4};
		LayerGroup groupMarkers2 = new LayerGroup(markers2);
		overlays.setProperty("Group marker 1", groupMarkers1);
		overlays.setProperty("Group marker 2", groupMarkers2);
		
		// Add layers control to map 
		Layers control = new Layers(bases,overlays, controlOptions);
		control.addTo(map);
		
		// Create map center position		
		IconOptions iconOptions = new IconOptions();
		
		
		iconOptions.setIconUrl(GWT.getHostPageBaseURL()+"images/icon-info.png");
		iconOptions.setIconSize(new Point(32, 37));
		iconOptions.setIconAnchor(new Point(16, 37));
		iconOptions.setPopupAnchor(new Point(0, -28));
		Icon icon = new Icon(iconOptions);

		//TODO Solve iconurl problem
		//loptions.setProperty("icon", icon);
		
		LatLng latlng = new LatLng(59.915, 10.754);
		Marker marker = new Marker(latlng,loptions);
		marker.addTo(map);
		marker.bindPopup("<b>Here is a simple popup<b>");
		// Add layers to map and center at given position
		map.setView(latlng, 2, false);
		map.addLayer(tile); 
		
		LatLng latlng1 = new LatLng(59.915, 10.759);
		LatLng latlng2 = new LatLng(59.900, 10.800);
		LatLng latlng3 = new LatLng(59.990, 10.800);
		LatLng[] latlngs = new LatLng[] {latlng1, latlng2, latlng3};
		GWT.log("size   :" + latlngs.length);
		for(LatLng l : latlngs) {
			GWT.log("string :" + l.toString());
		}
		GWT.log("Polyline");
		Polyline poly = new Polyline(latlngs, new Options());
		poly.addTo(map);
		
		//Circle 
		GWT.log("Circle");
		Options circleOptions = new Options();
		circleOptions.setProperty("color", "red");
		Circle circle = new Circle(latlng,200,circleOptions);
		circle.addTo(map);

		// Rectangle
		GWT.log("Rectangle");
		LatLng rec1 = new LatLng(59.900, 10.705);
		LatLng rec2 = new LatLng(59.910, 10.710);
		LatLng[] recs = new LatLng[] {rec1, rec2};
		LatLngBounds bounds = new LatLngBounds(recs);
		Rectangle rec = new Rectangle(bounds, new Options());
		rec.addTo(map);
		//map.fitBounds(bounds);
		
		// Add Scale Control 
		GWT.log("Scale Control");
		ScaleControlOptions scaleOptions = new ScaleControlOptions();
		Scale scale = new Scale(scaleOptions);
		scale.addTo(map);

		// Add Zoom Control 
		GWT.log("Zoom Control");
		ZoomControlOptions zoomOptions = new ZoomControlOptions();
		zoomOptions.setPosition(Position.TOP_RIGHT);
		Zoom zoom = new Zoom(zoomOptions);
		zoom.addTo(map);
		
		// Add Search Control
		GWT.log("Search Control");
		SearchControlOptions searchOptions = new SearchControlOptions();
		searchOptions.setSearchLayer(groupMarkers1); 
		searchOptions.setZoom(15); 
		searchOptions.setText("Search Area"); 
		searchOptions.setTextErr("Not found"); 
		searchOptions.setPosition(Position.TOP_RIGHT);
		Search search = new Search(searchOptions);
		search.addTo(map);
		
		// Add Choropleth
		GWT.log("Choropleth");
		createChoropleth();
		
		// Add GEOJson
		GWT.log("GeoJson");
		createJsonSamples();
		
	} 
	
	public void createJsonSamples() {
		String freeBus       = GeoJsonSampleFactory.getInstance().createFreeBus();
		String lightRailStop = GeoJsonSampleFactory.getInstance().createLightRailStop();
		String bicycleRental = GeoJsonSampleFactory.getInstance().createBicycleRental();
		String campus        = GeoJsonSampleFactory.getInstance().createCampus();
		String coorsField    = GeoJsonSampleFactory.getInstance().createCoorsField();
				
		GeoJsonFeatures features1 = new GeoJsonFeatures() {
			
			@Override
			public JSObject style(JSObject self) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public JSObject pointToLayer(JSObject feature, JSObject latlng) {
				return new Marker(new LatLng(latlng), new Options()).getJSObject();
			}
			
			@Override
			public JSObject onEachFeature(JSObject feature, JSObject layer) {
				return myOnEachFeature(feature, layer);
			}
			
			@Override
			public boolean filter(JSObject self, JSObject layer) {
				return myFilter(self, layer);
			}
		};
		
		GeoJsonFeatures features2 = new GeoJsonFeatures() {
			
			@Override
			public JSObject style(JSObject self) {
				return null;
				
			}
			
			@Override
			public JSObject pointToLayer(JSObject feature, JSObject latlng) {
				return new Marker(new LatLng(latlng), new Options()).getJSObject();
			}
			
			@Override
			public JSObject onEachFeature(JSObject feature, JSObject layer) {
				return myOnEachFeature2(feature, layer);
			}
			
			@Override
			public boolean filter(JSObject self, JSObject layer) {
				return myFilter(self, layer);
			}
		};


		GeoJsonFeatures features3 = new GeoJsonFeatures() {
			
			@Override
			public JSObject style(JSObject feature) {
				return myStyle(feature);
				
			}
			
			@Override
			public JSObject pointToLayer(JSObject feature, JSObject latlng) {
				return myPointToLayer(feature, latlng);
			}
			
			@Override
			public JSObject onEachFeature(JSObject feature, JSObject layer) {
				return myOnEachFeature2(feature, layer);
			}
			
			@Override
			public boolean filter(JSObject self, JSObject layer) {
				return myFilter(self, layer);
			}
		};
		
		GeoJsonOptions coorsOptions         = new GeoJsonOptions(features1);
		GeoJsonOptions freeBusOptions       = new GeoJsonOptions(features2);
		GeoJsonOptions bicycleRentalOptions = new GeoJsonOptions(features3);

		GeoJSON geojson_lightRailStop = new GeoJSON(lightRailStop , freeBusOptions);
		GeoJSON geojson_bicycleRental = new GeoJSON(bicycleRental , bicycleRentalOptions);
		GeoJSON geojson_campus        = new GeoJSON(campus        , bicycleRentalOptions);
		GeoJSON geojson_coorsField    = new GeoJSON(coorsField    , coorsOptions);
		GeoJSON geojson_freeBus       = new GeoJSON(freeBus       , freeBusOptions);
		
		geojson_freeBus      .addTo(map);
		geojson_lightRailStop.addTo(map);
		geojson_bicycleRental.addTo(map);
		geojson_campus       .addTo(map);
		geojson_coorsField   .addTo(map);
	}
	
	public static native JSObject myOnEachFeature(JSObject feature, JSObject layer) /*-{
   	var popupContent = "<p> <b>myOnEachFeature</b> " +
				feature.geometry.type + ", but now I'm a Leaflet vector!</p>";

		if (feature.properties && feature.properties.popupContent) {
			popupContent += feature.properties.popupContent;
		}

		layer.bindPopup(popupContent);
		return layer;
}-*/;
	
	public static native JSObject myOnEachFeature2(JSObject feature, JSObject layer) /*-{
   	var popupContent = "<p> <b>myOnEachFeature2</b> " +
				feature.geometry.type + ", but now I'm a Leaflet vector!</p>";

		if (feature.properties && feature.properties.popupContent) {
			popupContent += feature.properties.popupContent;
		}

		layer.bindPopup(popupContent);
		return layer;
}-*/;

	public static native JSObject myPointToLayer(JSObject feature, JSObject latlng) /*-{
			return $wnd.L.circleMarker(latlng, {
				radius: 8,
				fillColor: "#ff7800",
				color: "#000",
				weight: 1,
				opacity: 1,
				fillOpacity: 0.8
			});
	}-*/;
	
	public static native JSObject myStyle(JSObject feature) /*-{
		return feature.properties && feature.properties.style;
	}-*/;
	
	public static native boolean myFilter(JSObject feature, JSObject layer) /*-{
		if (feature.properties) {
			// If the property "underConstruction" exists and is true, return false (don't render features under construction)
			return feature.properties.underConstruction !== undefined ? !feature.properties.underConstruction : true;
		}
		return false;
	}-*/;
	
	/***********************************************************************
	 * Choropleth 
	 * From : http://leaflet.cloudmade.com/examples/choropleth-example.html
	 ***********************************************************************/
	public void createChoropleth() {
		//Custom Legend 
		Options legendOptions = new Options();
		legendOptions.setProperty("position", Position.BOTTOM_RIGHT);
		legendControl = new LegendControl(legendOptions);
		legendControl.addTo(map);
						
		//Info Legend 
		Options infoOptions = new Options();
		infoOptions.setProperty("position", Position.TOP_RIGHT);
		infoControl = new InfoControl(infoOptions);
		infoControl.addTo(map);
				
		String states = GeoJsonSampleFactory.getInstance().createUSStates();
		GeoJsonFeatures choroplethFeatures = new GeoJsonFeatures() {
			 
			@Override
			public JSObject style(JSObject feature) {
				return myStyleUS(feature);
			}
			
			@Override
			public JSObject pointToLayer(JSObject feature, JSObject latlng) {
				return myPointToLayerUS(feature, latlng);
			}
			
			@Override
			public JSObject onEachFeature(JSObject feature, JSObject layer) {
				return myOnEachFeatureUS(feature, layer);
			}
			
			@Override
			public boolean filter(JSObject feature, JSObject layer) {
				return true;
			}
		};
		choroplethOptions = new GeoJsonOptions(choroplethFeatures);
		choroplethJson = new GeoJSON(states,choroplethOptions);
		choroplethJson.addTo(map);
		choroplethJson.setAlias("choroplethJson");
		
	}
	
	public static native JSObject myStyleUS(JSObject feature) /*-{
	return {	
		fillColor: @org.gwt.leaflet.client.example.Example::getColor(I)(feature.properties.density),	
        weight: 2,
        opacity: 1,
        color: 'white',
        dashArray: '3',
        fillOpacity: 0.7
    };
	}-*/;
	
	public static native String getColor(int d) /*-{
	    return d > 70 ? '#800026' :
	           d > 60  ? '#BD0026' :
	           d > 50  ? '#E31A1C' :
	           d > 40  ? '#FC4E2A' :
	           d > 30   ? '#FD8D3C' :
	           d > 20   ? '#FEB24C' :
	           d > 10   ? '#FED976' :
	                      '#FFEDA0';
	}-*/;
	
	public static native JSObject myOnEachFeatureUS(JSObject feature, JSObject layer) /*-{

   		layer.on({
        mouseover: function(e) {
        		       @org.gwt.leaflet.client.example.Example::highlightFeature(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
                   }, 
        mouseout : function(e) {
        	           @org.gwt.leaflet.client.example.Example::resetHighlight(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
        		   },
        click    : function(e) {
        	           @org.gwt.leaflet.client.example.Example::zoomToFeature(Lcom/google/gwt/core/client/JavaScriptObject;)(e);
        		   }
    			});
	}-*/;
	
	public static native JSObject myPointToLayerUS(JSObject feature, JSObject latlng) /*-{
	return $wnd.L.circleMarker(latlng, {
		radius: 8,
		fillColor: "#ff7800",
		color: "#000",
		weight: 1,
		opacity: 1,
		fillOpacity: 0.8
	});
}-*/;
	
	/**
	 * Highlight method 
	 * @param e
	 */
	public native static void highlightFeature(JavaScriptObject e) /*-{
	    var layer = e.target;
	   
	    layer.setStyle({
	        weight: 5,
	        color: '#666',
	        dashArray: '',
	        fillOpacity: 0.7
	    });
		@org.gwt.leaflet.client.example.InfoControl::doUpdate(Ljava/lang/String;Ljava/lang/String;)(layer.feature.properties.name, ''+layer.feature.properties.density);
  		
	    if (!L.Browser.ie && !L.Browser.opera) {
	        layer.bringToFront(); 
	    }	    
	    
	}-*/;
		
	public native static void  resetHighlight(JavaScriptObject e) /*-{
		var geojson = $wnd.gwtl.alias['choroplethJson'];
		geojson.resetStyle(e.target);
		@org.gwt.leaflet.client.example.InfoControl::doUpdate(Ljava/lang/String;Ljava/lang/String;)('-', '0');
  		
	}-*/;
	
	public native static void  zoomToFeature(JavaScriptObject e) /*-{
	    var map = $wnd.gwtl.maps['map'];
		map.fitBounds(e.target.getBounds());
	}-*/; 

}