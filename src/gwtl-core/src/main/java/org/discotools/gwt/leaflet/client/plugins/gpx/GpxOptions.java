package org.discotools.gwt.leaflet.client.plugins.gpx;

import org.discotools.gwt.leaflet.client.Options;


/**
 * GpxOptions class
 * @author Lionel Leiva-Marcon
 *
 */
public class GpxOptions extends Options  {

	private Options markerOptions = new Options();
	
	public GpxOptions() {
		 super();
	}

	public void setAsync(Boolean async) {
		getJSObject().setProperty("async",String.valueOf(async));
	}

	public void setStartIconUrl(String icon) {
		markerOptions.setProperty("startIconUrl",icon);
		getJSObject().setProperty("marker_options",markerOptions.getJSObject());
	}
	
	public void setEndIconUrl(String icon) {
		markerOptions.setProperty("endIconUrl",icon);
		getJSObject().setProperty("marker_options",markerOptions.getJSObject());
	}
		
	public void setShadowUrl(String icon) {
		markerOptions.setProperty("shadowUrl",icon);
		getJSObject().setProperty("marker_options",markerOptions.getJSObject());
	}

}
