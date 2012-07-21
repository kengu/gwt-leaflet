gwt-leaflet
===========

A __lightweight__ mapping alternative to popular mapping APIs like Google Maps API and OpenLayers for GWT. 

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

+ Map [[L.Map](http://leaflet.cloudmade.com/reference.html#map-class)]
+ LatLng [L.LatLng]((http://leaflet.cloudmade.com/reference.html#latlng)
+ Layer [ILayer](http://leaflet.cloudmade.com/reference.html#ilayer)
+ TileLayer [L.TileLayer](http://leaflet.cloudmade.com/reference.html#tilelayer)
+ WmsLayer [L.TileLayer](http://leaflet.cloudmade.com/reference.html#tilelayer-wms)
+ Control [L.TileLayer](http://leaflet.cloudmade.com/reference.html#icontrol)
+ Layers [L.Control.Layers](http://leaflet.cloudmade.com/reference.html#control-layers)
+ Attribution [L.Control.Attribution](http://leaflet.cloudmade.com/reference.html#control-attribution)

In addition, the following Widgets are implemented

+ MapPane - Primary GWT Widget

Example
=======

Goto [gwtl-example.appspot.com](http://gwtl-example.appspot.com/example.html) to see a running example of the 
[GWT example project](https://github.com/kengu/gwt-leaflet/tree/master/src/gwtl-example).

Development
===========

This Git project is broken down into several Eclipse projects, and is developed using 

+ [Eclipse Inidigo SR2 (3.7.2)](http://www.eclipse.org/downloads/packages/release/indigo/sr2) 
+ [Google Eclipse Plugin](https://developers.google.com/eclipse/docs/getting_started) 
+ [Window Builder Pro](https://developers.google.com/java-dev-tools/download-wbpro)
+ [EGit](http://www.eclipse.org/egit/)

You should download and install these before you continue (follow the links above). 

**When you are all done, just**

1. **download** __[this](https://raw.github.com/kengu/gwt-leaflet/master/gwt-leaflet.psf)__ 
project set file (you can read read more about it [here](http://wiki.eclipse.org/PSF)).
2. and **import all** Eclipse projects by: File -> Import -> Team -> Team Project Set -> [follow the instructions]

which should automatically clone gwt-leaflet down on you machine and into your Eclipse workspace.
