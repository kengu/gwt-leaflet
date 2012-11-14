
package org.discotools.gwt.leaflet.client.handlers;


/**
 * An interface implemented by interaction handlers.
 * 
 * @author David Ignjic
 *
 * @see <a href="http://leafletjs.com/reference.html#ihandler">IHandler (Leaflet API)</a>
 */
public interface IHandler {

	
	/**
	 * Enables the handler.
	 */
	public void enable(); 

    /**
     * Disables the handler.
     */
    public void disable();
	

    /**
     * Returns true if the handler is enabled.
     */
	public boolean enabled();
    
}
