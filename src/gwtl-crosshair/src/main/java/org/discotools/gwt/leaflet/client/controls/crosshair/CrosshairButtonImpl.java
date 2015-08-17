package org.discotools.gwt.leaflet.client.controls.crosshair;

import org.discotools.gwt.leaflet.client.jsobject.JSObject;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.user.client.Element;

public class CrosshairButtonImpl
{
	public static native JSObject initialize(JSObject self) /*-{
		var button = {
			'text': self.options.text,          //string
			'enabled': false					//bool
		};
		self._button = button;

		self.crosshairControl = new $wnd.L.control.crosshair(self.options.crosshairOptions);

		self._toggle = function () {
			this._button.enabled = !this._button.enabled;

			if(this._button.enabled) {
				$wnd.L.DomUtil.addClass(this._container,'enabled');
				if(this._map) {
					this._map.addControl(this.crosshairControl);
				}
			}
			else {
				$wnd.L.DomUtil.removeClass(this._container,'enabled');
				if(this._map) {
					this._map.removeControl(this.crosshairControl);
				}
			}

			return;
			};

			self._onAddLayout = function(map) {
				this._map = map;
			var className = 'leaflet-control-crosshair-button';
			var container = $wnd.L.DomUtil.create('div', 'leaflet-control-crosshair-button');

			this._container = container;

			var link = $wnd.L.DomUtil.create('a', className, this._container);
			link.href = '#';
			link.title = this._button.text;
			link.innerHTML = this._button.text;

			$wnd.L.DomEvent
	        	.addListener(link, 'click', $wnd.L.DomEvent.stop)
	        	.addListener(link, 'click', this._toggle, this);

			return this._container;
			};
	}-*/;

	public static native Element createOnAddLayout(JavaScriptObject self, JavaScriptObject map) /*-{
		return self._onAddLayout(map);
	}-*/;
}
