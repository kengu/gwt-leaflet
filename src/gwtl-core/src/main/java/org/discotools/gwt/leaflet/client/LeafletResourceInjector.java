package org.discotools.gwt.leaflet.client;

import com.google.gwt.core.client.GWT;

public class LeafletResourceInjector {

	protected static LeafletClienBundle bundle;

	public static void ensureInjected() {
		if (bundle == null) {
			bundle = GWT.create(LeafletClienBundle.class);
			LeafletResourceInjector injector = GWT
					.create(LeafletResourceInjector.class);
			injector.injectResources();
		}
	}

	/**
	 * Override this with deferred binding to customize injected stuff
	 */
	protected void injectResources() {
		bundle.css().ensureInjected();
		injectScript(bundle.baseScript().getText());
		setDefaultMarkerIconPath(getDefaultMarkerDirectory());
	}

	protected String getDefaultMarkerDirectory() {
		return GWT.getModuleBaseURL() + "gwtl-markers/";
	}

	protected native static void setDefaultMarkerIconPath(String path) 
	/*-{
		$wnd.L.Icon.Default.imagePath = path;
	}-*/;

	private static native void injectScript(String script)
	/*-{
	    $wnd.eval(script);
	}-*/;

}
