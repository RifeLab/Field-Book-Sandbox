<link rel="stylesheet" type="text/css" href="_styles/styles.css">

# <img class="icon-title" src="_static/icons/formats/printer.png"> Zebra Label Print Trait

## Overview

The Zebra Label Print trait format is used to print labels from an external printer.
The trait is designed to work with Zebra's [ZQ500 Series](https://www.zebra.com/us/en/products/printers/mobile/zq500.html) of mobile printers.
It is created with a trait `name` and optional `details`.
Details text is displayed under the trait name on the Collect screen.

To use this trait, the Zebra printer must first be paired via Bluetooth.
Label size, barcode, data, and number of copies are selected and saved as defaults.
Pressing the print button will print the desired number of labels, each containing a barcode and ID for the specific entry along with any additional selected data.

<figure class="image">
  <img class="screenshot" src="_static/images/traits/formats/zebra_format_joined.png" width="700px"> 
  <figcaption class="screenshot-caption"><i>Zebra Label Print trait creation dialog and collect format</i></figcaption> 
</figure>

## Troubleshooting

Issues with label printing are often caused by incompatible Zebra mobile printer configurations.
To troubleshoot, install the [Zebra Printer Setup Utility](<https://play.google.com/store/apps/details?id=com.zebra.printersetup>) and try the following steps:

1. Download the latest firmware for the mobile printer model from the [Zebra support page](<https://www.zebra.com/us/en/support-downloads/printers.html>), unzip it, and send the unzipped `.zpl` file to the printer using the `Available Files` option in the Zebra Printer Setup Utility.
2. With the firmware updated, ensure the media type settings in **Media Settings** is correct for the type of label being used (usually **MARK**).

If the above steps don't fix the problem, printing a configuration label using `Printer Actions` in the Zebra Printer Setup Utility can help with further troubleshooting.