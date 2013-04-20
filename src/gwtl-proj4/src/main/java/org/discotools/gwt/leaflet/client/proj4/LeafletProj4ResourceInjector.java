package org.discotools.gwt.leaflet.client.proj4;

import com.google.gwt.core.client.GWT;

public class LeafletProj4ResourceInjector
{

	protected static LeafletProj4ClientBundle bundle;

	public static void ensureInjected() {
		if (bundle == null) {
			bundle = GWT.create(LeafletProj4ClientBundle.class);
			LeafletProj4ResourceInjector injector = GWT
					.create(LeafletProj4ResourceInjector.class);
			injector.injectResources();
		}
	}

	/**
	 * Override this with deferred binding to customize injected stuff
	 */
	protected void injectResources() {
		injectScript( bundle.proj4js().getText() );
		injectScript( bundle.proj4leaflet().getText() );
	}

	private static native void injectScript(String script)
	/*-{
	    $wnd.eval(script);
	}-*/;

}
