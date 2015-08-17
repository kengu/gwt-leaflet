package org.discotools.gwt.leaflet.client;

import org.discotools.gwt.leaflet.client.jsobject.JSObject;
import org.discotools.gwt.leaflet.client.jsobject.JSObjectWrapper;

/**
 * Object with methods to test the following JSNI premises
 * <ol>
 * <li>Invocation of defined function succeeds</li>
 * <li>Invocation of undefined JSNI function fails</li>
 * <li>Values passed to callback function is returned unchanged</li>
 * <p /> 
 * @author kengu
 *
 */
public class JsniPremiseObject extends JSObjectWrapper {

	public JsniPremiseObject() {
		this(create());
	}
	
	protected JsniPremiseObject(JSObject jsObject) {
		super(jsObject);
	}
	
	public native void invokeDefined() /*-{
		return defined();
	}-*/;	
	
	public native String invokeUndefined() /*-{
		return undefined();	
	}-*/;

	public native String invokeCallback(String value) /*-{
		return callback(value);
	}-*/;
	
	private static native JSObject create()/*-{	
		defined = function() {};
		callback = function(value) { return value; };
	}-*/;


	public native boolean isWndAvailable()/*-{
		return $wnd !== undefined;
	}-*/;

}
