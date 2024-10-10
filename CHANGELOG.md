<<<<<<< Updated upstream
Here is an old changelog line
## 2024-10-09
still debugging extraction
=======
# Changelog

All notable changes to Field Book app will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.1.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

## [Unreleased]

## [5.6] - 2023-12-08

### Added
- Updated trait creator
- Updated Photo trait for devices without camera app (Boox Palma)
- New Search layout
- Long press on observations to see metadata

### Changed
- Beta settings renamed to Experimental

### Fixed
- Numerous bug fixes

## [5.5.24] - 2023-11-01

### Added
- Progress bar in Collect screen
- Person now required by default
- Coordinate format modified to match ISO (longitude; latitude)
- GeoNav logging updates and bugfixes
- Capture field level audio (beta)
- Field name visible in InfoBars

### Changed
- Merged duplicate settings

### Fixed
- Numerous bug fixes

## [5.5] - 2023-09-13

### Added
- New GoPro Trait (Hero 11)
- New InfoBar prefix selector
- Search selections persist
- Updates available from About
- Added Vietnamese and Swedish translations
- Added option to return to first trait on entry navigation
- Volume buttons can be remapped to move to next trait or plot

### Changed
- Merged barcode and text unique ID search setting
- Numerous GeoNav improvements
- Merged duplicate settings

### Fixed
- Numerous bug fixes

## [v5.4] - 2023-06-01

### Added
- Experimental settings section
- Themes!
- Repeated measures! (beta)
- Summary view is now customizable and navigable
- Improved field sorting workflow
- Import brapi studies at multiple observation levels

### Changed
- Optimized trait import workflow
- Improved trait reordering
- Improved external barcode scanning

### Fixed
- Fixed issue with trait cloud imports
- Fixed issue with lock state not saving
- Fixed issue with exporting data via BrAPI
- Fixed issue with NA in categorical traits
- Fixed issue with field sorting

## [v5.3] - 2022-09-01

### Added
- New USB camera trait!
- Expanded options available for next entry with no data setting
- Added text-to-speech options for inputing data
- Updated how location is collected on a per phenotype basis
- Added option to provide anonymous identifier in profile
- Locking now has three input states: all data, new data, no data
- Updated GeoNav notification layout
- Updated language selection options
- Updated categorical/multicat trait creator
- Scanning barcodes searches across loaded fields for matches
- Improved location and GNSS trait collection

## [v5.2.5] - 2022-08-03

### Fixed
- Fixed an issue with cloud imports

## [v5.2] - 2022-07-11

### Added
- Datagrid focuses on current entry/trait
- Database export now exports to single zipped file
- Resuming collection now navigates to the last selected trait
- Option to average points over time in GNSS trait
- Support for XLSX files
- New sound for missing barcodes when navigating
- InfoBars adjust based on prefix size
- Export option to export ZIP bundle containing export data and collected media
- Expanded options available for next entry with no data setting

### Changed
- Exporting multiple files at once will export a ZIP bundle
- Improved import file sanitation
- Added warnings for failed file imports

### Fixed
- Quick GoTo can now use both primary/secondary ID
- Fixed a bug caused by duplicated import column names
- Fixed an issue with NA date color
- Numerous bug fixes

## [v5.1] - 2021-10-18

### Added
- Field Book GeoNav!
- Identify and load nearest field
- Identify and navigate to closest plot
- New setting to adjust polling rate, angle, and GNSS device
- Use internal GPS with GNSS trait
- Fields can be sorted to allow for different collection orders
- Observation level can now be selected for BrAPI imported fields
- Primary/Secondary ID can now be selected for BrAPI imported fields
- Use Label or Value for BrAPI categorical traits
- Skip entries setting can be across single or all traits

### Changed
- Improved calendar picker behavior
- Increased required minimum Android version to 5.1
- Primary/Secondary Order are now referred to internally as Primary/Secondary ID
- GNSS trait layout updates

### Fixed
- Fixed 'Move to unique identifier' setting
- Fixed bugs with Audio and Counter traits
- Numerous bug fixes

## [v5.0.7] - 2021-09-27

### Added
- Date trait has calendar picker

### Fixed
- Improvements to Label Print Trait
- File management and import fixes
- BrAPI pagination fixes

## [v5.0.6] - 2021-09-21

### Fixed
- Fixed an issue with import file headers

## [v5.0.5] - 2021-09-20

### Fixed
- Fixed an issue with the fix for apostrophes in trait names

## [v5.0.4] - 2021-09-17

### Fixed
- Fixed an issue with apostrophes in trait names

## [v5.0.3] - 2021-09-06

### Added
- Table format can now export more than 64 traits

### Fixed
- Fixed a bug with commas in imported file headers

## [v5.0.2] - 2021-08-06

### Fixed
- Fixed several bugs with database export format
- Fixed several bugs with BrAPI field importing
- Updated GNSS trait icon

## [v5.0.1] - 2021-07-28

### Added
- Major database overhaul
- BrAPI v2 support
- New GNSS trait
- Updated Datagrid layout
- Design custom fields directly within Field Book
- Added setting to swap plot/trait arrows
- BrAPI page size setting
- Updated Boolean trait layout
- BrAPI server timeout setting
- Field Book requests person confirmation every 24hrs

### Changed
- Print a label adds an observation record

### Fixed
- Fixed issue with special characters in file headers
- Fixed issue with categorical trait layout
- Trait files can be imported via cloud

## [v4.5] - 2020-10-01

### Added
- Added setting to choose custom storage directory (Android 5.0+ only)
- Added sound setting for advancing plots
- Added sound setting for cycling traits
- Added theme setting to change saved data color
- Categorical trait layout now matches multicat allowing for unlimited categories
- Export options default to last configuration
- Profile moved completely to Settings
- Added community BrAPI servers and scan by barcode option

### Changed
- Moved several settings to different categories
- Changed how the disable entry arrows setting is assigned

### Fixed
- Fixed how Database settings work
- Fixed bug when saving person or location from Settings
- Fixed bug that hid files with uppercase extensions
- Fixed bug allowed users to view Collect screen without traits

## [v4.4.1] - 2020-09-04

### Fixed
- Fix for issue when taking photos

## [v4.4] - 2020-09-01

### Added
- Collect data using barcodes
- Filter BrAPI studies by program and trial
- BrAPI HTTP error handling improvements

### Fixed
- Fix for Zebra Label Print trait not functioning correctly
- Fix bug with searching that resulted in data not being saved
- Fix for issues when importing UTF-8-BOM files

## [v4.3.3] - 2020-06-22

### Fixed
- Fix for Galaxy S6 devices
- Timestamp fix that was causing data to not be stored

## [v4.3.1] - 2020-05-21

### Fixed
- Export dialog now displays correctly
- Fix for BrAPI export
- Timestamp bugfix

## [v4.3] - 2020-04-20

### Added
- Search widget in Settings
- Added link to translate app in About section
- Quick GoTo allows full keyboard input

### Changed
- Updated Japanese translation
- Substantial refactoring

### Fixed
- Multicat layout updates correctly when deleting values
- Fix for sample directories and sample files not being created
- Fix for database importing
- Fix for Quick GoTo secondary order
- Fixed tutorial order

## [v4.2.1] - 2020-03-10

### Changed
- Updated Chinese translation
- Updated Italian translation

### Fixed
- Fix for missing sample files and crash

## [v4.2] - 2020-03-06

### Added
- New tutorial
- Additional import sources
- Choose default import/export source
- Customize icons on collect screen
- Improved multicat layout
- Updated changelog
- Updated about dialog
- Added libraries used in app

### Changed
- Upgraded to Java 8

### Fixed
- Fix for return key setting

## [v4.1.4] - 2020-02-28

### Fixed
- Fix for data save delay

## [v4.1.3] - 2020-02-21

### Fixed
- Fix for local storage crash

## [v4.1.2] - 2020-02-20

### Added
- Advanced settings redone
- Improved workflow
- Firebase crashlytics
- BrAPI integration
- Permission management
- Label printer trait

### Fixed
- Lots of bug fixes

## [v4.0.3] - 2017-10-19

### Fixed
- Miscellaneous bugfixes

## [v4.0.1] - 2017-08-30

### Added
- Updated field management
- New main screen layout

### Fixed
- Lots of bug fixes

## [v3.3.1] - 2017-03-07

### Added
- Location trait
- Button for missing values
- Download files from Dropbox

### Changed
- Photo names include rep and trait name
- Updated trait layouts
- Changed numeric clear to backspace

### Fixed
- Miscellaneous fixes and performance enhancements

## [v3.3] - 2017-02-19

### Added
- Citation dialog
- Added a dialog when importing trait lists and current list hasn't been exported

### Changed
- Replaced lots of words with icons
- Changed 'Rust rating' trait to 'Disease rating'
- Changed disease rating buttons from R/MS/MR/S to R/M/S

### Fixed
- Fixed a bug where default trait value wasn't saved
- Fixed an issue where changing trait visibility wouldn't be saved
- Fixed an issue with spaces in column names and search

## [v3.2] - 2016-04-04

### Added
- Bengali translation

### Changed
- Updated dialog and button design
- Updated internal database

### Fixed
- Fixed several bugs causing crashes
- Fixed a bug with numeric traits
- Fixed bug with rearranging traits

## [v3.1.1] - 2015-12-12

### Fixed
- Fixed a bug with the new multicat trait
- Fixed the trait creation layout

## [v3.1] - 2015-12-08

### Added
- Multicategorical trait format
- Database automatically backed up to database folder
- Added option to overwrite preivously exported files

### Changed
- Field name is listed in the navigation drawer on the main screen
- Updated dialogs with titles
- Location exports as null if not set

### Fixed
- Fixed a bug related to audio and rust traits

## [v3.0] - 2015-09-14

### Added
- Updated user interface
- Support for small screens
- Reorder traits with drag and drop
- Added no date button

### Changed
- Renamed Setup to Profile

### Fixed
- Fixed a bug with the cursor in text traits

## [v2.4.1] - 2015-06-04

### Added
- Datagrid (beta)
- Move to entry via barcodes
- Plot scrolling speed accelerates the longer the arrow is pressed
- Option to disable left/right arrows if no data collected

### Changed
- Reorganized export layout
- Changed the default name for exported files
- Updated strings for clarity

### Fixed
- Bug fixes and improvements

## [v2.3.5] - 2015-05-28

### Added
- Rust Rating trait with customizable severity scale
- Counter trait
- Option to disable automatic file sharing
- Option to disable plot navigation if no data collected with sound notification
- Saves most recent plot

### Changed
- Updated tutorial
- Changed timestamp format

## [v2.3.4] - 2015-04-22

### Changed
- Long press InfoBar text for a toast containing the same text
- Quick GoTo is disabled by default (toggled in Settings)
- Only first photo name is exported in table mode
- Updated summary dialog
- Reworked location code
- Updated sample files

### Fixed
- Fixed a bug in Lollipop with MediaContentScanner
- Fixed some issues with search layout

## [v2.3.0] - 2015-02-28

### Added
- Updated Import field layout
- Photo trait
- InfoBars can be changed from main screen
- Import and export the internal database
- Toggle all trait visibility at once

### Changed
- Audio trait updates and fixes
- Table export speed drastically improved

## [v2.2] - 2014-09-10

### Added
- Option to make sound when primary organizer changes
- Option to go to specific unique ID
- Option to go to next plot without data
- File chooser added

### Changed
- Visibility of traits is now changed in the Traits screen instead of Setup
- XLS support readded
- Clear categorical traits by reclicking the current choice

### Fixed
- Traits can now be made in other languages

## [v2.1.2] - 2014-09-03

### Changed
- Renamed "Qualitative" trait format "Categorical"
- Removed support for Android 3.0
- Removed ActionBarSherlock library

### Fixed
- Fixed issue with field folders
- Fixed issue with field file selection

## [v2.1.0] - 2014-08-18

### Added
- Support for folders in the Fields dialog
- Amharic, Arabic, Brazilian Portuguese, Chinese, French, Hindi, Japanese, Oromo, and
            Russian translation
        

### Changed
- Changed tutorial setup
- Language dialog updated

### Fixed
- Minimum in numeric traits is enforced
- All text in text traits is deletable with the keyboard
- Cursor now appears at end of text in text traits
- Files now visible via computer after export

## [v2.0.1] - 2014-05-18

### Added
- Audio trait
- Import/Export trait lists
- Spanish and German translation

### Changed
- Initial release

[5.6]: https://github.com/PhenoApps/Field-Book/releases/tag/v5.6
[5.5.24]: https://github.com/PhenoApps/Field-Book/releases/tag/v5.5.24
[5.5]: https://github.com/PhenoApps/Field-Book/releases/tag/v5.5
[v5.4]: https://github.com/PhenoApps/Field-Book/releases/tag/v5.4
[v5.3]: https://github.com/PhenoApps/Field-Book/releases/tag/v5.3
[v5.2.5]: https://github.com/PhenoApps/Field-Book/releases/tag/v5.2.5
[v5.2]: https://github.com/PhenoApps/Field-Book/releases/tag/v5.2
[v5.1]: https://github.com/PhenoApps/Field-Book/releases/tag/v5.1
[v5.0.7]: https://github.com/PhenoApps/Field-Book/releases/tag/v5.0.7
[v5.0.6]: https://github.com/PhenoApps/Field-Book/releases/tag/v5.0.6
[v5.0.5]: https://github.com/PhenoApps/Field-Book/releases/tag/v5.0.5
[v5.0.4]: https://github.com/PhenoApps/Field-Book/releases/tag/v5.0.4
[v5.0.3]: https://github.com/PhenoApps/Field-Book/releases/tag/v5.0.3
[v5.0.2]: https://github.com/PhenoApps/Field-Book/releases/tag/v5.0.2
[v5.0.1]: https://github.com/PhenoApps/Field-Book/releases/tag/v5.0.1
[v4.5]: https://github.com/PhenoApps/Field-Book/releases/tag/v4.5
[v4.4.1]: https://github.com/PhenoApps/Field-Book/releases/tag/v4.4.1
[v4.4]: https://github.com/PhenoApps/Field-Book/releases/tag/v4.4
[v4.3.3]: https://github.com/PhenoApps/Field-Book/releases/tag/v4.3.3
[v4.3.1]: https://github.com/PhenoApps/Field-Book/releases/tag/v4.3.1
[v4.3]: https://github.com/PhenoApps/Field-Book/releases/tag/v4.3
[v4.2.1]: https://github.com/PhenoApps/Field-Book/releases/tag/v4.2.1
[v4.2]: https://github.com/PhenoApps/Field-Book/releases/tag/v4.2
[v4.1.4]: https://github.com/PhenoApps/Field-Book/releases/tag/v4.1.4
[v4.1.3]: https://github.com/PhenoApps/Field-Book/releases/tag/v4.1.3
[v4.1.2]: https://github.com/PhenoApps/Field-Book/releases/tag/v4.1.2
[v4.0.3]: https://github.com/PhenoApps/Field-Book/releases/tag/v4.0.3
[v4.0.1]: https://github.com/PhenoApps/Field-Book/releases/tag/v4.0.1
[v3.3.1]: https://github.com/PhenoApps/Field-Book/releases/tag/v3.3.1
[v3.3]: https://github.com/PhenoApps/Field-Book/releases/tag/v3.3
[v3.2]: https://github.com/PhenoApps/Field-Book/releases/tag/v3.2
[v3.1.1]: https://github.com/PhenoApps/Field-Book/releases/tag/v3.1.1
[v3.1]: https://github.com/PhenoApps/Field-Book/releases/tag/v3.1
[v3.0]: https://github.com/PhenoApps/Field-Book/releases/tag/v3.0
[v2.4.1]: https://github.com/PhenoApps/Field-Book/releases/tag/v2.4.1
[v2.3.5]: https://github.com/PhenoApps/Field-Book/releases/tag/v2.3.5
[v2.3.4]: https://github.com/PhenoApps/Field-Book/releases/tag/v2.3.4
[v2.3.0]: https://github.com/PhenoApps/Field-Book/releases/tag/v2.3.0
[v2.2]: https://github.com/PhenoApps/Field-Book/releases/tag/v2.2
[v2.1.2]: https://github.com/PhenoApps/Field-Book/releases/tag/v2.1.2
[v2.1.0]: https://github.com/PhenoApps/Field-Book/releases/tag/v2.1.0
[v2.0.1]: https://github.com/PhenoApps/Field-Book/releases/tag/v2.0.1
>>>>>>> Stashed changes
