package org.discotools.gwt.leaflet.client.example;

import org.discotools.gwt.leaflet.client.events.Event;
import org.discotools.gwt.leaflet.client.events.handler.EventHandler;
import org.discotools.gwt.leaflet.client.events.handler.EventHandler.Events;
import org.discotools.gwt.leaflet.client.events.handler.EventHandlerManager;
import org.discotools.gwt.leaflet.client.layers.ILayer;
import org.discotools.gwt.leaflet.client.layers.others.LayerGroup;
import org.discotools.gwt.leaflet.client.layers.vector.Circle;
import org.discotools.gwt.leaflet.client.map.Map;
import org.discotools.gwt.leaflet.client.marker.Marker;
import org.discotools.gwt.leaflet.client.marker.MarkerOptions;
import org.discotools.gwt.leaflet.client.types.DivIcon;
import org.discotools.gwt.leaflet.client.types.DivIconOptions;
import org.discotools.gwt.leaflet.client.types.LatLng;
import org.discotools.gwt.leaflet.client.types.LatLngBounds;
import org.discotools.gwt.leaflet.client.types.Point;

public class LeafletCircleEditor {
    LayerGroup layerGroup;

    Circle circle;

    private final Marker centerMarker;

    private final Marker northMarker;

    private final Marker southMarker;

    private final Marker westMarker;

    private final Marker eastMarker;

    public LeafletCircleEditor(Circle circle) {
        super();
        this.circle = circle;
        this.layerGroup = new LayerGroup(new ILayer[0]);

        final LatLng center = circle.getLatLng();
        centerMarker = new Marker(center, createMarkerOptions());

        layerGroup.addLayer(centerMarker);

        northMarker = new Marker(center, createMarkerOptions());
        southMarker = new Marker(center, createMarkerOptions());
        westMarker = new Marker(center, createMarkerOptions());
        eastMarker = new Marker(center, createMarkerOptions());

        layerGroup.addLayer(northMarker);
        layerGroup.addLayer(southMarker);
        layerGroup.addLayer(westMarker);
        layerGroup.addLayer(eastMarker);

        EventHandlerManager.addEventHandler(centerMarker, Events.drag, new EventHandler<Event>() {
            @Override
            public void handle(Event event) {
                LeafletCircleEditor.this.circle.setLatLng(centerMarker.getLatLng());
                recalculateMarkersPosition();
            };
        });

        addMarkerEvent(northMarker);
        addMarkerEvent(southMarker);
        addMarkerEvent(westMarker);
        addMarkerEvent(eastMarker);

    }

    protected void recalculateMarkersPosition() {
        centerMarker.setLatLng(circle.getLatLng());

        final LatLng center = circle.getLatLng();
        final LatLngBounds bounds = circle.getBounds();

        northMarker.setLatLng(new LatLng(bounds.getNorthEast().lat(), center.lng()));
        southMarker.setLatLng(new LatLng(bounds.getSouthEast().lat(), center.lng()));
        westMarker.setLatLng(new LatLng(center.lat(), bounds.getNorthWest().lng()));
        eastMarker.setLatLng(new LatLng(center.lat(), bounds.getNorthEast().lng()));
    }

    private void addMarkerEvent(final Marker marker) {
        EventHandlerManager.addEventHandler(marker, Events.drag, new EventHandler<Event>() {
            @Override
            public void handle(Event event) {
                circle.setRadius(marker.getLatLng().distanceTo(circle.getLatLng()));

                recalculateMarkersPosition();
            };
        });
    }

    protected MarkerOptions createMarkerOptions() {
        return new MarkerOptions().setIcon(new DivIcon(new DivIconOptions().setClassName("leaflet-div-icon leaflet-editing-icon").setIconSize(new Point(8, 8)))).setDraggable(true);
    }

    public void enable(Map map) {
        recalculateMarkersPosition();
        layerGroup.addTo(map);
    }

    public void disable(Map map) {
        map.removeLayer(layerGroup);
    }
}
