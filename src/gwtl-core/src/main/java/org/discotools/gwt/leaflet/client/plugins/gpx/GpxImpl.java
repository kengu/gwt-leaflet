package org.discotools.gwt.leaflet.client.plugins.gpx;

import org.discotools.gwt.leaflet.client.jsobject.JSObject;
import org.discotools.gwt.leaflet.client.layers.others.FeatureGroupImpl;

/**
 * <b>Gpx implementation class</b>
 * <p>
 * Thanks to Pavel Shramov who provided the initial implementation and Leaflet
 * integration. Original code was at https://github.com/shramov/leaflet-plugins.
 *
 * 
 * Then, Maxime Petazzoni improve the code by cleaning it up and change the way to record and make available more
 * information about the GPX track while it is being parsed so that the result
 * can be used to display additional information about the track that is
 * rendered on the Leaflet map.
 * 
 * <p>
 * This is just a wrap of the original javascript gpx.js library
 * 
 * @author Lionel Leiva-Marcon
 * 
 */
public class GpxImpl extends FeatureGroupImpl {

	public static native JSObject create(String url, JSObject options)/*-{
	   return new $wnd.L.gpx(url, options);
	}-*/;	
	
	public static native String getName(JSObject self) /*-{
	  return self.get_name();
	}-*/;
		
	public static native String getStartTime(JSObject self) /*-{
	  return self.get_start_time().toDateString() + ', '
            + self.get_start_time().toLocaleTimeString();
	}-*/;

	public static native String getDistanceImp(JSObject self) /*-{
	  return self.get_distance_imp().toFixed(2);
	}-*/;

	public static native String getDuration(JSObject self) /*-{
	  return self.get_duration_string(self.get_moving_time());
	}-*/;

	public static native String getDurationString(JSObject self) /*-{
	  return self.get_duration_string(self.get_moving_pace_imp(), true);
	}-*/;

	public static native String getAverageHr(JSObject self) /*-{
	  return self.get_average_hr();
	}-*/;

	public static native String getElevationGain(JSObject self) /*-{
	  return self.to_ft(self.get_elevation_gain()).toFixed(0);
	}-*/;

	public static native String getElevationLoss(JSObject self) /*-{
	  return self.to_ft(self.get_elevation_loss()).toFixed(0);
	}-*/;

	public static native String getElevationNet(JSObject self) /*-{
	  return self.to_ft(self.get_elevation_gain()
       - self.get_elevation_loss()).toFixed(0);
	}-*/;
     
}