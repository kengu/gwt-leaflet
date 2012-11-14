gwt-leaflet 
===========

[![Build Status](https://secure.travis-ci.org/kengu/gwt-leaflet.png)](http://travis-ci.org/kengu/gwt-leaflet)

A __lightweight__ mapping alternative to popular mapping APIs like Google Maps and OpenLayers.

The library uses [Leaflet](http://leaflet.cloudmade.com/), an open-source javascript library for 
mobile-friendly interactive maps by [CloudMade](http://cloudmade.com/), to implement a collection of mapping 
[Widgets](http://google-web-toolkit.googlecode.com/svn/javadoc/latest/com/google/gwt/user/client/ui/Widget.html)
which GWT projects can use to implement mapping capabilites on the [client-side](https://developers.google.com/web-toolkit/doc/latest/FAQ_Client) 
of a GWT application. The [Leaflet API](http://leaflet.cloudmade.com/reference.html) is a third-party javascript
and is integrated with GWT as Java classes using [JSNI](https://developers.google.com/web-toolkit/doc/latest/DevGuideCodingBasicsJSNI)
and [Type Overlays](https://developers.google.com/web-toolkit/doc/latest/DevGuideCodingBasicsOverlay). 

Features
========

**Warning**: This project is in flux. API, module structure and names can change at any time!

###<a href="https://github.com/kengu/gwt-leaflet/issues/milestones">Milestones</a>###

+ v0.1 (Medio Sep 2012) - Core parts of Leaflet API exposed
+ v0.2 (Primo Nov 2012) - All relevant parts of Leaflet API exposed, start publishing snapshots (maven + jars)
+ v0.3 (Ultimo Dec 2012) - Widgets: geolocation (field), first official release (maven + jars).

###<a href="gwt-leaflet/tree/master/src/gwtl-core">Core Module</a>###

**Dependency**: Leaflet 0.4.5

Following parts of Leaflet API are implemented:

+ [L.Map](http://leaflet.cloudmade.com/reference.html#map-class) - Leaflet Map class (partial)
+ [ILayer](http://leaflet.cloudmade.com/reference.html#ilayer) - Common layer interface
+ [L.TileLayer](http://leaflet.cloudmade.com/reference.html#tilelayer) - Common Tile layer class
+ [L.TileLayer.WMS](http://leaflet.cloudmade.com/reference.html#tilelayer-wms) - WMS layer class 
+ [IControl](http://leaflet.cloudmade.com/reference.html#icontrol) - Common control interface
+ [L.Control.Layers](http://leaflet.cloudmade.com/reference.html#control-layers) - Layer switcher control class
+ [L.Control.Attribution](http://leaflet.cloudmade.com/reference.html#control-attribution) - Map and layer attribution class
+ [L.Control.Scale](http://leaflet.cloudmade.com/reference.html#control-scale) - Simple legend control class
+ [L.Control.Zoom](http://leaflet.cloudmade.com/reference.html#control-zoom) - Simple zoom control class
+ [L.Point](http://leaflet.cloudmade.com/reference.html#point) - Map point (coordinates in pixels)
+ [L.LatLng](http://leaflet.cloudmade.com/reference.html#latlng) - Geographical point
+ [L.Transformation](http://leaflet.cloudmade.com/reference.html#transformation) - Affine transformation
+ [ICRS](http://leaflet.cloudmade.com/reference.html#icrs) - Coordinate reference system interface
+ [L.CRS](http://leaflet.cloudmade.com/reference.html#icrs) - Base CRS class
+ [L.CRS.EPSG3395](http://leaflet.cloudmade.com/reference.html#icrs) - [EPSG:3395](http://spatialreference.org/ref/epsg/3395/)
+ [L.CRS.EPSG3857](http://leaflet.cloudmade.com/reference.html#icrs) - [EPSG:3857](http://spatialreference.org/ref/epsg/3857/)
+ [L.CRS.EPSG4326](http://leaflet.cloudmade.com/reference.html#icrs) - [EPSG:4326](http://spatialreference.org/ref/epsg/4326/)
+ [L.CRS.Simple](http://leaflet.cloudmade.com/reference.html#icrs) - Simple CRS (lat and lng into x and y directly)

###<a href="gwt-leaflet/tree/master/src/gwtl-widget">Widget Module (GWT)</a>###

+ MapWidget - GWT Widget displaying a Map instance (available from WindowBuilder Editor palette)
            
###<a href="gwt-leaflet/tree/master/src/gwtl-proj4">Proj4 Module (GWT)</a>###

**Dependency**: Proj4Leaflet [master/74a5a8b170ff58e635cba139cfaa25cd4cd5d022](https://github.com/kengu/Proj4Leaflet/commit/74a5a8b170ff58e635cba139cfaa25cd4cd5d022) (git)
                                    
+ Proj4 - Custom (local) CRS factory plugin to Leaflet ([Proj4Leaflet](https://github.com/kartena/Proj4Leaflet))

###<a href="gwt-leaflet/tree/master/src/gwtl-search">Search Module (GWT)</a>###

**Dependency**: leaflet-search [master/3b717c6ff2bbd5ad19ba4f851c152f67ca62b97d](https://github.com/stefanocudini/leaflet-search/commit/3b717c6ff2bbd5ad19ba4f851c152f67ca62b97d) (git)
                                    
+ Leaflet Search - Simple search plugin for Leaflet ([leaflet-search](https://github.com/stefanocudini/leaflet-search))

###<a href="gwt-leaflet/tree/master/src/gwtl-label">Label Module (GWT)</a>###

**Dependency**: Leaflet.label [master/f41dabbd6af7b1c156f055d3c6ee974fb683b918d](https://github.com/igieon/Leaflet.label/commit/f41dabbd6af7b1c156f055d3c6ee974fb683b918d) (git)
                                    
+ Leaflet label - Simple label plugin for Leaflet ([Leaflet.label](https://github.com/igieon/Leaflet.label))


Example
=======

Goto [gwtl-example.appspot.com](http://gwtl-example.appspot.com/example.html) to see a running example of the 
[GWT example project](https://github.com/kengu/gwt-leaflet/tree/master/src/gwtl-example).

Development
===========

This Git project structured as a Maven 
[multi-gwt-module project setup](http://mojo.codehaus.org/gwt-maven-plugin/user-guide/multiproject.html), 
(see [working with maven](http://code.google.com/p/google-web-toolkit/wiki/WorkingWithMaven))
and is developed using 

+ [Maven (3.0.4)](http://maven.apache.org/download.html)
+ [Maven GWT Plugin](http://mojo.codehaus.org/gwt-maven-plugin) - automatically downloaded by maven
+ [Eclipse IDE for Java Developers (3.7.2)](http://www.eclipse.org/downloads/packages/eclipse-ide-java-developers/indigosr2) 
+ [Google Eclipse Plugin](https://developers.google.com/eclipse/docs/getting_started) 
+ [Window Builder Pro](https://developers.google.com/java-dev-tools/download-wbpro)
+ [EGit](http://www.eclipse.org/egit/)
+ [Maven Integration for Eclipse 1.2](http://marketplace.eclipse.org/content/maven-integration-eclipse)
+ [Maven Integration for Eclipse WTP (Incubation) 0.16.0](http://marketplace.eclipse.org/node/441371)

Ensure that these are all installed and ready before you continue. To install from scratch, just

1. [Download and install Eclipse](http://www.eclipse.org/downloads/packages/eclipse-ide-java-developers/indigosr2)
2. <a href="ide/required-plugins-eclipse-3.7.2.p2f">Download P2 software file import file</a> and start Eclipse
3. Open File -> Import -> "Install Software Items from File" wizard
4. Enter path to p2f file downloaded in step 2
5. Check "Contact all update sites during install to find required software"
6. Press enter and follow the instructions.

**When you are all done, just** (linux)

7. fork this repo on github
8. clone the fork locally - ```git clone https://github.com/<username>/gwt-leaflet.git```
9. change directory to -  ```cd gwt-leaflet/src``` 
10. and run the command - ```mvn package```

which should automatically download some stuff for you and prepare the projects for import into Eclipse.

11. Switch to Eclipse and select File -> Import...
12. Select Maven -> Existing Maven Projects
13. Select Browse ... -> gwt-leaflet/src
14. Finish

which should import all projects into current workspace.

### Reference

You find more information in the [developer guide](https://github.com/kengu/gwt-leaflet/wiki/The-Developer-Guide).
