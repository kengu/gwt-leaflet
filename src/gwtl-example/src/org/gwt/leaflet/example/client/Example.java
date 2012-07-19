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

import org.gwt.leaflet.api.Map;
import org.gwt.leaflet.api.MapFactory;
import org.gwt.leaflet.api.Options;
import org.gwt.leaflet.api.TileLayer;
import org.gwt.leaflet.api.types.LatLng;
import org.gwt.leaflet.client.Constants;
import org.gwt.leaflet.client.MapWidget;
import com.google.gwt.user.client.ui.VerticalPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Example implements EntryPoint {
	
	private static MapFactory FACTORY = GWT.create(MapFactory.class);	
	
	public void onModuleLoad() {
		
		VerticalPanel verticalPanel = new VerticalPanel();
		verticalPanel.setSpacing(10);
		
		MapWidget mapWidget = new MapWidget("map");
		verticalPanel.add(mapWidget);
		mapWidget.setSize("100%", "100%");
		
		RootPanel rootPanel = RootPanel.get();
		rootPanel.setSize("100%", "100%");
		rootPanel.add(verticalPanel, 0, 0);
		verticalPanel.setSize("100%", "100%");
		
		// Create Leaflet map instance
		Map map = FACTORY.newMap("map", Constants.MAP_OPTIONS);
		
		// Create Leaflet TileLayer url template
		String url = "http://{s}.tile.cloudmade.com/BC9A493B41014CAABB98F0471D759707/997/256/{z}/{x}/{y}.png";
		
		// Create Leaflet TileLayer options
		Options options = new Options();
		options.put(TileLayer.MAX_ZOOM, "18");
		
		// Create Leaflet TileLayer instance
		TileLayer layer = FACTORY.newTileLayer(url, options);
		
		// Create map center position
		LatLng center = FACTORY.newLatLng(51.505, -0.09);
		
		// Add layer to map
		map.setView(center, 13, true).addLayer(layer, false);
		
		
	}
}
