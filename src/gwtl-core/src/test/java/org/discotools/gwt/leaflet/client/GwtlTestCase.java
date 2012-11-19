package org.discotools.gwt.leaflet.client;

import com.google.gwt.junit.client.GWTTestCase;

public class GwtlTestCase extends GWTTestCase {

	public static final String PACKAGE = "org.discotools.gwt.leaflet";

	public static final String NAME = PACKAGE + ".Core";

	@Override
	public String getModuleName() {
		return NAME;
	}

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
