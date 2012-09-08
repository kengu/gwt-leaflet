package org.gwt.leaflet.impl.types;

import org.gwt.leaflet.api.LeafletException;
import org.gwt.leaflet.api.types.LatLng;
import org.gwt.leaflet.api.types.Point;
import org.gwt.leaflet.api.types.TypeFactory;

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
