package org.discotools.gwt.leaflet.client.types;

public class IconLabelOptions extends IconOptions {

    /**
     * The label is positioned relative to the L.Icon's iconAnchor option. To reposition the label set the labelAnchor option of your icon. By default labelAnchor is set so the label will show vertically centered for the default icon (L.Icon.Default).
     *  <code>
     *   <pre>
     *  var myIcon = L.icon({
     *      iconUrl: 'my-icon.png',
            iconSize: [20, 20],
            iconAnchor: [10, 10],
            labelAnchor: [6, 0] // as I want the label to appear 2px past the icon (10 + 2 - 6)
        });
        </pre>
     *  </code> 
     * @param labelAnchor
     * @return
     */
    public IconLabelOptions setLabelAnchor(Point labelAnchor) {
        setProperty("labelAnchor", labelAnchor);
        return this;
    }
}
