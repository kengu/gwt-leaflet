package org.gwt.leaflet.impl.crs;

import org.gwt.leaflet.api.LeafletException;
import org.gwt.leaflet.api.crs.CRSFactory;
import org.gwt.leaflet.api.crs.EPSG3395;
import org.gwt.leaflet.api.crs.EPSG3857;
import org.gwt.leaflet.api.crs.EPSG4326;
import org.gwt.leaflet.api.crs.Simple;

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
