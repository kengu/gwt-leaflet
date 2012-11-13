package org.discotools.gwt.leaflet.client.marker.label;

/**
 * Marker interface for Label enchanced layers
 * @author David Ignjic
 *
 * @param <T>
 */
public interface Label<T> {

    T showLabel();

    T hideLabel();

    T unbindLabel();

    T updateLabelContent(String content);

    T bindLabel(String content, LabelOptions options);

}
