package org.discotools.gwt.leaflet.client;

import java.util.ArrayList;
import java.util.List;

import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.Element;
import com.google.gwt.user.client.ui.RootPanel;

public class GwtlTestCase extends GWTTestCase {

	public static final String PACKAGE = "org.discotools.gwt.leaflet";

	public static final String NAME = PACKAGE + ".Core";

	@Override
	public String getModuleName() {
		return NAME;
	}
	
	/**
	 * This method defensively cleanup the {@link DOM} after each test run
	 */
	@Override
	protected void gwtTearDown() throws Exception {
		cleanup();
	}
	
	@Override
	protected void gwtSetUp() throws Exception {
		super.gwtSetUp();
		LeafletResourceInjector.ensureInjected();
	}
	
	/**
	 * This method defensively cleanup the {@link DOM} after each test run
	 */
	protected void cleanup() {
		Element bodyElem = RootPanel.getBodyElement();

	    List<Element> toRemove = new ArrayList<Element>();
	    for (int i = 0, n = DOM.getChildCount(bodyElem); i < n; ++i) {
	      Element elem = DOM.getChild(bodyElem, i);
	      String nodeName = getNodeName(elem);
	      if (!"script".equals(nodeName) && !"iframe".equals(nodeName)) {
	        toRemove.add(elem);
	      }
	    }

	    for (int i = 0, n = toRemove.size(); i < n; ++i) {
	      DOM.removeChild(bodyElem, toRemove.get(i));
	    }		
	}
	
	protected static native String getNodeName(Element elem) /*-{
	    return (elem.nodeName || "").toLowerCase();
	 }-*/;	
	
	protected static void logTest(String test, String... args) {
		StringBuffer b = new StringBuffer(test);
		b.append("(");
		for (String arg : args) {
			b.append(arg);
			b.append(", ");
		}
		if (args.length > 0) 
			b.setLength(b.length()-2);
		b.append(")");
		System.out.println(b.toString());
	}

}
