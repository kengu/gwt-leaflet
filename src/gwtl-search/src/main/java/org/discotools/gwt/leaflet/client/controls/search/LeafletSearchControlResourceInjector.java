package org.discotools.gwt.leaflet.client.controls.search;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.StyleInjector;

public class LeafletSearchControlResourceInjector
{

	protected static LeafletSearchControlClientBundle bundle;

	public static void ensureInjected() {
		if (bundle == null) {
			bundle = GWT.create(LeafletSearchControlClientBundle.class);
			LeafletSearchControlResourceInjector injector = GWT
					.create(LeafletSearchControlResourceInjector.class);
			injector.injectResources();
		}
	}

	/**
	 * Override this with deferred binding to customize injected stuff
	 */
	protected void injectResources() {
		bundle.css().ensureInjected();
        // Ensure correct image url is included by an ugly patch
        // Saves editing the css from search project
        final String cssPatch =
          ".leaflet-control-search .search-button {background: url('" +
          bundle.searchIcon().getSafeUri().asString() +
          "') no-repeat -1px -1px;}";
        StyleInjector.injectStylesheet( cssPatch );

		injectScript( bundle.baseScript().getText() );
	}

	private static native void injectScript(String script)
	/*-{
	    $wnd.eval(script);
	}-*/;

}
