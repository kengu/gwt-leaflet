package org.gwt.leaflet.api;

import java.util.HashMap;
import java.util.Map.Entry;

import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONString;

@SuppressWarnings("serial")
public class Options extends HashMap<String, String> {

	public JSONObject toJSON() {
		return toJSON("");
	}

	public JSONObject toJSON(String prefix) {
		JSONObject json = new JSONObject();
		for(Entry<String, String> e : entrySet()) {
			json.put(prefix+e.getKey(), new JSONString(e.getValue()));
		}
		return json;
	}
	
}
