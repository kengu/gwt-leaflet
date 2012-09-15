package org.gwt.leaflet.client.example;

import org.gwt.leaflet.client.controls.Control;
import org.gwt.leaflet.client.options.Options;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.Element;

public class LegendControl extends Control {

	public LegendControl(Options options) {
		super(options,true,false);
	}

	@Override
	public Element customOnAdd(JavaScriptObject map) { 
		return createOnAddLayout(getJSObject(), map);
	}
	
	@Override
	public void customOnRemove(JavaScriptObject map) { 
	}

	public static native Element createOnAddLayout(JavaScriptObject self, JavaScriptObject map) /*-{	
		
		function getCustomColor(d) {
			return d > 1000 ? '#800026' :
			       d > 500  ? '#BD0026' :
			       d > 200  ? '#E31A1C' :
			       d > 100  ? '#FC4E2A' :
			       d > 50   ? '#FD8D3C' :
			       d > 20   ? '#FEB24C' :
			       d > 10   ? '#FED976' :
			                  '#FFEDA0';
		}

		var div = document.createElement("div");
		div.id = "info legend"; 
		div.className = 'legend';
		
		var		grades = [0, 10, 20, 50, 100, 200, 500, 1000],
				labels = [],
				from, to;

			for (var i = 0; i < grades.length; i++) {
				from = grades[i];
				to = grades[i + 1];

				labels.push(
					'<i style="background:' + getCustomColor(from + 1) + '"></i> ' +
					from + (to ? '&ndash;' + to : '+'));

			}

			div.innerHTML = labels.join('<br>');
			return div;
	}-*/;
	
}
