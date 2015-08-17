package org.discotools.gwt.leaflet.client.controls.coordinates;

import org.discotools.gwt.leaflet.client.Options;
import org.discotools.gwt.leaflet.client.controls.Control;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.user.client.Element;

/**
 *
 * @author Haley Boyd
 *
 */
public class CoordinatesButton extends
		Control
{

	public CoordinatesButton(
			Options options ) {
		super(
				options,
				true,
				false);
		CoordinatesButtonImpl.initialize(getJSObject());
	}

	@Override
	public Element onAdd(
			JavaScriptObject map ) {
		return CoordinatesButtonImpl.createOnAddLayout(
				getJSObject(),
				map);
	}

	@Override
	public CoordinatesButton onRemove(
			JavaScriptObject map ) {
		return this;
	}

}
