package org.gwt.leaflet.client.impl;

import org.gwt.leaflet.client.Leaflet;
import org.gwt.leaflet.client.control.ControlFactory;
import org.gwt.leaflet.client.crs.CRSFactory;
import org.gwt.leaflet.client.layer.LayerFactory;
import org.gwt.leaflet.client.map.MapFactory;
import org.gwt.leaflet.client.math.impl.TransformationImpl;
import org.gwt.leaflet.client.type.TypeFactory;

import com.google.gwt.core.client.GWT;

/**
 * <b>Leaflet object factories entry point implementation</b>
 * <p>
 * This interface it the principal entry point to all object factories. 
 * </p>
 * @author kengu
 *
 */
public final class LeafletImpl implements Leaflet {

	@Override
	public MapFactory map() {
		return GWT.create(MapFactory.class);
	}

	@Override
	public CRSFactory crs() {
		return GWT.create(CRSFactory.class);
	}

	@Override
	public TypeFactory type() {
		return GWT.create(TypeFactory.class);
	}
	
	@Override
	public LayerFactory layer() {
		return GWT.create(LayerFactory.class);
	}
	
	@Override
	public ControlFactory control() {
		return GWT.create(ControlFactory.class);
	}

	@Override
	public native TransformationImpl transformation(double a, double b, double c, double d) /*-{
		return new $wnd.L.Transformation(a, b, c, d);
	}-*/;

}
