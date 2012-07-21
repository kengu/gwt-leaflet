package org.gwt.leaflet.api;

/**
 * Used to load and display tile layers on the map.
 * 
 * @author kennethg
 * 
 * @see <a href="http://leaflet.cloudmade.com/reference.html#tilelayer-wms">L.TileLayer (Leaflet API)</a>
 *
 */
public interface WmsLayer extends Layer {

	/**
	 * (<b>required</b>) Comma-separated list of WMS layers to show.
	 */
	public static final String LAYERS = "layers";

	/**
	 * Comma-separated list of WMS styles.
	 */
	public static final String STYLES = "styles";

	/**
	 * WMS image format (use 'image/png' for layers with transparency).
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
		@Override void fill() {
			// Add required options (value is unknown at this point)
			put(LAYERS,"",true);
		}
	};
	
	/**
	 * Set <em>layers</em> option.
	 * @param layers -  Comma-separated list of WMS layers
	 * @return {@link Layers}
	 */
	Layers setLayers(String layers);

	/**
	 * Set <em>styles</em> option.
	 * @param styles -  Comma-separated list of WMS styles
	 * @return {@link Layers}
	 */
	Layers setStyles(String styles);
	
	/**
	 * Set <em>format</em> option.
	 * <p>
	 * <b>NOTE</b>: Use 'image/png' for layers if {@link #TRANSPARENT} is set to <code>true</code>.
	 * <p>	 
	 * @param format - WMS image format
	 * @return {@link Layers}
	 */
	Layers setFormat(String format);
	
	/**
	 * Set <em>transparent</em> option.
	 * <p>
	 * <b>NOTE</b>: Will only work if {@link #FORMAT} is set to 'image/png'.
	 * <p>
	 * @param isTransparent - if <code>true</code>, return images with transparency
	 * @return {@link Layers}
	 */
	Layers setTransparent(boolean isTransparent);
	
	/**
	 * Set <em>version</em> option.
	 * @param version -  Version of the WMS service to use
	 * @return {@link Layers}
	 */
	Layers setVersion(String version);

	/**
	 * Modify options in one operation.
	 * @param options {@link Options} instance.
	 * @return {@link Layers}
	 */
	Layers setOptions(Options options);
	
}
