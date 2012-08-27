package org.gwt.leaflet.client.impl;

import org.gwt.leaflet.client.Options;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.json.client.JSONValue;

public final class Debug extends JavaScriptObject {

	// --------------------------------------------------------
	// JSNI (overlay) constructors 
	// --------------------------------------------------------
	
	/**
	 * Debug overlay type constructor. 
	 */
	protected Debug() { }

	/**
	 * Print message to javascrips console (client side) is available.
	 * 
	 * @param message - Any object which can be converted to {@link JSONValue}
	 * 
	 */
	public static final void log(Object message) {
		// Sanity check
		if(!Options.supports(message)) {
			// Best effort...
			message = String.valueOf(message!=null ? message.toString() : "");
		}
		nativeLog(Options.toJSO(message));
	};
	
	private native static final Debug nativeLog(JavaScriptObject message) /*-{
		console.log(message);
		return this;
	}-*/;

}
