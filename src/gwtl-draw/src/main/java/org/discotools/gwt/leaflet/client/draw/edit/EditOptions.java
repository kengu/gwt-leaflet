package org.discotools.gwt.leaflet.client.draw.edit;

import org.discotools.gwt.leaflet.client.Options;
import org.discotools.gwt.leaflet.client.layers.others.FeatureGroup;

/**
 * These options will allow you to configure the draw toolbar and its handlers.
 * 
 * @author Haley Boyd
 *
 */
public class EditOptions extends
		Options
{
	public EditOptions() {
		super();
	}

	/**
	 * This is the FeatureGroup that stores all editable shapes. THIS IS
	 * REQUIRED FOR THE EDIT TOOLBAR TO WORK
	 * 
	 * @param featureGroup
	 * @return
	 */
	public EditOptions setFeatureGroup(
			FeatureGroup featureGroup ) {
		return (EditOptions) setProperty(
				"featureGroup",
				featureGroup);
	}

	/**
	 * Edit handler options. Set to false to disable handler.
	 * 
	 * @param editHandlerOptions
	 * @return
	 */
	public EditOptions setEditHandlerOptions(
			EditHandlerOptions editHandlerOptions ) {
		return (EditOptions) setProperty(
				"edit",
				editHandlerOptions);
	}
	
	/**
	 * Edit handler options. Set to false to disable handler.
	 * 
	 * @param editHandlerOptions
	 * @return
	 */
	public EditOptions setEditHandlerOptions(
			boolean editHandlerOptions ) {
		return (EditOptions) setProperty(
				"edit",
				editHandlerOptions);
	}

	/**
	 * Delete handler options. Set to false to disable handler.
	 * 
	 * @param deleteHandlerOptions
	 * @return
	 */
	public EditOptions setDeleteHandlerOptions(
			DeleteHandlerOptions deleteHandlerOptions ) {
		return (EditOptions) setProperty(
				"remove",
				deleteHandlerOptions);
	}
	
	/**
	 * Delete handler options. Set to false to disable handler.
	 * 
	 * @param deleteHandlerOptions
	 * @return
	 */
	public EditOptions setDeleteHandlerOptions(
			boolean deleteHandlerOptions ) {
		return (EditOptions) setProperty(
				"remove",
				deleteHandlerOptions);
	}
}
