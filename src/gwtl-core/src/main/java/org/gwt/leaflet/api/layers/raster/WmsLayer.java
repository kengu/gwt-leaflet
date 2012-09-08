package org.gwt.leaflet.api.layers.raster;

import org.gwt.leaflet.api.Options;
import org.gwt.leaflet.api.layers.ILayer;


/**
 * Used to load and display tile WmsLayer on the map.
 * 
 * @author kennethg
 * 
 * @see <a href="http://leaflet.cloudmade.com/reference.html#tilelayer-wms">L.TileLayer (Leaflet API)</a>
 *
 */
public interface WmsLayer extends ILayer {

	/**
	 * (<b>required</b>) Comma-separated list of WMS WmsLayer to show.
	 */
	public static final String LAYERS = "layers";

	/**
	 * Comma-separated list of WMS styles.
	 */
	public static final String STYLES = "styles";

	/**
	 * WMS image format (use 'image/png' for WmsLayer with transparency).
	 */
	public static final String FORMAT = "format";

	/**
	 * If true, the WMS service will return images with transparency.
	 */
	public static final String TRANSPARENT = "transparent";

	/**
	 * Version of the WMS service to use.
	 */
	public static final String VERSION = "version";

	
	@SuppressWarnings("serial")
	public final static Options DEFAULT = new Options(true){
		@Override
		protected void fill() {
			// Add required options (value is unknown at this point)
			put(LAYERS,"",true);
		}
	};
	
	/**
	 * Set <em>WmsLayer</em> option.
	 * @param WmsLayer -  Comma-separated list of WMS WmsLayer
	 * @return {@link WmsLayer}
	 */
	WmsLayer setLayers(String WmsLayer);

	/**
	 * Set <em>styles</em> option.
	 * @param styles -  Comma-separated list of WMS styles
	 * @return {@link WmsLayer}
	 */
	WmsLayer setStyles(String styles);
	
	/**
	 * Set <em>format</em> option.
	 * <p>
	 * <b>NOTE</b>: Use 'image/png' for WmsLayer if {@link #TRANSPARENT} is set to <code>true</code>.
	 * <p>	 
	 * @param format - WMS image format
	 * @return {@link WmsLayer}
	 */
	WmsLayer setFormat(String format);
	
	/**
	 * Set <em>transparent</em> option.
	 * <p>
	 * <b>NOTE</b>: Will only work if {@link #FORMAT} is set to 'image/png'.
	 * <p>
	 * @param isTransparent - if <code>true</code>, return images with transparency
	 * @return {@link WmsLayer}
	 */
	WmsLayer setTransparent(boolean isTransparent);
	
	/**
	 * Set <em>version</em> option.
	 * @param version -  Version of the WMS service to use
	 * @return {@link WmsLayer}
	 */
	WmsLayer setVersion(String version);

	/**
	 * Modify options in one operation.
	 * @param options {@link Options} instance.
	 * @return {@link WmsLayer}
	 */
	WmsLayer setOptions(Options options);
	
}
