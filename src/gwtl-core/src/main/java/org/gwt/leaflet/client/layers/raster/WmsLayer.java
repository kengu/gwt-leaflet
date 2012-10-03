package org.gwt.leaflet.client.layers.raster;

import org.gwt.leaflet.client.Options;
import org.gwt.leaflet.client.jsobject.JSObject;
import org.gwt.leaflet.client.layers.ILayer;


/**
 * Used to load and display tile WmsLayer on the map.
 * 
 * @author kennethg
 * @author Lionel Leiva-Marcon
 * 
 * @see <a href="http://leaflet.cloudmade.com/reference.html#tilelayer-wms">L.TileLayer (Leaflet API)</a>
 *
 */
public class WmsLayer extends ILayer {

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

	protected WmsLayer(JSObject element) {
		super(element);
	}
	
	public WmsLayer(String url, Options options) {
		this (WmsLayerImpl.create(url, options.getJSObject()));
	}
	
	/**
	 * Set <em>WmsLayer</em> option.
	 * @param WmsLayer -  Comma-separated list of WMS WmsLayer
	 * @return {@link WmsLayer}
	 */
	public WmsLayer setLayers(String WmsLayer){
		WmsLayerImpl.setLayers(getJSObject(), WmsLayer);
		return this;
	}

	/**
	 * Set <em>styles</em> option.
	 * @param styles -  Comma-separated list of WMS styles
	 * @return {@link WmsLayer}
	 */
	public WmsLayer setStyles(String styles){
		WmsLayerImpl.setStyles(getJSObject(), styles);
		return this;
	}
	
	/**
	 * Set <em>format</em> option.
	 * <p>
	 * <b>NOTE</b>: Use 'image/png' for WmsLayer if {@link #TRANSPARENT} is set to <code>true</code>.
	 * <p>	 
	 * @param format - WMS image format
	 * @return {@link WmsLayer}
	 */
	public WmsLayer setFormat(String format) {
		WmsLayerImpl.setFormat(getJSObject(), format);
		return this;
	}
	
	/**
	 * Set <em>transparent</em> option.
	 * <p>
	 * <b>NOTE</b>: Will only work if {@link #FORMAT} is set to 'image/png'.
	 * <p>
	 * @param isTransparent - if <code>true</code>, return images with transparency
	 * @return {@link WmsLayer}
	 */
	public WmsLayer setTransparent(boolean isTransparent) {
		WmsLayerImpl.setTransparent(getJSObject(), isTransparent);
		return this;
	}
	
	/**
	 * Set <em>version</em> option.
	 * @param version -  Version of the WMS service to use
	 * @return {@link WmsLayer}
	 */
	public WmsLayer setVersion(String version) {
		WmsLayerImpl.setVersion(getJSObject(), version);
		return this;
	}

	/**
	 * Modify options in one operation.
	 * @param options {@link Options} instance.
	 * @return {@link WmsLayer}
	 */
	public WmsLayer setOptions(Options options) {
		return (WmsLayer)super.setOptions(options);
	}
	
}
