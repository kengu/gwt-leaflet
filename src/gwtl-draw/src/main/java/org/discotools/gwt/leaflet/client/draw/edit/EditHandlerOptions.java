package org.discotools.gwt.leaflet.client.draw.edit;

import org.discotools.gwt.leaflet.client.Options;
import org.discotools.gwt.leaflet.client.layers.vector.PathOptions;

/**
 * 
 * @author Haley Boyd
 *
 */
public class EditHandlerOptions extends
		Options
{
	public EditHandlerOptions() {
		super();
	}

	public EditHandlerOptions setSelectedPathOptions(
			PathOptions selectedPathOptions ) {
		return (EditHandlerOptions) setProperty(
				"selectedPathOptions",
				selectedPathOptions);
	}

}
