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

import org.gwt.leaflet.api.LOptions;
import org.gwt.leaflet.api.Leaflet;
import org.gwt.leaflet.api.MapOptions;
import org.gwt.leaflet.api.Options;
import org.gwt.leaflet.api.crs.ICRS;
import org.gwt.leaflet.api.layers.raster.LTileLayer;
import org.gwt.leaflet.api.layers.raster.LWmsLayer;
import org.gwt.leaflet.api.layers.ui.Marker;
import org.gwt.leaflet.api.map.LMap;
import org.gwt.leaflet.api.map.Map;
import org.gwt.leaflet.api.types.LLatLng;
import org.gwt.leaflet.impl.crs.CRS;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Example implements EntryPoint {
	
	private static Leaflet L = Leaflet.L;
	
	public void onModuleLoad() {
	
		// Fit MapWidget to device screen
		RootPanel rootPanel = RootPanel.get();
		rootPanel.setStyleName("gwt-Body");
		MapWidget mapWidget = new MapWidget("map");
		rootPanel.add(mapWidget);
		mapWidget.setHeight("");
		mapWidget.setStyleName("gwt-Map");

		// Create mutable WmsLayer options
		Options options = Map.DEFAULT.clone(false);
		ICRS crs = L.crs().create(CRS.EPSG3857);
		options.put("crs", crs);
		options.put("zoomControl", false);
		
		// Create Map instance
		//Map map = L.map().create("map", options);
		
		MapOptions loptions = new MapOptions();
		loptions.setCenter(new LLatLng(0, 0));
		loptions.setZoom(13);
		LMap lmap =new LMap("map", loptions);
		
		// Create TileLayer url template
		String url = "http://{s}.tile.cloudmade.com/BC9A493B41014CAABB98F0471D759707/997/256/{z}/{x}/{y}.png";

		// Create mutable TileLayer options
		LOptions tileOptions = new LOptions();	
		tileOptions.setProperty("attribution", "Map data &copy; 2011 OpenStreetMap contributors, Imagery &copy; 2011 CloudMade");
		
		// Create TileLayer instance
		LTileLayer tile = new LTileLayer(url, tileOptions);
 
		// Create WmsLayer url
		url = "http://wms.latlon.org";
		
		// Create mutable WmsLayer options
		LOptions wmsOptions = new LOptions();	
		wmsOptions.setProperty("layers", "Map data &copy; 2011 OpenStreetMap contributors, Imagery &copy; 2011 CloudMade");
		wmsOptions.setProperty("attribution", "Map data &copy; 2011 OpenStreetMap contributors, Imagery &copy; 2011 CloudMade");
		// Required version: origin/master
		//crs = L.crs().create(CRS.EPSG4326);
		//wmsOptions.setProperty("crs", crs);
	
		// Create Leaflet WMSLayer instance
		LWmsLayer wms = new LWmsLayer(url, wmsOptions);
		
		
		// Create layer switcher control
		Options bases = Options.EMPTY.clone(false);
		bases.put("WMS", wms);	
		bases.put("Tile", tile);

		// Add layers control to map
		//L.control().layers(bases,Options.EMPTY,Layers.DEFAULT).addTo(map);
		
		// Create map center position		
		LLatLng latlng = new LLatLng(59.915, 10.754);
		Marker marker = new Marker(latlng);
		marker.addTo("map");
		// Add layers to map and center at given position
		lmap.setView(latlng, 13, false);
		lmap.addLayer(tile); 
		
		
		// Add scale to bottom right corner of map 
//		options = Scale.DEFAULT.clone(false);
//		options.put(Scale.POSITION, Control.Position.TOP_LEFT);
//		L.control().scale(options).addTo(map);

		// Add scale to bottom left corner of map 
//		options = Zoom.DEFAULT.clone(false);
//		options.put(Zoom.POSITION, Control.Position.BOTTOM_LEFT);
//		L.control().zoom(options).addTo(map);
		
	}
	
}