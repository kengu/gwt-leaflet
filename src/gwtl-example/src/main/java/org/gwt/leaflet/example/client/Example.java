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
package org.gwt.leaflet.example.client;

import org.gwt.leaflet.client.controls.Position;
import org.gwt.leaflet.client.controls.layers.Layers;
import org.gwt.leaflet.client.controls.scale.Scale;
import org.gwt.leaflet.client.controls.zoom.Zoom;
import org.gwt.leaflet.client.layers.others.LayerGroup;
import org.gwt.leaflet.client.layers.raster.TileLayer;
import org.gwt.leaflet.client.layers.raster.WmsLayer;
import org.gwt.leaflet.client.layers.vector.Circle;
import org.gwt.leaflet.client.layers.vector.Polyline;
import org.gwt.leaflet.client.map.Map;
import org.gwt.leaflet.client.marker.Marker;
import org.gwt.leaflet.client.options.ControlOptions;
import org.gwt.leaflet.client.options.MapOptions;
import org.gwt.leaflet.client.options.Options;
import org.gwt.leaflet.client.options.ScaleControlOptions;
import org.gwt.leaflet.client.options.ZoomControlOptions;
import org.gwt.leaflet.client.types.LatLng;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Example implements EntryPoint {
		
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

	 	Map map =new Map("map", loptions);
		
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
		//crs = L.crs().create(CRS.EPSG4326);
		//wmsOptions.setProperty("crs", crs);
	
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
		Marker marker1 = new Marker(glatlng1,new Options());
		Marker marker2 = new Marker(glatlng2,new Options());

		Marker[] markers = new Marker[] {marker1, marker2};
		LayerGroup groupMarkers = new LayerGroup(markers);
		overlays.setProperty("Group marker", groupMarkers);
		
		// Add layers control to map 
		Layers control = new Layers(bases,overlays, controlOptions);
		control.addTo(map);
		
		// Create map center position		
		LatLng latlng = new LatLng(59.915, 10.754);
		Marker marker = new Marker(latlng,loptions);
		marker.addTo(map);
		marker.bindPopup("<b>Here is a simple popup<b>");
		// Add layers to map and center at given position
		map.setView(latlng, 13, false);
		map.addLayer(tile); 
		
		LatLng latlng1 = new LatLng(59.915, 10.759);
		LatLng latlng2 = new LatLng(59.900, 10.800);
		LatLng latlng3 = new LatLng(59.990, 10.800);
		LatLng[] latlngs = new LatLng[] {latlng1, latlng2, latlng3};
		GWT.log("size   :" + latlngs.length);
		for(LatLng l : latlngs) {
			GWT.log("string :" + l.toString());
		}
		Polyline poly = new Polyline(latlngs, new Options());
		poly.addTo(map);
		
		//Circle 
		Options circleOptions = new Options();
		circleOptions.setProperty("color", "red");
		Circle circle = new Circle(latlng,200,circleOptions);
		circle.addTo(map);
		

		// Add scale 
		ScaleControlOptions scaleOptions = new ScaleControlOptions();
		Scale scale = new Scale(scaleOptions);
		scale.addTo(map);

		// Add zoom 
		ZoomControlOptions zoomOptions = new ZoomControlOptions();
		zoomOptions.setPosition(Position.TOP_RIGHT);
		Zoom zoom = new Zoom(zoomOptions);
		zoom.addTo(map);
		
	}
	
}