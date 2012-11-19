package org.discotools.gwt.leaflet.client.controls;

import org.discotools.gwt.leaflet.client.GwtlTestCase;

/**
 * {@link Control} tests
 * @author kengu
 *
 */
public class ControlGwtlTest extends GwtlTestCase {
	
	public void testControlOptions() {
		logTest("testControlOptions","{ position: \"left\" }");
		ControlOptions o = new ControlOptions();
		o.setPosition("left");
		Control c = new Control(o);
		assertEquals(c.getPosition(),"left");
	}

	public void testNewControl() {
		logTest("testNewControl","{}");
		Control c = new Control(new ControlOptions());
		assertNotNull(c);
	}
	
}
