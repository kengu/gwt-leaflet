package org.gwt.leaflet.client.controls;


/**
 * <b>Control Positions</b>
 * <p>
 * Control positions (map corner to put a control to) are set using 
 * strings. Margins between controls and the map border are set with CSS,
 * so that you can easily override them.
 * </p>
 * @author kengu
 * @author Lionel Leiva-Marcon
 * 
 * @see <a href="http://leaflet.cloudmade.com/reference.html#control-positions">Control Positions (Leaflet API)</a>
 */
public interface Position {
    
	public static final String TOP_LEFT 	= "topleft";
	public static final String TOP_RIGHT 	= "topright";
	public static final String BOTTOM_LEFT	= "bottomleft";
	public static final String BOTTOM_RIGHT = "bottomright";
	public static final String HIDE         = "false";

}
