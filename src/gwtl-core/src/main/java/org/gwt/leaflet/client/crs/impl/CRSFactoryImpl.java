package org.gwt.leaflet.client.crs.impl;

import org.gwt.leaflet.client.LeafletException;
import org.gwt.leaflet.client.crs.CRS;
import org.gwt.leaflet.client.crs.CRSFactory;
import org.gwt.leaflet.client.crs.EPSG3395;
import org.gwt.leaflet.client.crs.EPSG3857;
import org.gwt.leaflet.client.crs.EPSG4326;
import org.gwt.leaflet.client.crs.Simple;

/**
 * {@link CRSFactory} implementation.
 * 
 * @author kengu
 *
 */
public final class CRSFactoryImpl implements CRSFactory {

	@Override
	public CRS create(String code) throws LeafletException {
		if(CRS.EPSG4326.equals(code))
			return newEPSG4326();
		else if(CRS.EPSG3395.equals(code))
			return newEPSG3395();
		else if(CRS.EPSG3857.equals(code))
			return newEPSG3857();
		else if(CRS.SIMPLE.equals(code))
			return newSimple();
		
		// Not supported, notify
		throw new IllegalArgumentException("CRS code '" + code + "' is not supported");
	}
	
	private native static EPSG4326 newEPSG4326() /*-{
		return $wnd.L.CRS.EPSG4326;
	}-*/;
	
	private native static EPSG3395 newEPSG3395() /*-{
		return $wnd.L.CRS.EPSG3395;
	}-*/;
	
	private native static EPSG3857 newEPSG3857() /*-{
		return $wnd.L.CRS.EPSG3857;
	}-*/;
	
	private native static Simple newSimple() /*-{
		var crs = $wnd.L.CRS.Simple;
		crs.code = 'Simple';
		return crs;
	}-*/;
	

}
