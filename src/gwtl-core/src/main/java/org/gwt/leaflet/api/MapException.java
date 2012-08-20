package org.gwt.leaflet.api;

@SuppressWarnings("serial")
public class MapException extends RuntimeException {

	public MapException() {
	}

	public MapException(String message) {
		super(message);
	}

	public MapException(Throwable cause) {
		super(cause);
	}

	public MapException(String message, Throwable cause) {
		super(message, cause);
	}

}
