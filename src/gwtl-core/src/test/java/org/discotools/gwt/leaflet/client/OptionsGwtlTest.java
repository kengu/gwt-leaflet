package org.discotools.gwt.leaflet.client;

import org.discotools.gwt.leaflet.client.GwtlTestCase;
import org.discotools.gwt.leaflet.client.jsobject.JSObject;
import org.discotools.gwt.leaflet.client.jsobject.JSObjectArray;
import org.discotools.gwt.leaflet.client.jsobject.JSObjectHelper;

/**
 * {@link Control} tests
 * 
 * @author kengu
 * 
 */
public class OptionsGwtlTest extends GwtlTestCase {

	public void testOptionsSetGetProperty() {
		logTest("testOptionsSetProperty", "{ key: JSObject }");
		Options o = new Options();
		JSObject value = JSObject.createJSObject();
		o.setProperty("key", value);
		assertEquals(value, o.getProperty("key"));
	}

	public void testOptionsSetGetPropertyAsString() {
		logTest("testOptionsSetGetPropertyAsString", "{ key: String }");
		Options o = new Options();
		o.setProperty("key", "String");
		assertEquals("String", o.getPropertyAsString("key"));
	}

	public void testOptionsSetGetPropertyAsBoolean() {
		logTest("testOptionsSetGetPropertyAsBoolean", "{ key: true }");
		Options o = new Options();
		o.setProperty("key", true);
		assertEquals(true, o.getPropertyAsBoolean("key"));
	}

	public void testOptionsSetGetPropertyAsInt() {
		logTest("testOptionsSetGetPropertyAsInt", "{ key: 10 }");
		Options o = new Options();
		o.setProperty("key", 10);
		assertEquals(10, o.getPropertyAsInt("key"));
	}

	public void testOptionsSetGetPropertyAsDouble() {
		logTest("testOptionsSetGetPropertyAsDouble", "{ key: 1.1 }");
		Options o = new Options();
		o.setProperty("key", 1.1);
		assertEquals(1.1, o.getPropertyAsDouble("key"));
	}

	public void testOptionsSetGetPropertyAsFloat() {
		float value = 2;
		logTest("testOptionsSetGetPropertyAsFloat", "{ key: 2 }");
		Options o = new Options();
		o.setProperty("key", value);
		assertEquals(value, o.getPropertyAsFloat("key"));
	}

	public void testOptionsSetGetPropertyAsArray() {
		logTest("testOptionsSetGetPropertyAsArray", "{ key: [JSObject,JSObject] }");
		Options o = new Options();
		JSObject[] expected = new JSObject[] { JSObject.createJSObject(),
				JSObject.createJSObject() };
		JSObject value = new JSObjectArray(expected).getJSObject();
		o.setProperty("key", value);
		JSObject[] actual = o.getPropertyAsArray("key");
		if (actual.length != expected.length)
			fail("Expected and actual array length mismatch");
		for (int i = 0; i < actual.length; i++)
			assertEquals(expected[i], actual[i]);
	}

}
