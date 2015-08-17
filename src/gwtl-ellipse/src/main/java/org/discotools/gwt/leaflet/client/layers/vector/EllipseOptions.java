package org.discotools.gwt.leaflet.client.layers.vector;

/**
 *
 * @author Haley Boyd
 *
 */
public class EllipseOptions extends
		PathOptions
{

	public EllipseOptions setStartAngle(
			double startAngle ) {
		return (EllipseOptions) setProperty(
				"startAngle",
				startAngle);
	}

	public EllipseOptions setEndAngle(
			double endAngle ) {
		return (EllipseOptions) setProperty(
				"endAngle",
				endAngle);
	}

}
