![gnss](/_static/icons/formats/satellite-variant.png){width="20px"} GNSS Trait
==============================================================================

Overview
--------

The GNSS trait format is used to acquire high-accuracy GPS coordinates
from an external, Bluetooth-connected device. While other traits only
capture phenotypic or observational data, the GNSS trait is intended to
be used to capture metadata about the plot itself. This metadata can be
used in conjunction with the
![geonav](/_static/icons/settings/main/map-search.png){width="20px"}
`geonav`{.interpreted-text role="doc"} feature to automatically navigate
through the field.

Creation
--------

![](/_static/images/traits/formats/create_gnss.png){.align-center
width="40.0%"}

Collect layout
--------------

![](/_static/images/traits/formats/collect_gnss_framed.png){.align-center
width="40.0%"}

Details
-------

When first navigating to a GNSS trait, the collect screen will show a
![gnss](/_static/icons/formats/satellite-variant.png){width="20px"}
button that will show a list of devices that can be accessed to provide
a location for this trait.

![GNSS device
select](/_static/images/traits/formats/collect_gnss_select_device.png){.align-center
width="60.0%"}

Once a device is selected the screen will populate with a series of
values from the GNSS reciever output including high-accuracy latitude
and longitude coordinates, current Coordinated Universal Time (UCT), the
Horizontal Dilution of Precision (HDOP, a measure of the suitability of
satellite positioning in the sky, ideally 1 or below), the number of
available satellites, the altitude, and accuracy.

![GNSS reciever
output](/_static/images/traits/formats/collect_gnss_reciever_output.png){.align-center
width="60.0%"}

Pressing
![capture](/_static/icons/formats/crosshairs-gps.png){width="20px"} will
record an instantaneous GPS reading. Toggling the average option will
record an average of incoming location data for 5s, 10s, or manually
(whereby all manually collected location points are averaged to create a
representative value).

![GNSS average
options](/_static/images/traits/formats/collect_gnss_average_options.png){.align-center
width="60.0%"}

When recording data for an entry with existing coordinates, a warning
message will be displayed to confirm that the existing coordinates will
be updated.

![GNSS update
warning](/_static/images/traits/formats/collect_gnss_update_warning.png){.align-center
width="60.0%"}

If errors occur while collecting gnss data (e.g., socket cannot be
established), users may have to manually disconnect/reconnect to the
external device.
