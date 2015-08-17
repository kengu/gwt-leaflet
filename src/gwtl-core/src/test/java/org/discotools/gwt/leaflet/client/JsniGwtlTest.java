package org.discotools.gwt.leaflet.client;

import com.google.gwt.core.client.JavaScriptException;

public class JsniGwtlTest extends GwtlTestCase {
	
	JsniPremiseObject o;
	
	@Override
	protected void gwtSetUp() throws Exception {
		o = new JsniPremiseObject();
	}

	public void testIsWndAvailable() {
		logTest("testIsWndAvailable");
		try {
			o.isWndAvailable();
		} catch (JavaScriptException e) {
			e.printStackTrace();
			fail("JSNI premise 'GWT window is available' failed");
		}
	}

	public void testJsniDefined() {
		logTest("testJsniDefined");
		try {
			o.invokeDefined();
		} catch (JavaScriptException e) {			
			e.printStackTrace();
			fail("JSNI premise 'defined functions succeeds' failed");
		}
	}
	
	public void testJsniCallback() {		
		String value = "value";
		logTest("testJsniCallback",value);
		try {
			assertEquals(value,o.invokeCallback("value"));
		} catch (JavaScriptException e) {			
			e.printStackTrace();
			fail("JSNI premise 'callback functions succeeds' failed");
		}
	}	
	
	public void testJsniUndefined() {
		logTest("testJsniUndefined");
		try {
			o.invokeUndefined();
		} catch (JavaScriptException e) {
			return;
		}
		fail("JSNI premise 'undefined functions fails' failed");
	}
	

}
