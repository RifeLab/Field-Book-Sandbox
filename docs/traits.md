Traits
======

Overview
--------

Data is collected in Field Book by defining different traits. Each trait
layout is optimized for a specific type of data collection. The traits
screen allows new traits to be defined and existing traits to be
managed.

<figure align="center" class="image">
  <img src="/_static/images/traits/traits_framed.png" width="40%"> 
  <figcaption><i>The Traits screen layout with sample data
loaded</i></figcaption> 
</figure>

Creating a Trait
----------------

Traits can be created by pressing the large <img ref="add" style="vertical-align: middle;" src="/_static/icons/traits/plus-circle.png" width="20px"> icon at the
bottom right of the screen, or the same icon in the toolbar. For each
format, the creation screen adjusts to indicate which fields are
required. Trait names must be unique. Each trait is created by
specifying a trait `format`, a trait `name`, optional `details`, and
format-dependent fields such as `min`, `max`, and `default`.

<figure align="center" class="image">
  <img src="/_static/images/traits/traits_create_joined.png" width="80%"> 
  <figcaption><i>Trait creation for a <a href="#/trait-numeric">Numeric</a> trait, and other format options</i></figcaption> 
</figure>

Managing Traits
---------------

Once created, traits can be manipulated using the following features:

### Single trait changes

> -   Reorder an individual trait by pressing and dragging the
>     <img ref="reorder" style="vertical-align: middle;" src="/_static/icons/traits/reorder-horizontal.png" width="20px">
>     icon on the far left of its trait line.
> -   Copy, edit, or delete an individual trait by pressing the
>     <img ref="menu" style="vertical-align: middle;" src="/_static/icons/traits/dots-vertical.png" width="20px">
>     icon on its trait line, then selecting the desired operation from
>     a list.
> -   Hide or unhide an individual trait from the
>     <a href="collect.md"><img style="vertical-align: middle;" src="/_static/icons/home/barley.png" width="20px"></a> [Collect](collect.md) screen by
>     checking/unchecking the checkbox on each trait line.

<figure align="center" class="image">
  <img src="/_static/images/traits/single_trait_menu_framed.png" width="40%"> 
  <figcaption><i>Single trait management menu</i></figcaption> 
</figure>

### All trait changes

To make all traits active or hidden, press the
<img ref="check-all" style="vertical-align: middle;" src="/_static/icons/traits/check-all.png" width="20px"> icon in the toolbar.

Other changes affecting the whole trait list can be made by accessing
the trait menu using the <img ref="menu" style="vertical-align: middle;" src="/_static/icons/traits/dots-vertical.png" width="20px"> icon on
right side of the toolbar

<figure align="center" class="image">
  <img src="/_static/images/traits/traits_menu_framed.png" width="40%"> 
  <figcaption><i>All traits mangement menu</i></figcaption> 
</figure>

-   Reorder all traits by selecting _*Sort*_, then chosing your sort
    criterion (options include trait [Name]{.title-ref},
    [Format]{.title-ref}, or [Checked]{.title-ref} status)
-   Remove all traits by selecting _*Delete all traits*_, then
    confirming the operation.
-   Transfer traits in and out by selecting the _*Import/Export*_
    option.

Trait imports and exports are similar to field imports/exports in that
they rely on files stored in a dedicated folder, or on communication
with a designated server using a <a href="brapi.md"><img style="vertical-align: middle;" src="/_static/icons/settings/main/server-network.png" width="20px"></a> [Brapi](brapi.md) connection.

When using local storage, trait lists are stored as `.trt` files in the
`trait` folder. Internally, `.trt` files store their data in a CSV
format, but it is not recommended to manually edit these files.
