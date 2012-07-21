package org.gwt.leaflet.api;

/**
 * <b>Used to add attribution to maps</b>.
 * <p>
 * The attribution control allows you to display attribution data in a small text box on a map. 
 * It is put on the map by default unless you set its attributionControl option to false, and it 
 * fetches attribution texts from layers with getAttribution method automatically.
 * <p>
 * @author kennethg
 * 
 * @see <a href="http://leaflet.cloudmade.com/reference.html#control-attribution">L.Control.Attribution (Leaflet API)</a>
 *
 */
public interface Attribution extends Control {

	@SuppressWarnings("serial")
	public final static Options DEFAULT = new Options(true){
		@Override void fill() {
			// TODO: Add required options (one at this point)
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
