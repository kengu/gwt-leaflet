package org.gwt.leaflet.api.controls;

import org.gwt.leaflet.api.LeafletException;
import org.gwt.leaflet.api.Options;
import org.gwt.leaflet.api.layers.ILayer;

/**
 * Leaflet {@link Control} Factory Interface
 * 
 * @author kengu
 *
 */
public interface ControlFactory {
	
	/**
	 * Create {@link Layers} instance.
	 * @param bases - {@link Options} instance with layer name to base {@link ILayer} instance.
	 * @param overlays - {@link Options} instance with layer name to overlay {@link ILayer} instance.
	 * @param options - {@link Options} instance with {@link Layers} options.
	 * @return {@link Layers}
	 * @throws LeafletException
	 */
	public Layers layers(Options bases, Options overlays, Options options) throws LeafletException;

	/**
	 * Create {@link Attribution} instance.
	 * @param text - Attribution text
	 * @param options {@link Options} instance
	 * @return {@link Attribution}
	 * @throws LeafletException
	 */
	public Attribution attribution(String text, Options options) throws LeafletException;
	
	/**
	 * Create {@link Scale} instance.
	 * @param options {@link Options} instance
	 * @return {@link Scale}
	 * @throws LeafletException
	 */
	public Scale scale(Options options) throws LeafletException;
	
	/**
	 * Create {@link Zoom} instance.
	 * @param options {@link Options} instance
	 * @return {@link Zoom}
	 * @throws LeafletException
	 */
	public Zoom zoom(Options options) throws LeafletException;	
	
}
