/*
 * L.Control.Crosshair is a control to allow users to show/hide a crosshair on the map
 */

L.Control.Crosshair = L.Control.Coordinates.extend({
	options: {
		position: 'bottomright',
		//decimals used if not using DMS or labelFormatter functions
		decimals: 4,
		//decimalseperator used if not using DMS or labelFormatter functions
		decimalSeperator: ".",
		//label templates for usage if no labelFormatter function is defined
		labelTemplateLat: "Lat: {y}",
		labelTemplateLng: "Lng: {x}",
		//label formatter functions 
		labelFormatterLat: undefined,
		labelFormatterLng: undefined,
		//switch on/off input fields on click
		enableUserInput: true,
		//use Degree-Minute-Second
		useDMS: false,
		//if true lat-lng instead of lng-lat label ordering is used
		useLatLngOrder: false,
		//if true user given coordinates are centered directly
		centerUserCoordinates:true
	},
	
	onAdd: function(map) {
		this._map = map;

		var className = 'leaflet-control-crosshair',
			container = this._container = L.DomUtil.create('div', className),
			options = this.options;

		//label containers
		this._labelcontainer = L.DomUtil.create("div", "uiElement label", container);
		this._label = L.DomUtil.create("span", "labelFirst", this._labelcontainer);
		

		//input containers
		this._inputcontainer = L.DomUtil.create("div", "uiElement input uiHidden", container);
		var xSpan, ySpan;
		if (options.useLatLngOrder) {
			ySpan = L.DomUtil.create("span", "", this._inputcontainer);
			this._inputY = this._createInput("inputY", this._inputcontainer);
			xSpan = L.DomUtil.create("span", "", this._inputcontainer);
			this._inputX = this._createInput("inputX", this._inputcontainer);
		} else {
			xSpan = L.DomUtil.create("span", "", this._inputcontainer);
			this._inputX = this._createInput("inputX", this._inputcontainer);
			ySpan = L.DomUtil.create("span", "", this._inputcontainer);
			this._inputY = this._createInput("inputY", this._inputcontainer);
		}
		xSpan.innerHTML = options.labelTemplateLng.replace("{x}", "");
		ySpan.innerHTML = options.labelTemplateLat.replace("{y}", "");

		L.DomEvent.on(this._inputX, 'keyup', this._handleKeypress, this);
		L.DomEvent.on(this._inputY, 'keyup', this._handleKeypress, this);
		
		// add crosshair marker to map
		this._crosshair = this.makeMarker();
		this._crosshair.addTo(map);	

		//connect to mouseevents
		map.on("move", this._update, this);
		map.on('dragstart', this.collapse, this);

		map.whenReady(this._update, this);

		this._showsCoordinates = true;
		//wether or not to show inputs on click
		if (options.enableUserInput) {
			L.DomEvent.addListener(this._container, "click", this._switchUI, this);
		}	

		return container;
	},
	
	onRemove: function(map) {
		map.off("move", this._update, this);
		map.removeLayer(this._crosshair);
	},
	
	/**
	 *	Move callback function updating labels and input elements
	 */
	_update: function(evt) {
		var pos = this._map.getCenter(),
			opts = this.options;
		if (pos) {
			// Move the crosshair to the center of the map when the user pans
			this._crosshair.setLatLng(pos);
			
			pos = pos.wrap();
			this._currentPos = pos;
			this._inputY.value = L.NumberFormatter.round(pos.lat, opts.decimals, opts.decimalSeperator);
			this._inputX.value = L.NumberFormatter.round(pos.lng, opts.decimals, opts.decimalSeperator);
			this._label.innerHTML = this._createCoordinateLabel(pos);
		}
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

// constructor registration
L.control.crosshair = function(options) {
	return new L.Control.Crosshair(options);
};

// map init hook
L.Map.mergeOptions({
	crosshairControl: false
});

L.Map.addInitHook(function() {
	if(this.options.crosshairControl) {
		this.crosshairControl = new L.Control.Crosshair();
		this.addControl(this.crosshairControl);
	}
});