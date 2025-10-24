package com.fieldbook.tracker.traits.formats

import com.fieldbook.tracker.R
import com.fieldbook.tracker.traits.formats.parameters.DetailsParameter
import com.fieldbook.tracker.traits.formats.parameters.NameParameter

class DiseaseRatingFormat : TraitFormat(
    format = Formats.DISEASE_RATING,
    defaultLayoutId = R.layout.trait_disease_rating,
    layoutView = null,
    databaseName = "rust rating",
    nameStringResourceId = R.string.traits_format_disease_rating,
    iconDrawableResourceId = R.drawable.ic_trait_disease_rating,
    stringNameAux = null,
    NameParameter(),
    DetailsParameter()
), Scannable