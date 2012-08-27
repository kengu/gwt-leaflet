package org.gwt.leaflet.client.control;

import org.gwt.leaflet.client.Options;
import org.gwt.leaflet.client.control.Control.Position;

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
 * 
 * @see <a href="http://leaflet.cloudmade.com/reference.html#control-attribution">L.Control.Attribution (Leaflet API)</a>
 *
 */
public interface Attribution extends Control {
	
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
	final static String PREFIX = "prefix";
	
	/**
	 * Default {@link Options}.
	 */
	@SuppressWarnings("serial")
	public final static Options DEFAULT = new Options(true){
		@Override protected void fill() {
			put(POSITION, Position.BOTTOM_RIGHT.getLiteral());
			put(PREFIX, "Powered by Leaflet");
		}
	};
	
	/**
	 * Sets the string before the attributions ("Powered by Leaflet" by default).
	 * @param text - {@link Attribution} prefix.
	 */
	void setPrefix(String text);

	/**
	 * Adds an attribution text (e.g. "Vector data &copy; CloudMade").
	 * @param text - {@link Attribution} text.
	 */
	void addAttribution(String text);

	/**
	 * Removes an attribution text.
	 * @param text - {@link Attribution} text.
	 */
	void removeAttribution(String text);
	
}
