package org.discotools.gwt.leaflet.client.controls.attribution;

import com.google.gwt.core.client.GWT;
import org.discotools.gwt.leaflet.client.GwtlTestCase;
import org.discotools.gwt.leaflet.client.controls.Control;
import org.discotools.gwt.leaflet.client.controls.Position;

/**
 * {@link Control} tests
 * @author kengu
 *
 */
public class AttributionGwtlTest extends GwtlTestCase {
	
	private static final String PREFIX = "prefix";
	private static final String TEXT = "text";

	public void testAttribution() {

		logTest("testAttribution", "{}");

		AttributionOptions options = new AttributionOptions(PREFIX,Position.BOTTOM_RIGHT);
		Attribution c = new Attribution(TEXT, options);
		assertEquals(Position.BOTTOM_RIGHT,c.getPosition());		
		assertEquals(PREFIX,c.getPrefix());		
	}
	
}
