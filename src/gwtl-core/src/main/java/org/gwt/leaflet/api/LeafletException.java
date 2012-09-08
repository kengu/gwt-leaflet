package org.gwt.leaflet.api;

@SuppressWarnings("serial")
public class LeafletException extends RuntimeException {

	public LeafletException() {
	}

	public LeafletException(String message) {
		super(message);
	}

	public LeafletException(Throwable cause) {
		super(cause);
	}

	public LeafletException(String message, Throwable cause) {
		super(message, cause);
	}

}
