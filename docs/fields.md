Fields
======

Overview
--------

Experiments are represented in Field Book as _fields_. Fields are either
imported from a file, from a BrAPI-enabled database, or created from
scratch.

Each field has a unique name, an import date, and a set of _entries_
which represent the experimental units on which data will be collected
(e.g., plots, plants). Once data is collected and exported for a given
field it will display the dates of last edit and export.

![A sample field with a name, import/edit/export dates, and number of
entries](/_static/images/fields/fields_list_item.png){.align-center
width="60.0%"}

When importing from a file, each row in the file reprents an _entry_.
Each _entry_ within a field must have the following:

> -   A _*unique identifier*_, which is used internally by Field Book to
>     associate data with the specific entry. It must be unique across
>     all of your fields.
> -   A _*primary identifier**, and a **secondary identifier*_. These
>     set the order of advancement through the field\'s entries, and can
>     be whatever makes the most sense for your experiment. Most often
>     they are numbers from the experimental design (e.g., row/plot,
>     row/column, range/plot).

![A sample field import
file](/_static/images/fields/fields_import_format.png){.align-center
width="90.0%"}

Additional information such as variety name, pedigree, or treatments is
optional, but can be included and viewed in the InfoBars or in the
summary dialog on the collect screen.

![The Fields screen layout with sample fields
loaded.](/_static/images/fields/fields_framed.png){.align-center
width="40.0%"}

Field Book includes a set of sample field files. Samples
_field\_sample.csv*, *field\_sample2.csv*, and *field\_sample3.csv_
represent typical wheat breeding fields, while _rtk\_sample.csv_
demonstrates the import format for entry location data (an additional
_*geo\_coordinates*_ column). Imported entry coordinates can then be
used with the
![geonav](/_static/icons/settings/main/map-search.png){width="20px"}
`geonav`{.interpreted-text role="doc"} feature.

Importing a new field
---------------------

To import a new field into Field Book press the
![add](/_static/icons/fields/plus-circle.png){width="20px"} icon in the
upper right-hand corner of the toolbar in the Fields section. Then, in
the resulting dialog, select whether to import from a local file, from
cloud storage (Dropbox, Google Drive, etc.), or via a
![brapi](/_static/icons/settings/main/server-network.png){width="20px"}
`brapi`{.interpreted-text role="doc"} connection.

A default import source can be set in
![settings](/_static/icons/settings/main/cog-outline.png){width="20px"}
`settings-general`{.interpreted-text role="doc"} to skip this dialog.

![Field import
process.](/_static/images/fields/fields_import_joined.png){.align-center
width="100.0%"}

Selecting local will display a list of files in the `field_import`
directory. Only CSV, XLS, or XLSX files will appear in the import
dialog. Filenames and column headers should exclude the following
special characters:

![Characters that are not allowed in file and column
names](/_static/images/fields/fields_illegal_characters.png){.align-center
width="40.0%"}

Files can be added to the import folder by downloading or transferring
from a computer, as described in `storage`{.interpreted-text
role="doc"}.

Once a file has been selected, the dropdown menus the dropdown menus
allow selection of the column names that correspond to Field Book\'s
required columns. Pressing IMPORT will finish importing the field.

### Cloud storage

If you choose to import from cloud storage, Field Book will open the
device file manager allowing navigation to the the file for import.

![Navigating to a google drive file for cloud
import](/_static/images/fields/fields_cloud_import.png){.align-center
width="40.0%"}

Creating a field
----------------

![Field creation
process](/_static/images/fields/fields_create_joined.png){.align-center
width="100.0%"}

To create a new field directly within Field Book press the
![create](/_static/icons/fields/table-large-plus.png){width="20px"} icon
on the toolbar. Set your field name and dimensions, choose which corner
of the field will contain the first plot, and select zigzag or
serpentine plot numbering. Unique IDs will be generated automatically.

Managing fields
---------------

To activate a field for data collection, select it from the list of
fields.

Each row in the fields list displays the Date imported, Date edited,
Date exported, and Number of entries.

![Field management sorting
steps](/_static/images/fields/fields_sorting_example_joined.png){.align-center
width="100.0%"}

Pressing the
![menu](/_static/icons/traits/dots-vertical.png){width="20px"} icon to
the right of the trial info opens a list of options:

> -   _*Sort*_ provides a dialog to update the plot ordering. Populate
>     the sort menu by pressing the
>     ![plus](/_static/icons/fields/plus.png){width="20px"} icon, and
>     selecting from the list of imported columns. Once columns have
>     been added, change their relative priority by using the
>     ![reorder](/_static/icons/traits/reorder-horizontal.png){width="20px"}
>     icon to drag and reorder them. Press the
>     ![sort](/_static/icons/fields/sort-ascending.png){width="20px"}
>     icon to toggle the sort between ascending and descending. Press
>     the
>     ![delete](/_static/icons/settings/sounds/delete.png){width="20px"}
>     icon to remove a column.
> -   _*Sync*_ connects to the server specified in
>     ![brapi](/_static/icons/settings/main/server-network.png){width="20px"}
>     `settings-brapi`{.interpreted-text role="doc"}, updating the trial
>     with new data that has been added from other sources since the
>     last sync or import. This option will not work for trials imported
>     from a file.
> -   _*Delete*_ removes the trial and all associated data. A
>     confirmation message will be shown first, to confirm that deletion
>     is not triggered accidentally.
