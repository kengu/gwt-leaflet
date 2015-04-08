package org.discotools.gwt.leaflet.client.controls.coordinates;

import org.discotools.gwt.leaflet.client.jsobject.JSObject;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.user.client.Element;

/**
 *
 * @author Haley Boyd
 *
 */
public class CoordinatesButtonImpl
{
	public static native JSObject initialize(JSObject self) /*-{
		var button = {
			'text': self.options.text,          //string
			'enabled': false					//bool
    	};
		self._button = button;

		self.coordinatesControl = new $wnd.L.control.coordinates(self.options.coordinatesOptions);

		self._toggle = function () {
			this._button.enabled = !this._button.enabled;

			if(this._button.enabled) {
				$wnd.L.DomUtil.addClass(this._container,'enabled');
				if(this._map) {
					this._map.addControl(this.coordinatesControl);
				}
			}
			else {
				$wnd.L.DomUtil.removeClass(this._container,'enabled');
				if(this._map) {
					this._map.removeControl(this.coordinatesControl);
				}
			}

			return;
  		};

  		self._onAddLayout = function(map) {
  			this._map = map;
			var className = 'leaflet-control-coordinates-button';
			var container = $wnd.L.DomUtil.create('div', 'leaflet-control-coordinates-button');

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
