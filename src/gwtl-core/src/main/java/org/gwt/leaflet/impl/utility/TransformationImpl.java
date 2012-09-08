package org.gwt.leaflet.impl.utility;

import org.gwt.leaflet.api.types.Point;
import org.gwt.leaflet.api.utility.Transformation;

import com.google.gwt.core.client.JavaScriptObject;

public final class TransformationImpl extends JavaScriptObject implements Transformation {
	
	// --------------------------------------------------------
	// JSNI (overlay) constructors 
	// --------------------------------------------------------
	
	/**
	 * TileLayer overlay type constructor. 
	 */
	protected TransformationImpl() { }
	
	// --------------------------------------------------------
	// Transformation interface implementation
	// --------------------------------------------------------
	
	@Override
	public native Point transform(Point other) /*-{
		return this.transform(other);
	}-*/;

	@Override
	public native Point transform(Point other, double scale) /*-{
		return this.transform(other, scale);
	}-*/;

	@Override
	public native Point untransform(Point other) /*-{
		return this.untransform(other);
	}-*/;

	@Override
	public native Point untransform(Point other, double scale) /*-{
		return this.untransform(other, scale);
	}-*/;

}
