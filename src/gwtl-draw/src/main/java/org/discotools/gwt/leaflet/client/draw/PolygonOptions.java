package org.discotools.gwt.leaflet.client.draw;

/**
 * Polygon options include all of the Polyline options plus the option to show
 * the approximate area.
 * 
 * @author Haley Boyd
 *
 */
public class PolygonOptions extends
		PolylineOptions
{
	public PolygonOptions() {
		super();
	}

	/**
	 * Show the area of the drawn polygon in m², ha or km². The area is only
	 * approximate and become less accurate the larger the polygon is.
	 * 
	 * @param showArea
	 * @return
	 */
	public PolylineOptions setShowArea(
			boolean showArea ) {
		return (PolylineOptions) setProperty(
				"showArea",
				showArea);
	}
}
