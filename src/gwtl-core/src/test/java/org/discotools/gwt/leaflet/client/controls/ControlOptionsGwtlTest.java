package org.discotools.gwt.leaflet.client.controls;

import org.discotools.gwt.leaflet.client.GwtlTestCase;

/**
 * {@link Control} tests
 * @author kengu
 *
 */
public class ControlOptionsGwtlTest extends GwtlTestCase {
	
	public void testControlOptions() {
		logTest("testControlOptions","{ position: \""+Position.BOTTOM_LEFT+"\" }");
		ControlOptions o = new ControlOptions();
		o.setPosition(Position.BOTTOM_LEFT);
		Control c = new Control(o);
		assertEquals(Position.BOTTOM_LEFT, c.getPosition());
	}

}
