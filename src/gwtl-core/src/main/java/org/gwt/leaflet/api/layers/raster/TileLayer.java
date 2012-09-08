package org.gwt.leaflet.api.layers.raster;

import org.gwt.leaflet.api.Options;
import org.gwt.leaflet.api.layers.ILayer;

/**
 * Used to load and display tile layers on the map.
 * 
 * @author kennethg
 * 
 * @see <a href="http://leaflet.cloudmade.com/reference.html#tilelayer">L.TileLayer (Leaflet API)</a>
 *
 */
public interface TileLayer extends ILayer {

	@SuppressWarnings("serial")
	public final static Options DEFAULT = new Options(true){
		@Override
		protected void fill() {
			// TODO: Add required options (one at this point)
		}
	};
	
	/**
	 * Modify options in one operation.
	 * @param options {@link Options} instance.
	 * @return {@link TileLayer}
	 */
	TileLayer setOptions(Options options);
	
}
