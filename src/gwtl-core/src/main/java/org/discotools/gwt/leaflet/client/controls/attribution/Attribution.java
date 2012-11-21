package org.discotools.gwt.leaflet.client.controls.attribution;

import org.discotools.gwt.leaflet.client.controls.Control;
import org.discotools.gwt.leaflet.client.controls.Position;

/**
 * <bAdds attribution to maps</b>.
 * <p>
 * The attribution control allows you to display attribution data in a small text box on a map. 
 * It is put on the map by default unless you set its attributionControl option to false, and it 
 * fetches attribution texts from layers with getAttribution method automatically.
  * <p>
 * <b>Options</b>
 * <nl>
 * <li>{@link #POSITION}</li>
 * <li>{@link #PREFIX}</li>
 * </nl>
 * </p>

 * @author kennethg
 * @author Lionel Leiva-Marcon
 * 
 * @see <a href="http://leaflet.cloudmade.com/reference.html#control-attribution">L.Control.Attribution (Leaflet API)</a>
 *
 */
public class Attribution extends Control {
	
	/**
	 * The initial position of the control (one of the map corners).
	 * <p>
	 * Default: {@link Position#BOTTOM_RIGHT}.
	 */
	public static final String POSITION = "position";

	/**
	 * The HTML text shown before the attributions. Pass <code>false</code> to disable.
	 * <p>
	 * DEFAULT: 'Powered by Leaflet'
	 */
	public static final String PREFIX = "prefix";

	public Attribution(AttributionOptions options) {
		this("",options);
	}
	
	public Attribution(String text, AttributionOptions options) {
		super(AttributionImpl.create(text, options.getJSObject()));		
	}

	/**
	 * Get the string before the attributions ("Powered by Leaflet" by default).
	 */
	public String getPrefix() {
		return AttributionImpl.getPrefix(getJSObject());
	}
	
	/**
	 * Sets the string before the attributions ("Powered by Leaflet" by default).
	 * @param text - {@link Attribution} prefix.
	 */
	public Attribution setPrefix(String text) {
		AttributionImpl.setPrefix(getJSObject(), text);
		return this;
	}

	/**
	 * Adds an attribution text (e.g. "Vector data &copy; CloudMade").
	 * @param text - {@link Attribution} text.
	 */
	public Attribution addAttribution(String text) {
		AttributionImpl.addAttribution(getJSObject(), text);
		return this;
	}

	/**
	 * Removes an attribution text.
	 * @param text - {@link Attribution} text.
	 */
	public Attribution removeAttribution(String text) {
		AttributionImpl.removeAttribution(getJSObject(), text);
		return this;
	}
	
}
