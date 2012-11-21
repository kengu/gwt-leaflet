package org.discotools.gwt.leaflet.client.controls;

import org.discotools.gwt.leaflet.client.GwtlTestCase;
import org.discotools.gwt.leaflet.client.Options;
import org.discotools.gwt.leaflet.client.map.Map;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.Element;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * {@link Control} tests
 * @author kengu
 *
 */
public class ControlImplGwtlTest extends GwtlTestCase {
	
	private static final String NAME  = "name";
	
	public void testControlImpl() {
		
		logTest("testControlImpl","{}");
		
		// Add map placeholder div
		cleanup();
		Element div = DOM.createDiv();
		div.setId(NAME);
		RootPanel.getBodyElement().appendChild(div);
		// Create map and control
		Map map = new Map(NAME);
		ControlImpl c = new ControlImpl();
		// Ensure map not set  
		assertFalse(c.isAdded());
		// Assert 'onAdd'
		map.addControl(c);
		assertTrue("'IControl::onAdd' callback is broken",c.isAdded());
		// Assert 'onRemove'  
		map.removeControl(c);
		assertFalse("'IControl::onRemove' callback is broken",c.isAdded());
	}
	
	private static class ControlImpl extends Control {
		
		boolean isAdded;

		public ControlImpl() {
			super(new Options(), true, true);
		}
		
		public boolean isAdded() {
			return isAdded;
		}

		@Override
		protected Element onAdd(JavaScriptObject map) {
			isAdded = true;
			return DOM.createDiv();
		}

		@Override
		protected IControl onRemove(JavaScriptObject map) {
			isAdded = false;
			return this;
		}
		
	}
	
	
	
}
