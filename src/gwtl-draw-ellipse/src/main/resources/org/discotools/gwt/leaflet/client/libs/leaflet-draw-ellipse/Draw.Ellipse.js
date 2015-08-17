L.drawLocal.draw.handlers.ellipse = {
	tooltip: {
		start: 'Click and drag to draw ellipse.'
	},
	radius: 'Radius'
}

L.Draw.Ellipse = L.Draw.SimpleShape.extend({
	statics: {
		TYPE: 'ellipse'
	},

	options: {
		shapeOptions: {
			stroke: true,
			color: '#f06eaa',
			weight: 4,
			opacity: 0.5,
			fill: true,
			fillColor: null, //same as color by default
			fillOpacity: 0.2,
			clickable: true,
			startAngle: 0,
	        endAngle: 359.9
		},
		showRadius: true,
		metric: true // Whether to use the metric measurement system or imperial
	},

	initialize: function (map, options) {
		// Save the type so super can fire, need to do this as cannot do this.TYPE :(
		this.type = L.Draw.Ellipse.TYPE;

		this._initialLabelText = L.drawLocal.draw.handlers.ellipse.tooltip.start;

		L.Draw.SimpleShape.prototype.initialize.call(this, map, options);
	},

	_drawShape: function (latlng) {
		if (!this._shape) {
			var radius = this._startLatLng.distanceTo(latlng);
			this._shape = new L.Ellipse(this._startLatLng, [radius, radius], 0, this.options.shapeOptions);
			this._map.addLayer(this._shape);
		} else {
			var radius = this._startLatLng.distanceTo(latlng);
			this._shape.setRadius([radius, radius]);
		}
	},

	_fireCreatedEvent: function () {
		var ellipse = new L.Ellipse(this._startLatLng, [this._shape._mRadiusX, this._shape._mRadiusY], 0, this.options.shapeOptions);
		L.Draw.SimpleShape.prototype._fireCreatedEvent.call(this, ellipse);
	},

	_onMouseMove: function (e) {
		var latlng = e.latlng,
			showRadius = this.options.showRadius,
			useMetric = this.options.metric,
			radius;

		this._tooltip.updatePosition(latlng);
		if (this._isDrawing) {
			this._drawShape(latlng);

			// Get the new radius (rounded to 1 dp)
			radius = this._shape._mRadiusX.toFixed(1);

			this._tooltip.updateContent({
				text: this._endLabelText,
				subtext: showRadius ? L.drawLocal.draw.handlers.ellipse.radius + ': ' + L.GeometryUtil.readableDistance(radius, useMetric) : ''
			});
		}
	}
});
