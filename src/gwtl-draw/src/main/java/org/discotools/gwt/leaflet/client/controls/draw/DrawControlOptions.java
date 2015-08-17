package org.discotools.gwt.leaflet.client.controls.draw;

import org.discotools.gwt.leaflet.client.controls.ControlOptions;
import org.discotools.gwt.leaflet.client.draw.DrawOptions;
import org.discotools.gwt.leaflet.client.draw.edit.EditOptions;

/**
 * 
 * @author Haley Boyd
 *
 */
public class DrawControlOptions extends
		ControlOptions
{
	public DrawControlOptions() {
		super();
	}

	/**
	 * The options used to configure the draw toolbar.
	 * 
	 * @param drawOptions
	 */
	public void setDrawOptions(
			DrawOptions drawOptions ) {
		getJSObject().setProperty(
				"draw",
				drawOptions.getJSObject());
	}

	/**
	 * The options used to configure the edit toolbar.
	 * 
	 * @param editOptions
	 */
	public void setEditOptions(
			EditOptions editOptions ) {
		getJSObject().setProperty(
				"edit",
				editOptions.getJSObject());
	}

}
