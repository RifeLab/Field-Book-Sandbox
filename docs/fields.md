<link rel="stylesheet" type="text/css" href="_styles/styles.css">

# Fields

## Overview

Experiments in Field Book are called `fields`.
Fields can be imported from a file, downloaded from a BrAPI-enabled database, or created from scratch.

<figure class="image">
  <img class="screenshot" src="_static/images/fields/fields_framed.png" width="350px"> 
  <figcaption class="screenshot-caption"><i>The Fields screen layout with sample fields loaded</i></figcaption> 
</figure>

Each field is displayed in the list with an icon that matches its import source, its name, and the number of `entries` (experimental units) on which data will be collected (e.g., plots, plants).
Pressing the left icon marks the field as the active field.
Any other part of the field list item can be pressed to open the field details view.

<figure class="image">
  <img class="screenshot" src="_static/images/fields/fields_list_item.png" width="325px"> 
  <figcaption class="screenshot-caption"><i>A sample field with a name, number of entries, and csv import icon</i></figcaption> 
</figure>

When importing a file, each row of the file reprents an `entry`.

Each entry within a field must have the following:

 - A `unique identifier` is used to associate data with the specific entry.
It must be unique across all of your fields.
The sample field import file shown below contains a unique identifier called **plot_id** (highlighted in red).
 - A `primary identifier`, and a `secondary identifier`.
These columns will remain visible while advancing through the field's entries, and can be whatever makes the most sense for your experiment.
Common choices are row/plot, range/plot, rep/plot, etc.
The sample field import file contains primary and secondary unique identifiers called **row** and **plot** (highlighted in blue).

Additional information such as variety name, pedigree, or treatments is optional, but can be included and viewed in the InfoBars or in the Summary dialog on the Collect screen.

<figure class="image">
  <img class="screenshot" src="_static/images/fields/fields_import_format.png" width="900px"> 
  <figcaption class="screenshot-caption"><i>A sample field import file</i></figcaption> 
</figure>

<figure class="image">
  <img class="screenshot" src="_static/images/fields/fields_framed.png" width="350px"> 
  <figcaption class="screenshot-caption"><i>The Fields screen layout with sample fields loaded</i></figcaption> 
</figure>

Field Book includes a set of sample field files.
Samples `field_sample.csv`, `field_sample2.csv`, and `field_sample3.csv` represent typical wheat breeding fields.
Sample `rtk_sample.csv` demonstrates the import format for entry location data (an additional `geo_coordinates` column).
Imported entry coordinates can then be used with the <img class="icon" src="_static/icons/settings/main/map-search.png"> [Geonav](geonav.md) feature.

## Adding a field

New fields can be added by pressing the <img class="icon" src="_static/icons/fields/plus-circle.png"> button in the bottom right corner of the Fields screen.
This opens a dialog where you can select whether to import from a local file, from cloud storage (Dropbox, Google Drive, etc.), create a new field from scratch, or import via a <img class="icon" src="_static/icons/settings/main/server-network.png"> [Brapi](brapi.md) connection (if enabled).

A default import source can be set in <img class="icon" src="_static/icons/settings/main/cog-outline.png"> [System Settings](settings-system.md) to skip this dialog.
Long-pressing the <img class="icon" src="_static/icons/fields/plus-circle.png"> button will override the default choice.

<figure class="image">
  <img class="screenshot" src="_static/images/fields/fields_import_joined.png" width="1100px"> 
  <figcaption class="screenshot-caption"><i>The Field import process from local storage</i></figcaption>
</figure>

#### Local storage

Selecting local will display a list of files in the `field_import` folder.
Files can be added to the import folder by downloading or [transferring from a computer](storage.md#file-transfer).
Only `.csv`, `.xls`, or `.xlsx` files will appear in the import dialog.

!> Filenames and column headers must exclude the special characters: `/ ? < > * | "`

Once a file has been selected, the dropdown menus are used to select columns that correspond to Field Book's required columns.
Pressing **Import** will complete the import process.

#### Cloud storage

If you choose to import from cloud storage, Field Book will open the device file manager.
Using the file manager you can select a file anywhere on the device, including from cloud utilities like Google Drive.
The <img class="icon" src="_static/icons/fields/menu.png"> menu icon in the upper left of the file manager will display the installed cloud applications that can be used to load files.

<figure class="image">
  <img class="screenshot" src="_static/images/fields/cloud_import_joined.png" width="700px"> 
  <figcaption class="screenshot-caption"><i>Cloud import file manager view</i></figcaption> 
</figure>

#### Create New

Creating a new field directly in Field Book requires a field name, dimensions, starting corner for entry ordering, and whether entries should progress in a zigzag or serpentine order.
Universal unique IDs will be generated for all entries.
Confirm the planned settings are as expected, then press OK.

<figure class="image">
  <img class="screenshot" src="_static/images/fields/fields_create_joined.png" width="1100px"> 
  <figcaption class="screenshot-caption"><i>The field creation process</i></figcaption> 
</figure>

#### Breeding API (BrAPI)

To import a field using BrAPI, ensure make sure BrAPI is enabled and configured in the <img class="icon" src="_static/icons/settings/main/server-network.png"> [Brapi settings](settings-brapi.md)

Once you have authenticated with a compatible database, the BrAPI server will be displayed as an option for field import.
The [BrAPI](brapi.md) section of the documentation has more details about the field and trait import process.

!> Any field can be exported locally, but only fields and traits that have been imported via BrAPI are able to export data via BrAPI.

## Managing fields

To set or switch your active field, press the import source icon on the left side of the field item.

If your fields have location data, pressing the <img class="icon" src="_static/icons/fields/compass-outline.png"> icon in the top toolbar will set the nearest active field.

Pressing the <img class="icon" src="_static/icons/fields/sort.png"> icon in the top toolbar will display a dialog with different attributes that can be selected to sort the list of fields.

<figure class="image">
  <img class="screenshot" src="_static/images/fields/fields_sort_framed.png" width="350px"> 
  <figcaption class="screenshot-caption"><i>Field list sort options</i></figcaption> 
</figure>

For batch operations, long pressing one or more field items opens an action menu on the top toolbar.
Use the action menu icons to <img class="icon" src="_static/icons/fields/check-all.png"> select all, <img class="icon" src="_static/icons/fields/file-export-outline.png"> export all, or <img class="icon" src="_static/icons/fields/delete.png"> delete all selected fields.
A confirmation dialog message will be displayed prior to field deletion.

<figure class="image">
  <img class="screenshot" src="_static/images/fields/fields_delete_framed.png" width="350px"> 
  <figcaption class="screenshot-caption"><i>Delete fields confirmation</i></figcaption> 
</figure>

## Field details

Pressing a field item in the fields list opens a Field Detail screen.
The **<img class="icon" src="_static/icons/fields/delete.png">** in the toolbar can be used to delete the field.
A confirmation dialog message will be displayed prior to field deletion.

<figure class="image">
  <img class="screenshot" src="_static/images/fields/field_detail_framed.png" width="350px"> 
  <figcaption class="screenshot-caption"><i>Field detail view</i></figcaption> 
</figure>

The top card includes metadata about the field (import source, entry count, attribute count).
**Renaming** fields will change the name displayed for the field throughout the app. **Sorting** displays a dialog to modify the entry order.

The sort dialog is populated by pressing the <img class="icon" src="_static/icons/fields/plus.png"> icon, and selecting from the list of available columns.
Column priority for sorting can be modified by using using the <img class="icon" src="_static/icons/traits/reorder-horizontal.png"> icon to drag and reorder them.
The <img class="icon" src="_static/icons/fields/sort.png"> icon will toggle the sort between ascending and descending.
The <img class="icon" src="_static/icons/settings/sounds/delete.png"> icon will remove columns that have been added.

The <img class="icon" src="_static/icons/home/barley.png"> [Collect](collect.md) card will navigate to the Collect screen where data can be collected.

The <img class="icon" src="_static/icons/home/save.png"> [Export](export.md) card will export data that has been collected.

The Data card summarizes data that has been collected for the field.
For each trait with data, the number of observations and percent of entries with phenotypes is displayed in sub-cards.
Expanding each sub-card will show a chart with a distribution of the phenotypes.