package org.gwt.leaflet.client.util;

import org.gwt.leaflet.client.options.Options;

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
		if(message == null
				|| message instanceof Options
				|| message instanceof Number
				|| message instanceof String
				|| message instanceof Character
				|| message instanceof Boolean
				|| message instanceof JSONValue
				|| message instanceof JavaScriptObject
				|| message instanceof Object[]) {
			nativeLog(String.valueOf(message));
		}
		else {
			// Best effort...
			nativeLog(String.valueOf(message!=null ? message.toString() : ""));
		}
	};
	
	private native static final void nativeLog(String message) /*-{
		console.log(message);
	}-*/;

}
