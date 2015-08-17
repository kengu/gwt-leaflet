package org.discotools.gwt.leaflet.client.controls.crosshair;

import org.discotools.gwt.leaflet.client.Options;
import org.discotools.gwt.leaflet.client.controls.Control;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.user.client.Element;

public class CrosshairButton extends
		Control
{

	public CrosshairButton(
			Options options ) {
		super(
				options,
				true,
				false);
		CrosshairButtonImpl.initialize(getJSObject());
	}

	@Override
	public Element onAdd(
			JavaScriptObject map ) {
		return CrosshairButtonImpl.createOnAddLayout(
				getJSObject(),
				map);
	}

	@Override
	public CrosshairButton onRemove(
			JavaScriptObject map ) {
		return this;
	}

}
