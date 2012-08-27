package org.gwt.leaflet.client;

public interface Literal {

	/**
	 */
	public abstract int getValue();

	/**
	 */
	public abstract String getName();

	/**
	 */
	public abstract String getLiteral();

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 */
	public abstract String toString();

}