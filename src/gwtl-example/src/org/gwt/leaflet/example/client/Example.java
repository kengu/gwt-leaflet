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
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.RootPanel;

import org.gwt.leaflet.api.Attribution;
import org.gwt.leaflet.api.Layers;
import org.gwt.leaflet.api.Map;
import org.gwt.leaflet.api.MapFactory;
import org.gwt.leaflet.api.Options;
import org.gwt.leaflet.api.TileLayer;
import org.gwt.leaflet.api.WmsLayer;
import org.gwt.leaflet.api.types.Crs;
import org.gwt.leaflet.api.types.LatLng;
import org.gwt.leaflet.client.MapPane;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Example implements EntryPoint {
	
	private static MapFactory FACTORY = GWT.create(MapFactory.class);	
	
	public void onModuleLoad() {
	
		// Fit MapWidget to device screen
		RootPanel rootPanel = RootPanel.get();
		rootPanel.setStyleName("gwt-Body");
		MapPane mapWidget = new MapPane("map");
		rootPanel.add(mapWidget);
		mapWidget.setHeight("");
		mapWidget.setStyleName("gwt-Map");

		// Create mutable WmsLayer options
		Options options = Map.DEFAULT.clone(false);
		Crs crs = FACTORY.newCrs(Crs.EPSG_3857);
		options.put("crs", crs);
		
		// Create Map instance
		Map map = FACTORY.newMap("map", options);
		
		// Create TileLayer url template
		String url = "http://{s}.tile.cloudmade.com/BC9A493B41014CAABB98F0471D759707/997/256/{z}/{x}/{y}.png";

		// Create mutable TileLayer options
		options = TileLayer.DEFAULT.clone(false);	
		options.put("attribution", "Map data &copy; 2011 OpenStreetMap contributors, Imagery &copy; 2011 CloudMade");
		
		// Create TileLayer instance
		TileLayer tile = FACTORY.newTileLayer(url, options);

		// Create WmsLayer url
		url = "http://wms.latlon.org";
		
		// Create mutable WmsLayer options
		options = WmsLayer.DEFAULT.clone(false);	
		options.put(WmsLayer.LAYERS, "osm");
		options.put("attribution", "Map data &copy; 2011 OpenStreetMap contributors, Imagery &copy; 2011 CloudMade");
	
		// Create Leaflet TileLayer instance
		WmsLayer wms = FACTORY.newWmsLayer(url, options);
		
		// Create Layers control
		options = Layers.DEFAULT.clone(false);	
		options.put("Tile", tile);
		options.put("WMS", wms);		
		Layers layers = FACTORY.newLayers(options,Layers.DEFAULT);
		
		// Add layers to map
		map.addControl(layers);

		// Create map center position		
		LatLng center = FACTORY.newLatLng(59.915, 10.754);
		
		// Add layers to map and center at given position
		map.setView(center, 13, true).addLayer(wms).addLayer(tile);
		
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
