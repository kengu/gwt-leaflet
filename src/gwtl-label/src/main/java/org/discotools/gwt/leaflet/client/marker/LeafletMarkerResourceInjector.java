package org.discotools.gwt.leaflet.client.marker;

import com.google.gwt.core.client.GWT;

public class LeafletMarkerResourceInjector
{

	protected static LeafletMarkerClientBundle bundle;

	public static void ensureInjected() {
		if (bundle == null) {
			bundle = GWT.create(LeafletMarkerClientBundle.class);
			LeafletMarkerResourceInjector injector = GWT
					.create(LeafletMarkerResourceInjector.class);
			injector.injectResources();
		}
	}

	/**
	 * Override this with deferred binding to customize injected stuff
	 */
	protected void injectResources() {
		bundle.css().ensureInjected();
		injectScript(bundle.baseScript().getText());
	}

	private static native void injectScript(String script)
	/*-{
	    $wnd.eval(script);
	}-*/;

}
