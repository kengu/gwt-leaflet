package org.gwt.leaflet.client.type.impl;

import org.gwt.leaflet.client.type.Point;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * {@link Point} implementation.
 * 
 * @author kengu
 *
 */
public class PointImpl extends JavaScriptObject implements Point {

	// --------------------------------------------------------
	// JSNI (overlay) constructors 
	// --------------------------------------------------------
	
	/**
	 * PointImpl overlay type constructor. 
	 */
	protected PointImpl() { }
	
	// --------------------------------------------------------
	// Point interface implementation
	// --------------------------------------------------------

	@Override
	public final native double x() /*-{
		return new this.x;
	}-*/;

	@Override
	public final native double y() /*-{
		return new this.y;
	}-*/;

	@Override
	public final native double distanceTo(Point other) /*-{
		return this.distanceTo(other);
	}-*/;
	
	@Override
	public final native Point add(Point other) /*-{
		return this.add(other);
	}-*/;

	@Override
	public final native Point substract(Point other) /*-{
		return this.substract(other);
	}-*/;

	@Override
	public final native Point multiply(Point other) /*-{
		return this.multiply(other);
	}-*/;

	@Override
	public final native Point divide(Point other, boolean round) /*-{
		return this.divide(other);
	}-*/;

	@Override
	public final native Point round() /*-{
		return this.round(other);
	}-*/;

	@Override
	public final native Point clone() /*-{
		return this.clone();
	}-*/;

}
