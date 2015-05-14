package org.discotools.gwt.leaflet.client.example;

import org.discotools.gwt.leaflet.client.Options;
import org.discotools.gwt.leaflet.client.controls.Control;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.user.client.Element;

public class CrosshairCheckbox extends
		Control
{
	public CrosshairCheckbox(
			Options options) {
		super(options, true, false);
		CrosshairCheckboxImpl.initialize(getJSObject());
	}
	
	@Override
	public Element onAdd(JavaScriptObject map) {
		return CrosshairCheckboxImpl.createOnAddLayout(
				getJSObject(),
				map);
	}
	
	@Override
	public CrosshairCheckbox onRemove(
			JavaScriptObject map) {
		return this;
	}
}
