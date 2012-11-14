package org.discotools.gwt.leaflet.client.marker;

import org.discotools.gwt.leaflet.client.Options;
import org.discotools.gwt.leaflet.client.jsobject.JSObject;
import org.discotools.gwt.leaflet.client.map.Map;
import org.discotools.gwt.leaflet.client.marker.label.Label;
import org.discotools.gwt.leaflet.client.marker.label.LabelOptions;
import org.discotools.gwt.leaflet.client.types.LatLng;

public class MarkerWithLabel extends Marker implements Label<MarkerWithLabel> {

    public MarkerWithLabel(JSObject element) {
        super(element);
    }

    public MarkerWithLabel(LatLng latlng, Options options) {
        super(MarkerImpl.create(latlng.getJSObject(), options.getJSObject()));
    }

    @Override
    public MarkerWithLabel addTo(Map map) {
        MarkerImpl.addTo(getJSObject(), map.getJSObject());
        return this;
    }

    @Override
    public MarkerWithLabel showLabel() {
        MarkerWithLabelImpl.showLabel(getJSObject());
        return this;
    }

    @Override
    public MarkerWithLabel hideLabel() {
        MarkerWithLabelImpl.hideLabel(getJSObject());
        return this;
    }

    @Override
    public MarkerWithLabel unbindLabel() {
        MarkerWithLabelImpl.unbindLabel(getJSObject());
        return this;
    }

    @Override
    public MarkerWithLabel updateLabelContent(String content) {
        MarkerWithLabelImpl.updateLabelContent(getJSObject(), content);
        return this;
    }

    @Override
    public MarkerWithLabel bindLabel(String content, LabelOptions options) {
        MarkerWithLabelImpl.bindLabel(getJSObject(), content, options.getJSObject());
        return this;
    }

}
