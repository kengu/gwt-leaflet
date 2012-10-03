package org.gwt.leaflet.client.controls;

import org.gwt.leaflet.client.jsobject.JSObject;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.user.client.Element;

/**
 * {@link IControlImpl} implementation.
 * 
 * @author Lionel Leiva-Marcon
 *
 */
public class IControlImpl  {

	public static native Element onAdd(JSObject self, JavaScriptObject map)/*-{
		return self.onAdd(map);
	}-*/;
	
	public static native void onRemove(JSObject self, JavaScriptObject map)/*-{
		self.onRemove(map);
	}-*/;	

	public static native JSObject onAdd(Control control, JSObject self)/*-{
		self.onAdd=function(map){
		  			return control.@org.gwt.leaflet.client.controls.Control::onAdd(Lcom/google/gwt/core/client/JavaScriptObject;)(map);
			};
	}-*/;	
	
	public static native JSObject onRemove(Control control, JSObject self)/*-{
		self.onRemove=function(map){
	  			control.@org.gwt.leaflet.client.controls.Control::onRemove(Lcom/google/gwt/core/client/JavaScriptObject;)(map);
		};
	}-*/;	
	
}
