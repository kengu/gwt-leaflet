/********************************************************************
 * 
 * LatLng.java is part of SAR-Man. 
 * 
 * Copyright (c) 2012, DISCO Foundation. All rights reserved.
 * 
 * SAR-Man is free software: you can redistribute it and/or modify 
 * it under the terms of the GNU General Public License as published 
 * by the Free Software Foundation, either version 3 of the License, 
 * or (at your option) any later version.
 * 
 * SAR-Man is distributed in the hope that it will be useful, but 
 * WITHOUT ANY WARRANTY; without even the implied warranty of 
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. 
 * 
 * See the GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License 
 * along with SAR-Man. If not, see http://www.gnu.org/licenses.
 * 
 *********************************************************************/
package org.discotools.gwt.leaflet.client.types;

import org.discotools.gwt.leaflet.client.jsobject.JSObject;
import org.discotools.gwt.leaflet.client.jsobject.JSObjectArray;
import org.discotools.gwt.leaflet.client.jsobject.JSObjectWrapper;

/**
 * Represents a rectangular geographical area on a map.
 *  
 * @author Lionel Leiva-Marcon
 * @author David Ignjic
 *
 * @see <a href="http://leaflet.cloudmade.com/reference.html#latlngbounds">L.Latlngbounds (Leaflet API)</a>
 *
 */
public class LatLngBounds extends JSObjectWrapper {

	public LatLngBounds(JSObject element) {
		super(element); 
	}
	
	public LatLngBounds(LatLng southWest, LatLng northEast) {
		this (LatLngBoundsImpl.create(southWest.getJSObject(), northEast.getJSObject()));
	}

	public LatLngBounds(LatLng[] latlngs) {
		this (LatLngBoundsImpl.create(new JSObjectArray(latlngs).getJSObject()));
	}

    public LatLngBounds() {
        this (LatLngBoundsImpl.create());
    }
	
	/**
	 * Returns the south-west point of the bounds.
	 * @return
	 */
	public LatLng getSouthWest() {
		return new LatLng(LatLngBoundsImpl.getSouthWest(getJSObject()));
	}
	/**
	 * Returns the north-east point of the bounds.
	 * @return
	 */
	public LatLng getNorthEast() 	 {
		return new LatLng(LatLngBoundsImpl.getNorthEast(getJSObject()));
		
	}
	/**
	 * Returns the north-west point of the bounds.
	 * @return
	 */
	public LatLng getNorthWest()  {
		return new LatLng(LatLngBoundsImpl.getNorthWest(getJSObject()));
		
	}
	/**
	 * Returns the south-east point of the bounds.
	 * @return
	 */
	public LatLng getSouthEast() 	{
		return new LatLng(LatLngBoundsImpl.getSouthEast(getJSObject()));
		
	}
	/**
	 * Returns the center point of the bounds.
	 * @return
	 */
	public LatLng getCenter() 	 	{
		return new LatLng(LatLngBoundsImpl.getCenter(getJSObject()));
	}
	
	
	/**
	 * Returns a string with bounding box coordinates in 
	 * a 'southwest_lng,southwest_lat,northeast_lng,northeast_lat' format. 
	 * Useful for sending requests to web services that return geo data.
	 * @return String
	 */
	public String toBBoxString() {
		return LatLngBoundsImpl.toBBoxString(getJSObject());
	}
	
	
    @Override
    public String toString() {
        return toBBoxString();
    }

    /**
     * Extends the bounds to contain the given  bounds.
     * 
     * @param bounds
     * @return
     */
    public    LatLngBounds extend(LatLngBounds bounds){
        LatLngBoundsImpl.extend(getJSObject(),bounds.getJSObject());
        return this;
    }
    
    /**
     * Extends the bounds to contain the given point.
     * @param point
     * @return
     */
    public    LatLngBounds extend(LatLng point){
        LatLngBoundsImpl.extend(getJSObject(),point.getJSObject());
        return this;

    }
    
    /**
     * Returns true if the rectangle contains the given point.
     * @param latLng
     * @return
     */
    public   boolean contains(LatLng latLng){
        return LatLngBoundsImpl.contains(getJSObject(),latLng.getJSObject());

    }
    
    /**
     * Returns true if the rectangle contains the given one.
     * @param latLngBounds
     * @return
     */
    public   boolean contains(LatLngBounds latLngBounds){
        return LatLngBoundsImpl.contains(getJSObject(),latLngBounds.getJSObject());

    }    
}
