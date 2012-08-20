package org.gwt.leaflet.api;

/**
 * Used to load and display tile layers on the map.
 * 
 * @author kennethg
 * 
 * @see <a href="http://leaflet.cloudmade.com/reference.html#tilelayer">L.TileLayer (Leaflet API)</a>
 *
 */
public interface TileLayer extends Layer {

	@SuppressWarnings("serial")
	public final static Options DEFAULT = new Options(true){
		@Override void fill() {
			// TODO: Add required options (one at this point)
		}
	};
	
	/**
	 * Modify options in one operation.
	 * @param options {@link Options} instance.
	 * @return {@link Layers}
	 */
	Layers setOptions(Options options);
	
}
