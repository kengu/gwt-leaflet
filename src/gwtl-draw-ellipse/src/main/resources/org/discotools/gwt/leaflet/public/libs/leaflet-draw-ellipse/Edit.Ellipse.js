L.Edit = L.Edit || {};

L.Edit.Ellipse = L.Edit.SimpleShape.extend({
	options: {
		moveIcon: new L.DivIcon({
			iconSize: new L.Point(8, 8),
			className: 'leaflet-div-icon leaflet-editing-icon leaflet-edit-move'
		}),
		resizeIcon: new L.DivIcon({
			iconSize: new L.Point(8, 8),
			className: 'leaflet-div-icon leaflet-editing-icon leaflet-edit-resize'
		}),
		rotateIcon: new L.DivIcon({
			iconSize: new L.Point(8, 8),
			className: 'leaflet-div-icon leaflet-editing-icon leaflet-edit-rotate'
		})
	},
	
	_initMarkers: function () {
		if (!this._markerGroup) {
			this._markerGroup = new L.LayerGroup();
		}

		// Create center marker
		this._createMoveMarker();

		// Create edge marker
		this._createResizeMarker();
		
		// Create rotate Marker();
		this._createRotateMarker();
	},
	
	_createMoveMarker: function () {
		var center = this._shape.getLatLng();
		
		this._moveMarker = this._createMarker(center, this.options.moveIcon);
	},

	_createResizeMarker: function () {
		var center = this._shape.getLatLng(),
			resizemarkerPointX = this._getResizeMarkerPointX(center),
			resizemarkerPointY = this._getResizeMarkerPointY(center);

		this._resizeMarkers = [];
		this._resizeMarkers.push(this._createMarker(resizemarkerPointX, this.options.resizeIcon));
		this._resizeMarkers.push(this._createMarker(resizemarkerPointY, this.options.resizeIcon));
		this._resizeMarkers[0]._isX = true;
		this._resizeMarkers[1]._isX = false;
	},
	
	_createRotateMarker: function() {
		var center = this._shape.getLatLng(),
			rotatemarkerPoint = this._getRotateMarkerPoint(center);
		
		this._rotateMarker = this._createMarker(rotatemarkerPoint, this.options.rotateIcon);
	},

	_getResizeMarkerPointX: function (latlng) {
		var tilt = this._shape._tiltDeg * L.LatLng.DEG_TO_RAD;
		var radius = this._shape._radiusX;
		var xDelta = radius * Math.cos(tilt);
		var yDelta = radius * Math.sin(tilt);
		var point = this._map.project(latlng);
		return this._map.unproject([point.x - xDelta, point.y - yDelta]);
	},
	
	_getResizeMarkerPointY: function (latlng) {
		var tilt = this._shape._tiltDeg * L.LatLng.DEG_TO_RAD;
		var radius = this._shape._radiusY;
		var xDelta = radius * Math.sin(tilt);
		var yDelta = radius * Math.cos(tilt);
		var point = this._map.project(latlng);
		return this._map.unproject([point.x + xDelta, point.y - yDelta]);
	},
	
	_getRotateMarkerPoint: function (latlng) {
		var tilt = this._shape._tiltDeg * L.LatLng.DEG_TO_RAD;
		var radius = this._shape._radiusX + 20;
		var xDelta = radius * Math.cos(tilt);
		var yDelta = radius * Math.sin(tilt);
		var point = this._map.project(latlng);
		return this._map.unproject([point.x - xDelta, point.y - yDelta]);
	},
	
	_onMarkerDragStart: function (e) {
		L.Edit.SimpleShape.prototype._onMarkerDragStart.call(this, e);
		this._currentMarker = e.target;
	},
	
	_onMarkerDrag: function (e) {
		var marker = e.target,
			latlng = marker.getLatLng();

		if (marker === this._moveMarker) {
			this._move(latlng);
		} else if (marker === this._rotateMarker) {
			this._rotate(latlng);
		} else {
			this._resize(latlng);
		}

		this._shape.redraw();
	},

	_move: function (latlng) {
		// Move the ellipse
		this._shape.setLatLng(latlng);
		
		// Move the resize marker
		this._repositionResizeMarkers();
		
		// Move the rotate marker
		this._repositionRotateMarker();
	},
	
	_rotate: function (latlng) {
		var moveLatLng = this._moveMarker.getLatLng();
		var point = this._map.project(latlng);
		var movePoint = this._map.project(moveLatLng);
		var xLatLng = this._map.unproject([point.x, movePoint.y]);
		var radius = moveLatLng.distanceTo(latlng);
		var xDelta = moveLatLng.distanceTo(xLatLng);
		
		if(movePoint.y.toFixed(1) === point.y.toFixed(1)) {
			var tilt = 0;
			// Rotate the ellipse
			this._shape.setTilt(tilt);
		} else if(movePoint.x.toFixed(1) === point.x.toFixed(1)) {
			var tilt = 90;
			// Rotate the ellipse
			this._shape.setTilt(tilt);
		} else if(xDelta < radius) {
			var tilt = Math.acos(xDelta / radius) * L.LatLng.RAD_TO_DEG;
			if(point.y > movePoint.y) {
				tilt = -1 * tilt;
			}
			// Rotate the ellipse
			this._shape.setTilt(tilt);
		}
		
		// Move the resize marker
		this._repositionResizeMarkers();
		
		// Move the rotate marker
		this._repositionRotateMarker();
	},

	_resize: function (latlng) {
		var moveLatLng = this._moveMarker.getLatLng();
		var radius = moveLatLng.distanceTo(latlng);
		if(this._currentMarker._isX) {
			this._shape.setRadius([radius, this._shape._mRadiusY]);
		} else {
			this._shape.setRadius([this._shape._mRadiusX, radius]);
		}
		
		// Move the resize marker
		this._repositionResizeMarkers();
		// Move the rotate marker
		this._repositionRotateMarker();
	},
	
	_repositionResizeMarkers: function () {
		var latlng = this._moveMarker.getLatLng();
		var resizemarkerPointX = this._getResizeMarkerPointX(latlng);
		var resizemarkerPointY = this._getResizeMarkerPointY(latlng);

		this._resizeMarkers[0].setLatLng(resizemarkerPointX);
		this._resizeMarkers[1].setLatLng(resizemarkerPointY);
	},
	
	_repositionRotateMarker: function () {
		var latlng = this._moveMarker.getLatLng();
		var rotatemarkerPoint = this._getRotateMarkerPoint(latlng);
		
		this._rotateMarker.setLatLng(rotatemarkerPoint);
	}
});

L.Ellipse.addInitHook(function () {
	if (L.Edit.Ellipse) {
		this.editing = new L.Edit.Ellipse(this);

		if (this.options.editable) {
			this.editing.enable();
		}
	}

	this.on('add', function () {
		if (this.editing && this.editing.enabled()) {
			this.editing.addHooks();
		}
	});

	this.on('remove', function () {
		if (this.editing && this.editing.enabled()) {
			this.editing.removeHooks();
		}
	});
});