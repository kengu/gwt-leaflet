package org.discotools.gwt.leaflet.client.plugins.gpx;

import org.discotools.gwt.leaflet.client.Options;
import org.discotools.gwt.leaflet.client.jsobject.JSObject;
import org.discotools.gwt.leaflet.client.layers.others.FeatureGroup;

/**
 * <b>Gpx class</b>
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
public class Gpx extends FeatureGroup {

	protected Gpx(JSObject element) {
		super(element);
	}

	public Gpx(String url, Options options) {
		super(GpxImpl.create(url, options.getJSObject()));
	}

	public String getName() {
		return GpxImpl.getName(getJSObject());
	}

	public String getStartTime() {
		return GpxImpl.getStartTime(getJSObject());
	}

	public String getDistanceImp() {
		return GpxImpl.getDistanceImp(getJSObject());
	}

	public String getDuration() {
		return GpxImpl.getDuration(getJSObject());
	}

	public String getDurationString() {
		return GpxImpl.getDurationString(getJSObject());
	}

	public String getAverageHr() {
		return GpxImpl.getAverageHr(getJSObject());
	}

	public String getElevationGain() {
		return GpxImpl.getElevationGain(getJSObject());
	}

	public String getElevationLoss() {
		return GpxImpl.getElevationLoss(getJSObject());
	}

	public String getElevationNet() {
		return GpxImpl.getElevationNet(getJSObject());
	}
	
	public String toDebugString() {
		String debug = new String();
		debug += getName()+"::";
		//debug += getStartTime()+"::";
		debug += getDistanceImp()+"::";
		debug += getDuration()+"::";
		debug += getDurationString()+"::";
//		debug += getAverageHr()+"::";
		debug += getElevationGain()+"::";
		debug += getElevationLoss()+"::";
		debug += getElevationNet()+"::";
		return debug;
	}
}
