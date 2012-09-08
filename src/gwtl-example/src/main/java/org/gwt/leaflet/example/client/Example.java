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

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;

import org.gwt.leaflet.api.controls.Control;
import org.gwt.leaflet.api.controls.Layers;
import org.gwt.leaflet.api.controls.Scale;
import org.gwt.leaflet.api.controls.Zoom;
import org.gwt.leaflet.api.crs.ICRS;
import org.gwt.leaflet.api.layers.raster.TileLayer;
import org.gwt.leaflet.api.layers.raster.WmsLayer;
import org.gwt.leaflet.api.map.Map;
import org.gwt.leaflet.api.types.LatLng;
import org.gwt.leaflet.api.Leaflet;
import org.gwt.leaflet.api.Options;
import org.gwt.leaflet.impl.crs.CRS;
import org.gwt.leaflet.widget.client.MapWidget;

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
		Map map = L.map().create("map", options);
		
		// Create TileLayer url template
		String url = "http://{s}.tile.cloudmade.com/BC9A493B41014CAABB98F0471D759707/997/256/{z}/{x}/{y}.png";

		// Create mutable TileLayer options
		options = TileLayer.DEFAULT.clone(false);	
		options.put("attribution", "Map data &copy; 2011 OpenStreetMap contributors, Imagery &copy; 2011 CloudMade");
		
		// Create TileLayer instance
		TileLayer tile = L.layer().tile(url, options);

		// Create WmsLayer url
		url = "http://wms.latlon.org";
		
		// Create mutable WmsLayer options
		options = WmsLayer.DEFAULT.clone(false);	
		options.put(WmsLayer.LAYERS, "osm");
		options.put("attribution", "Map data &copy; 2011 OpenStreetMap contributors, Imagery &copy; 2011 CloudMade");
		
		// Required version: origin/master
		crs = L.crs().create(CRS.EPSG4326);
		options.put("crs", crs);
	
		// Create Leaflet WMSLayer instance
		WmsLayer wms = L.layer().wms(url, options);
		
//		// Create WmsLayer url
//		url = "http://openwms.statkart.no/skwms1/wms.topo2";
//		
//		// Create mutable WmsLayer options
//		crs = L.crs().create(CRS.EPSG4326);
//		options = WmsLayer.DEFAULT.clone(false);
//		options.put(WmsLayer.LAYERS, "topo2_WMS");
//		options.put("crs", crs);
//		options.put("attribution", "Kartgrunnlag: " +
//				"<a href=\"http://www.statkart.no/\">Kartverket</a>, " +
//				"<a href=\"http://www.statkart.no/nor/Land/Fagomrader/Geovekst/\">Geovekst</a> og " +
//				"<a href=\"http://www.statkart.no/?module=Articles;action=Article.publicShow;ID=14194/\">kommuner</a>");
//	
//		// Create Leaflet WMSLayer instance
//		WmsLayer statkart = L.map().newWmsLayer(url, options);		
		
		// Create layer switcher control
		Options bases = Options.EMPTY.clone(false);
		bases.put("WMS", wms);	
		bases.put("Tile", tile);

		// Add layers control to map
		L.control().layers(bases,Options.EMPTY,Layers.DEFAULT).addTo(map);
		
		// Create map center position		
		LatLng center = L.type().latlng(59.915, 10.754);
		
		// Add layers to map and center at given position
		map.setView(center, 13, false).addLayer(tile);
		
		// Add scale to bottom right corner of map 
		options = Scale.DEFAULT.clone(false);
		options.put(Scale.POSITION, Control.Position.TOP_LEFT);
		L.control().scale(options).addTo(map);

		// Add scale to bottom left corner of map 
		options = Zoom.DEFAULT.clone(false);
		options.put(Zoom.POSITION, Control.Position.BOTTOM_LEFT);
		L.control().zoom(options).addTo(map);
		
	}
}