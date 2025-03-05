<link rel="stylesheet" type="text/css" href="_styles/styles.css">

# <img class="icon-title" src="_static/icons/formats/camera.png"> Photo Trait

## Overview

The photo trait formats are used to capture images. The creation process starts by picking a device-specific format.
The simplest option is to use the system camera, but external devices (<img class="icon" src="_static/icons/formats/camera-gopro.png"> GoPro, <img class="icon" src="_static/icons/formats/webcam.png"> USB, or <img class="icon" src="_static/icons/formats/shutter.png"> Canon) are also supported.

## Creation

<figure class="image">
  <img class="screenshot" src="_static/images/traits/formats/create_photo_joined.png" width="700px"> 
  <figcaption class="screenshot-caption"><i>Photo trait creation (system camera)</i></figcaption> 
</figure>

On the collect page, pressing the <img class="icon" src="_static/icons/formats/shutter.png"> icon captures an image from the camera.
Pressing the <img class="icon" src="_static/icons/formats/cog.png"> icon opens a settings dialog, where the resolution, preview, and capture options can be adjusted.
Multiple photos can be captured for each entry. 

## Collect layout

<figure class="image">
  <img class="screenshot" src="_static/images/traits/formats/collect_photo_joined.png" width="700px"> 
  <figcaption class="screenshot-caption"><i>Photo trait collection interface and settings (system camera)</i></figcaption> 
</figure>

Captured photos are stored in `.jpg` format, and named by using underscores to join the entry's unique_id, the trait name, the photo number, and a timestamp.
The resulting files are stored in a picture folder within a field-specific subfolder of `plot_data`.
An example photo filepath would be `plot_data/FIELD_NAME/picture/PHOTO_FILE_NAME.jpg`.

## External devices

The photo trait formats for capturing images from external devices work the same way as with the system camera, the only difference is the initial setup to connect to the device.
Connect by pressing the <img class="icon" src="_static/icons/formats/connection.png"> icon when you first access the trait on the collect screen

<figure class="image">
  <img class="screenshot" src="_static/images/traits/formats/collect_gopro_framed.png" width="350px"> 
  <figcaption class="screenshot-caption"><i>Photo trait collection interface (GoPro)</i></figcaption> 
</figure>