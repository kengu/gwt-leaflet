package org.discotools.gwt.leaflet.client.controls.crosshair;

import org.discotools.gwt.leaflet.client.Options;
import org.discotools.gwt.leaflet.client.controls.Control;
import org.discotools.gwt.leaflet.client.map.Map;

public class Crosshair extends Control
{
	public Crosshair(Options options) {
		super(CrosshairImpl.create(options.getJSObject()));
	}
	
	@Override
	public Crosshair addTo(Map map) {
		return (Crosshair) super.addTo(map);
	}
}
