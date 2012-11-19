package org.discotools.gwt.leaflet.client;

import java.util.HashSet;
import java.util.Set;

import com.google.gwt.junit.tools.GWTTestSuite;

import net.sf.extcos.ComponentQuery;
import net.sf.extcos.ComponentScanner;

import junit.framework.Test;
import junit.framework.TestCase;

public class GwtlTestSuite extends TestCase {

	/**
	 * List of all {@link GwtlTestCase}s
	 */
	private final static Set<Class<? extends GwtlTestCase>> cases = new HashSet<Class<? extends GwtlTestCase>>();

	/**
	 * Find all {@link GwtlTestCase}s in the "
	 * <code>com.devbliss.idpool.gwt</code>" package and return a suite
	 * containing these tests.
	 */
	public static Test suite() {
		
		// Find all tests
		ComponentScanner scanner = new ComponentScanner();
		scanner.getClasses(new ComponentQuery() {
			@Override
			protected void query() {
				select().from(GwtlTestCase.PACKAGE).andStore(
						thoseExtending(GwtlTestCase.class).into(cases));
			}
		});

		// Add all tests to suite
		System.out.println();
		System.out.println("Found tests:");
		System.out.println();
		GWTTestSuite suite = new GWTTestSuite("gwtl-core tests");
		for (Class<? extends GwtlTestCase> it : cases) {			
			System.out.println(it.getSimpleName());
			suite.addTestSuite(it);
		}
		return suite;
	}

}
