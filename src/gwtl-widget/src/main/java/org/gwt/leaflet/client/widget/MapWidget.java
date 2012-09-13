/********************************************************************
 * 
 * MapWidget.java is part of gwt-leaflet. 
 * 
 * Copyright (c) 2012, DISCO Foundation. All rights reserved.
 * 
 * gwt-leaflet is free software: you can redistribute it and/or modify 
 * it under the terms of the GNU General Public License as published 
 * by the Free Software Foundation, either version 3 of the License, 
 * or (at your option) any later version.
 * 
 * gwt-leaflet is distributed in the hope that it will be useful, but 
 * WITHOUT ANY WARRANTY; without even the implied warranty of 
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. 
 * 
 * See the GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License 
 * along with gwt-leaflet. If not, see http://www.gnu.org/licenses.
 * 
 *********************************************************************/
package org.gwt.leaflet.client.widget;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;

/**
 * @author kennethg
 *
 */
public class MapWidget extends Composite {
	
	/**
	 * Default constructor
	 * 
	 * @wbp.parser.constructor
	 */
	public MapWidget() {
		this("map");
	}
	
	public MapWidget(String name) {

		// Show it in a 'div' element
		initWidget(new HTMLPanel(
			"<div id=\""
					+ name
					+ "\" style=\"width:100%; height: 100%; position: relative;\">" +
					
				"MapPane: " + name + 
				
			"</div>"
		));
		
	}

}
