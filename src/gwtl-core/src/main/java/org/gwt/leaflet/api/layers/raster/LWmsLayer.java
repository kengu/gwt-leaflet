package org.gwt.leaflet.api.layers.raster;

import org.gwt.leaflet.api.LOptions;
import org.gwt.leaflet.api.Options;
import org.gwt.leaflet.api.jsutils.JSObject;
import org.gwt.leaflet.api.layers.ILLayer;
import org.gwt.leaflet.impl.layers.raster.LWmsLayerImpl;


/**
 * Used to load and display tile WmsLayer on the map.
 * 
 * @author kennethg
 * @author lionel leiva
 * 
 * @see <a href="http://leaflet.cloudmade.com/reference.html#tilelayer-wms">L.TileLayer (Leaflet API)</a>
 *
 */
public class LWmsLayer extends ILLayer {

	protected LWmsLayer(JSObject element) {
		super(element);
	}
	
	public LWmsLayer(String url, LOptions options) {
		this (LWmsLayerImpl.create(url, options.getJSObject()));
	}
	
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

	/**
	 * Set <em>WmsLayer</em> option.
	 * @param WmsLayer -  Comma-separated list of WMS WmsLayer
	 * @return {@link LWmsLayer}
	 */
	public void setLayers(String WmsLayer){
		LWmsLayerImpl.setLayers(getJSObject(), WmsLayer);
	}

	/**
	 * Set <em>styles</em> option.
	 * @param styles -  Comma-separated list of WMS styles
	 * @return {@link LWmsLayer}
	 */
	public void setStyles(String styles){
		LWmsLayerImpl.setStyles(getJSObject(), styles);
	}
	
	/**
	 * Set <em>format</em> option.
	 * <p>
	 * <b>NOTE</b>: Use 'image/png' for WmsLayer if {@link #TRANSPARENT} is set to <code>true</code>.
	 * <p>	 
	 * @param format - WMS image format
	 * @return {@link LWmsLayer}
	 */
	public void setFormat(String format) {
		LWmsLayerImpl.setFormat(getJSObject(), format);
	}
	
	/**
	 * Set <em>transparent</em> option.
	 * <p>
	 * <b>NOTE</b>: Will only work if {@link #FORMAT} is set to 'image/png'.
	 * <p>
	 * @param isTransparent - if <code>true</code>, return images with transparency
	 * @return {@link LWmsLayer}
	 */
	public void setTransparent(boolean isTransparent) {
		LWmsLayerImpl.setTransparent(getJSObject(), isTransparent);
	}
	
	/**
	 * Set <em>version</em> option.
	 * @param version -  Version of the WMS service to use
	 * @return {@link LWmsLayer}
	 */
	public void setVersion(String version) {
		LWmsLayerImpl.setVersion(getJSObject(), version);
	}

	/**
	 * Modify options in one operation.
	 * @param options {@link Options} instance.
	 * @return {@link LWmsLayer}
	 */
	public void  setOptions(LOptions options) {
		LWmsLayerImpl.setOptions(getJSObject(), options.getJSObject());
	}
	
}
