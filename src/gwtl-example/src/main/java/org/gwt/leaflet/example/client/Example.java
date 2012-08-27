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

import org.gwt.leaflet.client.Leaflet;
import org.gwt.leaflet.client.Options;
import org.gwt.leaflet.client.control.Control;
import org.gwt.leaflet.client.control.Layers;
import org.gwt.leaflet.client.control.Scale;
import org.gwt.leaflet.client.control.Zoom;
import org.gwt.leaflet.client.crs.CRS;
import org.gwt.leaflet.client.crs.ICRS;
import org.gwt.leaflet.client.impl.Debug;
import org.gwt.leaflet.client.layer.tile.TileLayer;
import org.gwt.leaflet.client.layer.tile.WmsLayer;
import org.gwt.leaflet.client.map.Map;
import org.gwt.leaflet.client.type.LatLng;
import org.gwt.leaflet.widget.client.MapWidget;
import org.gwt.leaflet.proj4.client.Proj4;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Example implements EntryPoint {
	
	private static Leaflet L = Leaflet.L;
	private static Proj4 PROJ4 = Proj4.INSTANCE;
	
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
//		crs = PROJ4.crs("EPSG:4326",L.transformation(1 / 360, 0.5, -1 / 360, 0.5));
//		Debug.log(crs);
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
//		bases.put("cloudmade.com (tile)", cloudmate);
//		bases.put("latlon.org (wms)", latlon);	
//		bases.put("statkart.no (wms-c)", statkart);

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

//url = "http://ims.cr.usgs.gov:80/servlet19/com.esri.wms.Esrimap/USGS_EDC_Elev_NED_3";
//url = "http://openwms.statkart.no/skwms1/wms.europa";
//url = "http://129.206.228.72/cached/hillshade";
//url = "http://osm.wheregroup.com/cgi-bin/osm_basic.xml";
//url = "http://openwms.statkart.no/skwms1/wms.topo2";
//url = "http://opencache.statkart.no/gatekeeper/gk/gk.open";
//options.put(WmsLayer.LAYERS, "HR-NED.IMAGE");
//options.put("reaspect", "false");
//options.put("transparent", "true");
//options.put(WmsLayer.LAYERS, "Europa_WMS");
//options.put(WmsLayer.LAYERS, "osm_auto:all");
//options.put(WmsLayer.LAYERS, "europe_wms:hs_srtm_europa");
//options.put(WmsLayer.LAYERS, "OSM_Basic");
//options.put(WmsLayer.LAYERS, "topo2_WMS");
//options.put(WmsLayer.LAYERS, "topo2");
