package org.gwt.leaflet.impl;

import org.gwt.leaflet.api.Leaflet;
import org.gwt.leaflet.api.controls.ControlFactory;
import org.gwt.leaflet.api.crs.CRSFactory;
import org.gwt.leaflet.api.layers.LayerFactory;
import org.gwt.leaflet.api.map.MapFactory;
import org.gwt.leaflet.api.types.TypeFactory;
import org.gwt.leaflet.impl.utility.TransformationImpl;

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
