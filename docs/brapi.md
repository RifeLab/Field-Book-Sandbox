BrAPI (Breeding API)
====================

Overview
--------

BrAPI is an application programming interface for plant breeding. It
allows Field Book to directly communicate with compatible databases to
import fields and traits and export collected data. This eliminates the
need to manually transfer files and enables Field Book to offer more
sophisticated features including field and trait metadata and data
syncing.

Setup
-----

BrAPI can be set up in the
![brapi](/_static/icons/settings/main/server-network.png){width="20px"}
`settings-brapi`{.interpreted-text role="doc"}. To use BrAPI, set the
base URL to the URL of a valid BrAPI server and authorize it. Once
authorized, Field Book will be able to communicate with the server to
import fields and traits and export data.

![Example BrAPI URL
authorization.](/_static/images/brapi/brapi_url_joined.png){.align-center
width="60.0%"}

Import fields
-------------

![The BrAPI field import
process.](/_static/images/brapi/brapi_field_import_joined.png){.align-center
width="100.0%"}

To import a field using BrAPI, press
![add](/_static/icons/fields/plus-circle.png){width="20px"} in the top
toolbar, select BrAPI as the source, and press the \'Load Fields\'
button

Field Book will import a list of possible fields (known as
[studies]{.title-ref} in the BrAPI standard) from the BrAPI Base URL set
in the
![brapi](/_static/icons/settings/main/server-network.png){width="20px"}
`settings-brapi`{.interpreted-text role="doc"}.

Available fields can be filtered by program and trial using the menu
options in the top toolbar. The list can be filtered by
`Observation Level` using the dropdown below the server URL.

If the returned list of fields contains more than a single page, the
\'Next\' button will advance to the next page. Once a field has been
selected, the field structure can be previewed by pressing the \'Preview
Field\' button

Previewed fields are imported by pressing the \'Save\' button. __Only
fields that have been imported via BrAPI can be exported to BrAPI
servers.__

Import traits
-------------

Depending on the BrAPI server, fields may have linked traits that are
imported with the field. Additional traits can be imported via BrAPI by
selecting import from the Traits menu, then selecting BrAPI.

![The BrAPI trait import
process.](/_static/images/brapi/brapi_trait_import_joined.png){.align-center
width="80.0%"}

Field Book will import a list of possible traits (known as
[observationVariables]{.title-ref} in the BrAPI standard) from the BrAPI
Base URL set in the
![brapi](/_static/icons/settings/main/server-network.png){width="20px"}
`settings-brapi`{.interpreted-text role="doc"}.

Traits are selected and then imported by pressing the _*Save Traits*_
button. Traits can be imported individually or in groups.

Field Book will report _Selected traits saved successfully_, and return
to the traits screen with the imported traits selected.

Export data
-----------

Once data has been collected it can be exported via BrAPI by pressing
Export and selecting BrAPI from the Export Data options.

Before the export is finalized, Field Book will display a summary of
BrAPI Export statistics. These include a breakdown of the number of new
vs synced(imported) vs edited observations, as well as skipped
observations. The same statistics are displayed for images.

![The BrAPI data export
process.](/_static/images/brapi/brapi_export_process_joined.png){.align-center
width="80.0%"}

Pressing the \'Export\' uploads the observations to the external BrAPI
database.
