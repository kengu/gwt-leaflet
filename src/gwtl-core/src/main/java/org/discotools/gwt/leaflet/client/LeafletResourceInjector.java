package org.discotools.gwt.leaflet.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.StyleInjector;

public class LeafletResourceInjector {

	protected static LeafletClientBundle bundle;

	public static void ensureInjected() {
		if (bundle == null) {
			bundle = GWT.create(LeafletClientBundle.class);
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
        // Ensure correct image url is included by an ugly patch
        // Saves editing the css from leaflet project
        final String cssPatch =
          ".leaflet-control-layers-toggle {background-image: url(" + bundle.layers().getSafeUri().asString() + ");}";
        StyleInjector.injectStylesheet( cssPatch );
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
