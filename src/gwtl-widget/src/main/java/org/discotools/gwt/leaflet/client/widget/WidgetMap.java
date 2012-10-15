package org.discotools.gwt.leaflet.client.widget;

import org.discotools.gwt.leaflet.client.Options;
import org.discotools.gwt.leaflet.client.layers.raster.TileLayer;
import org.discotools.gwt.leaflet.client.map.Map;
import org.discotools.gwt.leaflet.client.map.MapOptions;
import org.discotools.gwt.leaflet.client.types.LatLng;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.ui.Widget;

/**
 * WidgetMap
 * ---------
 * When you initialize your app, it may happen that the map is
 * not currently visible.
 * To prevent any errors, this widget component allows to build the map
 * only when the component is really loaded.
 * @author Lionel Leiva
 * 
 */
public class WidgetMap extends Widget {

	private Element _div;

	private boolean _isLoaded = false;

	private Map map;

	public WidgetMap(String name) {
		super();
		_div = DOM.createDiv();
		_div.setId(name);
		setElement(_div);
		setWidth("100%");
		setHeight("100%");
	}

	protected void onLoad() {
		super.onLoad();
		if (!_isLoaded) {
			init();
			_isLoaded = true;
		}
	}

	public void init() {
		setStyleName("gwt-Map");
		// Create Map instance
		MapOptions loptions = new MapOptions();
		loptions.setCenter(new LatLng(0, 0));
		loptions.setZoom(13);

		// Create TileLayer url template
		String url = "http://{s}.tile.cloudmade.com/BC9A493B41014CAABB98F0471D759707/997/256/{z}/{x}/{y}.png";
		
		// Create mutable TileLayer options
		Options tileOptions = new Options();
		tileOptions
				.setProperty(
						"attribution",
						"Map data &copy; 2011 OpenStreetMap contributors, Imagery &copy; 2011 CloudMade");

		// Create TileLayer instance
		TileLayer tile = new TileLayer(url, tileOptions);

		map = new Map("map", loptions);
		map.addLayer(tile);
		
	}

}
