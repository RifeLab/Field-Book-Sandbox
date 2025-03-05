<link rel="stylesheet" type="text/css" href="_styles/styles.css">

<img class="icon-title" src="_static/icons/formats/webcam.png"> USB Camera Trait
===========================================================================

Overview
--------

The USB camera trait format is used to capture images with an external camera.
It is created with a trait name and optional details.

On the collect screen, once a camera is connected via USB, it can be opened using <img class="icon" src="_static/icons/formats/connection.png">.
Once connected, press the <img class="icon" src="_static/icons/formats/webcam.png"> icon to access it and capture images.
Multiple photos can be captured for each entry.

Captured photos are stored in `.jpg` format, and named by using underscores to join the entry's unique_id, the trait name, the photo number, and a timestamp.
The resulting files are stored in a usb-camera folder within a field-specific subfolder of `plot_data`.
An example photo filepath would be `plot_data/FIELD_NAME/usb-camera/PHOTO_FILE_NAME.jpg`.

Creation
--------

<figure class="image">
  <img class="screenshot" src="_static/images/traits/formats/create_usb_camera.png" width="350px"> 
  <figcaption class="screenshot-caption"><i>USB Camera trait creation dialog</i></figcaption> 
</figure>

Collect layout
--------------

<figure class="image">
  <img class="screenshot" src="_static/images/traits/formats/collect_usb_camera_framed.png" width="350px"> 
  <figcaption class="screenshot-caption"><i>USB Camera trait collection interface</i></figcaption> 
</figure>