package org.gwt.leaflet.client.example;

import org.gwt.leaflet.client.controls.Control;
import org.gwt.leaflet.client.options.Options;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.Element;

public class InfoControl extends Control {

	public InfoControl(Options options) {
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
		var div = document.createElement("div");
		div.id = "info";
		div.innerHTML = '<h4>US Population Density</h4>';
		div.className = "info";
		$wnd.infocontrol = div;
		@org.gwt.leaflet.client.example.InfoControl::doUpdate(Ljava/lang/String;Ljava/lang/String;)("-","0");
		return div;
	}-*/;
	
	public static native void doUpdate(String name, String density) /*-{
			var div = 		$wnd.infocontrol;
			div.innerHTML = '<h4>US Population Density</h4>' +
				'<b>' + name + '</b><br />' + density + ' people / mi<sup>2</sup>';
	}-*/;
	
}
