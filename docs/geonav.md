<link rel="stylesheet" type="text/css" href="_styles/styles.css">

# GeoNav

## Overview

GeoNav is used to automatically navigate between entries in the field based on the location of a high precision GNSS device.
This feature requires field entries to have high-precision location data collected via the <img class="icon" src="_static/icons/formats/satellite-variant.png"> [GNSS Trait](trait-gnss.md) or included in the field import file.
Imported coordinates must be in `Lat;Long` format in a single `geo_coordinates` column.
Refer to the `rtk_sample.csv` file in the `field_import` folder as an example.

To use GeoNav, navigate to the <img class="icon" src="_static/icons/settings/main/map-search.png"> [Geonav Settings](settings-geonav.md) and enable GeoNav.
Turn on Bluetooth, and pair your external reciever.
Navigate to the Collect screen and look for a confirmation message that says **Rover communications estabished**

<figure class="image">
  <img class="screenshot" src="_static/images/geonav/connect_cropped.png" width="325px"> 
  <figcaption class="screenshot-caption"><i>The GeoNav confirmation message</i></figcaption> 
</figure>

Once the rover is connected, Field Book will automatically display the nearest plot in the bottom toolbar.
Press the <img class="icon" src="_static/icons/collect/send-outline.png"> icon on the right to navigate to the plot.

<figure class="image">
  <img class="screenshot" src="_static/images/geonav/goto_cropped.png" width="325px"> 
  <figcaption class="screenshot-caption"><i>The bottom toolbar showing the nearest plot for manual geonavigation</i></figcaption> 
</figure>

To enable automatic geonavigation, press the <img class="icon" src="_static/icons/collect/compass-off-outline.png"> icon that appears on the right in the top toolbar.
It will change to a <img class="icon" src="_static/icons/fields/compass-outline.png"> icon indicating that automatic geonavigation is enabled.
Field Book will automatically switch to the nearest entry as the device moves around the field, displaying the following message on each switch.

<figure class="image">
  <img class="screenshot" src="_static/images/geonav/navigated_cropped.png" width="325px"> 
  <figcaption class="screenshot-caption"><i>The automatic geonavigation notification</i></figcaption> 
</figure>

## Example

<figure class="image">
  <img class="screenshot" src="_static/gifs/GeoNavDemo.gif" width="1100px"> 
  <figcaption class="screenshot-caption"><i>GeoNav automatic navigation demonstration</i></figcaption> 
</figure>

## Recommendations

This section provides the original hardware recommendations from when the Geonav feature was first developed in conjunction with the Breeding Insight OnRamp project.
It also includes instructions for deploying the suggested devices to use the GeoNav feature in the field.

While not covered in the original recommendations, Emlid's new [Reach RX](https://emlid.com/reachrx/) device is also suitable for GeoNav, and comes with a simplified setup process.
Devices from other manufacturers should also work with the GeoNav feature, as long as they broadcast using the NMEA protocol.

#### Supplies

-   Survey tripod
-   Survey post (optional depending on rover case)
-   Tablet
-   RTK Hardware (Base):
    -   [Emlid RS2](https://emlid.com/reachrs2plus/)
-   RTK Hardware (Rover)
    -   [Emlid RS2](https://emlid.com/reachrs2plus/) OR
    -   [Emlid M2](https://emlid.com/reach/) + Antenna + cable + LoRa
        radio + microUSB cable + battery

#### Instructions (field use)

1. Turn on BASE and ROVER, wait for both to broadcast WIFI hotspots
2. In TABLET settings, join ROVER WIFI.
3. In Reach3 app, navigate to ROVER WIFI settings. Connect ROVER to BASE WIFI.
4. Go back to TABLET settings, now connect TABLET to BASE WIFI
5. In Reach3 app, connect to BASE. Navigate to Base Settings. Wait until the BASE collects enough data to report a "single" position in the left hand corner and click apply.
6. In Reach3 app, connect to ROVER. Navigate to BT settings and turn on ROVER BT. Turn off and on again if you've forgotten the BT password (currently it is 1111).
7. Go back to TABLET BT settings. Turn on TABLET BT. Select ROVER from list of available devices and input password when prompted.
8. Finally, navigate to FIELDBOOK. Start collecting data. When prompted for GNSS trait, select ROVER.

Emlid's own documentation for the RS2 and M2 can be found here [(RS2 docs)](https://docs.emlid.com/reachrs2/) and here [(M2 docs)](https://docs.emlid.com/reach/)

#### Kits and Cases

Complete kits and matching 3D Cases for M2 hardware are available for purchase online:

- <https://e38surveysolutions.com/products/reach-m2-with-gnss-antenna>
- <https://cults3d.com/en/3d-model/tool/emlid-reach-m2-case-estuche-gnss-gps-rtk>