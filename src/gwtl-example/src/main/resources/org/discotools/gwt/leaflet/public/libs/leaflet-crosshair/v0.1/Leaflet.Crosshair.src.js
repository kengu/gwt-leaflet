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
				this._map.on('move', this._update);
			}
		}
		else {
			L.DomUtil.removeClass(this._container, 'enabled');
			this._map.removeLayer(this._marker);
		}
	},
	
	onAdd: function(map) {
		this._map = map;
		
		var className = 'leaflet-control-crosshair';
		
		this._container = L.DomUtil.create('div', className);
		
		this._marker = this.makeMarker();
		
		var link = L.DomUtil.create('a', className+'-link', this._container);
		link.href = '#';
		link.title = L.Control.Crosshair.TITLE;
		link.innerHTML = L.Control.Crosshair.TITLE;
		
		L.DomEvent
			.addListener(link, 'click', L.DomEvent.stopPropagation)
			.addListener(link, 'click', L.DomEvent.preventDefault)
			.addListener(link, 'click', this.toggle, this);
		
		return this._container;
	},
	
	onRemove: function(map) {
		L.DomEvent
			.removeListener(link, 'click', this.toggle, this);
	},
	
	makeMarker: function() {
		var crosshairIcon = L.icon({
			iconUrl: '1024px-Crosshairs_Red.svg.png',
			iconSize: [20, 20],
			iconAnchor: [10, 10]
		});
		
		var crosshair = new L.marker(this._map.getCenter(), {icon: crosshairIcon, clickable:false});
		
		return crosshair;
	},
	
	_update: function() {
		console.log("map moved called update");
		this._marker.setLatLng(this._map.getCenter());
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
