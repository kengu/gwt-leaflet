package org.gwt.leaflet.client.control;

import org.gwt.leaflet.client.Literal;
import org.gwt.leaflet.client.Options;
import org.gwt.leaflet.client.map.Map;

/**
 * <b>Base class for all Leaflet controls</b> 
 * <p>
 * Implements IControl interface. You can add controls to the map like this:
 * <pre>
 * control.addTo(map);
 * // the same as 
 * map.addControl(control);
 * </pre>
 * </p>
 * 
 * @author kengu
 *
 * @see <a href="http://leaflet.cloudmade.com/reference.html#control">L.Control (Leaflet API)</a>
 */
public interface Control extends IControl {

	/**
	 * The initial position of the control (one of the map corners).
	 * <p>
	 * Default: {@link Position#TOP_LEFT}.
	 */
	public static final String POSITION = "position";
	
	/**
	 * Default {@link Map} options.
	 */
	@SuppressWarnings("serial")
	public final static Options DEFAULT = new Options(true) {
		@Override protected void fill() {
			put(POSITION, Position.TOP_LEFT);
		}
	};
	
	// --------------------------------------------------------
	// Control base implementation
	// --------------------------------------------------------
	
	/**
	 * Returns the current position of the control.
	 * 
	 * @return Position
	 */
	Literal getPosition();
	
	/**
	 * Sets the position of the control.
	 * 
	 * @param position {@link Position} on {@link Map}.
	 * 
	 * @return Position
	 * 
	 */
	Control setPosition(Literal position);
	
	/**
	 * Adds the control to the map.
	 * @param map - {@link Map} instance
	 * @return {@link Control}
	 */
	Control addTo(Map map);

	/**
	 * Removes the control from the map.
	 * @param map - {@link Map} instance
	 * @return {@link Control}
	 */
	Control removeFrom(Map map);	
	
	/**
	 * <b>Control Positions</b>
	 * <p>
	 * Control positions (map corner to put a control to) are set using 
	 * enumerations or {@link #getLiteral() strings (literals)}. Margins 
	 * between controls and the map border are set with CSS, so that you 
	 * can easily override them.
	 * </p>
	 * @author kengu
	 * 
	 * @see <a href="http://leaflet.cloudmade.com/reference.html#control-positions">Control Positions (Leaflet API)</a>
	 */
	enum Position implements Literal {
	    
	    /**
	     * Top left of the map.
	     * @see #TOP_LEFT_VALUE
	     */
	    TOP_LEFT(0, "TOP_LEFT", "topleft"),

	    /**
	     * Top right of the map.
	     * @see #TOP_RIGHT_VALUE
	     */
	    TOP_RIGHT(2, "TOP_RIGHT", "topright"),
	    
	    /**
	     * Bottom left of the map.
	     * @see #BOTTOM_LEFT_VALUE
	     */
	    BOTTOM_LEFT(3, "BOTTOM_LEFT", "bottomleft"),
	    
	    /**
	     * Bottom right of the map.
	     * @see #BOTTOM_RIGHT_VALUE
	     */
	    BOTTOM_RIGHT(4, "BOTTOM_RIGHT", "bottomright");

	    /**
	     * The '<em><b>TOP_LEFT</b></em>' literal value.
	     * @see #TOP_LEFT
	     */
	    public static final int TOP_LEFT_VALUE = 0;

	    /**
	     * The '<em><b>TOP_RIGHT</b></em>' literal value.
	     * @see #TOP_RIGHT
	     */
	    public static final int TOP_RIGHT_VALUE = 1;
	    
	    /**
	     * The '<em><b>BOTTOM_LEFT</b></em>' literal value.
	     * @see #BOTTOM_LEFT
	     */
	    public static final int BOTTOM_LEFT_VALUE = 2;
	    
	    /**
	     * The '<em><b>BOTTOM_RIGHT</b></em>' literal value.
	     * @see #BOTTOM_RIGHT
	     */
	    public static final int BOTTOM_RIGHT_VALUE = 3;

	    /**
	     * An array of all the '<em><b>Position</b></em>' enumerators.
	     */
	    public static final Position[] VALUES =
	        new Position[] {
	            TOP_LEFT,
	            TOP_RIGHT,
	            BOTTOM_LEFT,
	            BOTTOM_RIGHT
	        };

	    /**
	     * Returns the '<em><b>Position</b></em>' literal with the specified literal value.
	     */
	    public static Literal get(String literal) {
	        for (int i = 0; i < VALUES.length; ++i) {
	            Literal result = VALUES[i];
	            if (result.toString().equals(literal)) {
	                return result;
	            }
	        }
	        return null;
	    }

	    /**
	     * Returns the '<em><b>Position</b></em>' literal with the specified name.
	     */
	    public static Literal getByName(String name) {
	        for (int i = 0; i < VALUES.length; ++i) {
	            Literal result = VALUES[i];
	            if (result.getName().equals(name)) {
	                return result;
	            }
	        }
	        return null;
	    }

	    /**
	     * Returns the '<em><b>Position</b></em>' literal with the specified integer value.
	     */
	    public static Literal get(int value) {
	        switch (value) {
	            case TOP_LEFT_VALUE: 		return TOP_LEFT;
	            case TOP_RIGHT_VALUE: 		return TOP_RIGHT;
	        	case BOTTOM_LEFT_VALUE: 	return BOTTOM_LEFT;
	            case BOTTOM_RIGHT_VALUE: 	return BOTTOM_RIGHT;
	        }
	        return null;
	    }

	    /**
	     */
	    private final int value;

	    /**
	     */
	    private final String name;

	    /**
	     */
	    private final String literal;

	    /**
	     * Only this class can construct instances.
	     */
	    private Position(int value, String name, String literal) {
	        this.value = value;
	        this.name = name;
	        this.literal = literal;
	    }

	    /* (non-Javadoc)
		 * @see org.gwt.leaflet.client.control.Literals#getValue()
		 */
	    @Override
		public int getValue() {
	      return value;
	    }

	    /* (non-Javadoc)
		 * @see org.gwt.leaflet.client.control.Literals#getName()
		 */
	    @Override
		public String getName() {
	      return name;
	    }

	    /* (non-Javadoc)
		 * @see org.gwt.leaflet.client.control.Literals#getLiteral()
		 */
	    @Override
		public String getLiteral() {
	      return literal;
	    }
	    
	    /* (non-Javadoc)
		 * @see org.gwt.leaflet.client.control.Literals#toString()
		 */
		@Override
	    public String toString() {
	        return literal;
	    }    

	}
	
	
}
