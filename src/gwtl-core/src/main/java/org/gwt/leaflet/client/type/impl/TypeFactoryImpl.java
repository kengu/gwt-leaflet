package org.gwt.leaflet.client.type.impl;

import org.gwt.leaflet.client.LeafletException;
import org.gwt.leaflet.client.type.LatLng;
import org.gwt.leaflet.client.type.Point;
import org.gwt.leaflet.client.type.TypeFactory;

public final class TypeFactoryImpl implements TypeFactory {

	@Override
	public native Point point(double x, double y, boolean round) throws LeafletException /*-{
		return new $wnd.L.Point(x, y, round);
	}-*/;


	@Override
	public native LatLng latlng(double lat, double lon) throws LeafletException /*-{
		return new $wnd.L.LatLng(lat, lon);
	}-*/;

}
