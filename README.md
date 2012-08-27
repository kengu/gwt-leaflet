gwt-leaflet
===========

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

Following Leaflet features are implemented (Java interface names, Leaflet API in brackets):

+ Map - Primary interface ([L.Map](http://leaflet.cloudmade.com/reference.html#map-class))
+ LatLng - Position position ([L.LatLng](http://leaflet.cloudmade.com/reference.html#latlng))
+ Layer - Common layer interface ([ILayer](http://leaflet.cloudmade.com/reference.html#ilayer))
+ TileLayer - TileCache layer interface ([L.TileLayer](http://leaflet.cloudmade.com/reference.html#tilelayer))
+ WmsLayer - WMS layer interface ([L.TileLayer.WMS](http://leaflet.cloudmade.com/reference.html#tilelayer-wms))
+ Control - Common control interface  ([IControl](http://leaflet.cloudmade.com/reference.html#icontrol))
+ Layers - Layer selector control ([L.Control.Layers](http://leaflet.cloudmade.com/reference.html#control-layers))
+ Attribution - Attribution control ([L.Control.Attribution](http://leaflet.cloudmade.com/reference.html#control-attribution))

In addition, the following Widgets are implemented

+ MapPane - Primary GWT Widget

Example
=======

Goto [gwtl-example.appspot.com](http://gwtl-example.appspot.com/example.html) to see a running example of the 
[GWT example project](https://github.com/kengu/gwt-leaflet/tree/master/src/gwtl-example).

Development
===========

This Git project is broken down into a Maven 
[multi-gwt-module project setup](http://mojo.codehaus.org/gwt-maven-plugin/user-guide/multiproject.html), 
(see [working with maven](http://code.google.com/p/google-web-toolkit/wiki/WorkingWithMaven))
and is developed using 

+ [Maven (3.0.4)](http://maven.apache.org/download.html)
+ [Maven GWT Plugin](http://mojo.codehaus.org/gwt-maven-plugin) - automatically downloaded by maven
+ [Eclipse Inidigo SR2 (3.7.2)](http://www.eclipse.org/downloads/packages/release/indigo/sr2) 
+ [Google Eclipse Plugin](https://developers.google.com/eclipse/docs/getting_started) 
+ [Window Builder Pro](https://developers.google.com/java-dev-tools/download-wbpro)
+ [EGit](http://www.eclipse.org/egit/)
+ [m2eclipse-wtp](http://download.jboss.org/jbosstools/updates/m2eclipse-wtp)

You should download and install these before you continue (follow the links above). 

**When you are all done, just** (linux)

1. fork this repo on github
2. clone the fork locally - ```git clone https://github.com/<username>/gwt-leaflet.git```
3. change directory to -  ```cd gwt-leaflet/src``` 
4. and run the command - ```mvn package```

which should automatically download some stuff for you and prepare the projects for import into Eclipse.

5. Switch to Eclipse and select File -> Import...
6. Select Maven -> Existing Maven Projects
7. Select Browse ... -> gwt-leaflet/src
8. Finish

which should import all projects into current workspace.