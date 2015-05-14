/*
 * L.Control.Crosshair is a control to allow users to show/hide a crosshair on the map
 */

L.Control.Crosshair = L.Control.extend({
	options: {
		position: 'topright',
		label: 'Show Crosshair'
	},
	
	initialize: function(options) {
		L.Util.setOptions(this, options);
	},
	
	onAdd: function(map) {
		this._map = map;
		
		var crosshairIcon = L.icon({
			iconUrl: 'images/crosshair.png',
			iconSize: [20, 20],
			iconAnchor: [10, 10]
		});
		
		crosshair = new L.marker(this._map.getCenter(), {icon: crosshairIcon, clickable:false});
		crosshair.addTo(this._map);
		
		this._map.on('move', function(e) {
			crosshair.setLatLng(this._map.getCenter());
		});
		
		return crosshair;
	},
	
	onRemove: function(map) {
		
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
		this.crosshairControl = new L.Control.Crosshair();
		this.addControl(this.crosshairControl);
	}
});
