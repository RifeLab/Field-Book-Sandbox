![print](/_static/icons/formats/printer.png){width="20px"} Zebra Label Print Trait
==================================================================================

Overview
--------

The Zebra Label print trait format is used to print labels from an
external printer. The trait is designed to work with Zebra\'s [ZQ500
Series](https://www.zebra.com/us/en/products/printers/mobile/zq500.html)
of ruggedized, mobile printers. It is created with a trait name and
optional details.

To use this trait, the Zebra printer must first be paired via Bluetooth.
Label size, barcode, specific data, and number of copies are selected
and are saved as defaults. Pressing the print button will print the
desired number of labels, each containing a barcode and ID for the
specific entry, along with any additional selected data.

Creation
--------

![](/_static/images/traits/formats/create_zebra_label_print.png){.align-center
width="40.0%"}

Collect layout
--------------

![](/_static/images/traits/formats/collect_label_print_framed.png){.align-center
width="40.0%"}

Troubleshooting
---------------

Issues with label printing are often caused by incompatible Zebra mobile
printer configurations. To troubleshoot, install the \[Zebra Printer
Setup
Utility\](<https://play.google.com/store/apps/details?id=com.zebra.printersetup>)
and try the following steps:

1.  Download the latest firmware for the mobile printer model from the
    \[Zebra support
    page\](<https://www.zebra.com/us/en/support-downloads/printers.html>),
    unzip it, and send the unzipped [.zpl]{.title-ref} file to the
    printer using the _*Available Files*_ option in the Zebra Printer
    Setup Utility.
2.  With the firmware updated, ensure the media type settings in __Media
    Settings__ is correct for the type of label being used (usually
    [MARK]{.title-ref}).

If the above steps don\'t fix the problem, printing a configuration
label using _*Printer Actions*_ in the Zebra Printer Setup Utility can
help with further troubleshooting.
