<link rel="stylesheet" type="text/css" href="_styles/styles.css">

Location Settings
=================

<figure class="image">
  <img class="screenshot" src="_static/images/settings/location/settings_location_framed.png" width="350px"> 
  <figcaption><i>Location settings screen layout</i></figcaption> 
</figure>

GeoCoordinates
--------------

#### <img class="icon" src="_static/icons/formats/crosshairs-gps.png"> Location Provider

Set the source of location data. The device gps or connect an external device with bluetooth.

#### <img class="icon" src="_static/icons/settings/location/select-marker.png"> Collection Level

Set the method for collecting location while using Field Book. Can be at the level of the field, the plot, or the individual observation.

<figure class="image">
  <img class="screenshot" src="_static/images/settings/location/settings_location_collection_level.png" width="325px"> 
  <figcaption class="screenshot-caption"><i>Location collect options</i></figcaption> 
</figure>

Geonav
------

#### <img class="icon" src="_static/icons/settings/location/map-search.png"> Enable Geonav

Enables the device to move between entires based on GPS data. Requires entries to have GNSS data.

#### <img class="icon" src="_static/icons/settings/location/function-variant.png"> Search Method

The method used to match GPS location to entry. Defaults to the distance method.

<figure class="image">
  <img class="screenshot" src="_static/images/settings/location/settings_location_search_method.png" width="325px"> 
  <figcaption class="screenshot-caption"><i>GeoNav search method options</i></figcaption> 
</figure>

#### <img class="icon" src="_static/icons/settings/location/signal-distance-variant.png"> Proximity Check

Set the distance in km from known plots at which GeoNav should turn off.

#### <img class="icon" src="_static/icons/settings/location/note-off-outline.png"> GeoNav Log

Turns on GeoNav logging to a logfile stored in `/storage/geonav/log.txt`

#### <img class="icon" src="_static/icons/settings/location/timer-sand-empty.png"> Update Interval(s)

Changes the time between GeoNav location updates. Can be set to 1s (default), 5s, or 10s

<figure class="image">
  <img class="screenshot" src="_static/images/settings/location/settings_location_update_interval.png" width="325px"> 
  <figcaption class="screenshot-caption"><i>GeoNav interval options</i></figcaption> 
</figure>
