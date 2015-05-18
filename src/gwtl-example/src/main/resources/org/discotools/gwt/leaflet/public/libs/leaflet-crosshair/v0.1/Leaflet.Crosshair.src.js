/*
 * L.Control.Crosshair is a control to allow users to show/hide a crosshair on the map
 */

L.Control.Crosshair = L.Control.extend({
	statics: {
		TITLE: 'Show Crosshair'
	},
	
	options: {
		position: 'topright',
		enabled: false
	},
	
	toggle: function() {
		this.enabled = !this.enabled;
		
		if(this.enabled) {
			L.DomUtil.addClass(this._container, 'enabled');
			if(this._map) {
				this._marker.setLatLng(this._map.getCenter());
				this._marker.addTo(this._map);
				L.DomUtil.removeClass(this._coordcontainer, 'uiHidden');
				L.DomUtil.removeClass(this._coords, 'uiHidden');
			}
		}
		else {
			L.DomUtil.removeClass(this._container, 'enabled');
			this._map.removeLayer(this._marker);
			L.DomUtil.addClass(this._coordcontainer, 'uiHidden');
			L.DomUtil.addClass(this._coords, 'uiHidden');
		}
	},
	
	onAdd: function(map) {
		this._map = map;
		
		var className = 'leaflet-control-crosshair';
		
		this._container = L.DomUtil.create('div', className);
		
		var crosshair = this.makeMarker();
		this._marker = crosshair;
		
		
		var link = L.DomUtil.create('a', className+'-link', this._container);
		link.href = '#';
		link.title = L.Control.Crosshair.TITLE;
		link.innerHTML = L.Control.Crosshair.TITLE;
		
		L.DomEvent
			.addListener(link, 'click', L.DomEvent.stopPropagation)
			.addListener(link, 'click', L.DomEvent.preventDefault)
			.addListener(link, 'click', this.toggle, this);
		
		this._coordcontainer = L.DomUtil.create('div', 'coordcontainer uiHidden', this._container);
		var coords = L.DomUtil.create('span', 'coordlabel uiHidden', this._coordcontainer);
		var _lat = L.NumberFormatter.round(map.getCenter().lat);
	    var _lng = L.NumberFormatter.round(map.getCenter().lng);
		coords.innerHTML = "Lat: " + _lat + " Lon: " + _lng;
		
		this._coords = coords;
		
		// Move the crosshair to the center of the map when the user pans
		map.on('move', function(e) {
		    crosshair.setLatLng(map.getCenter());
		    _lat = L.NumberFormatter.round(map.getCenter().lat);
		    _lng = L.NumberFormatter.round(map.getCenter().lng);
		    coords.innerHTML = "Lat: " + _lat + " Lon: " + _lng;
		});
		
		return this._container;
	},
	
	onRemove: function(map) {
		L.DomEvent
			.removeListener(link, 'click', this.toggle, this);
	},
	
	makeMarker: function() {
		var crosshairIcon = L.divIcon({
			className: 'leaflet-crosshair-icon',
			iconSize: [30, 30],
			iconAnchor: [10, 10]
		});
		
		var crosshair = new L.marker(this._map.getCenter(), {icon: crosshairIcon, clickable:false, zIndexOffset:1000});
				
		return crosshair;
	}
});

L.control.crosshair = function(options) {
	return new L.Control.Crosshair(options);
};

L.Map.mergeOptions({
	crosshairControl: false
});

L.Map.addInitHook(function() {
	if(this.options.crosshairControl) {
		this.crosshairControl = L.Control.crosshair().addTo(this);
	}
});

L.NumberFormatter = {
		round: function(num) {
			var res = L.Util.formatNum(num, 4) + "",
				numbers = res.split(".");
			if(numbers[1]) {
				var d = 4 - numbers[1].length;
				for(; d > 0; d--) {
					numbers[1] += "0";
				}
				res = numbers.join("." || ".");
			}
			return res;
		}
};
