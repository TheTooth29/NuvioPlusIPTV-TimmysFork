package com.nuvio.tv.ui.screens.home

/** Presentation only: addon catalogs stay installed and available as Collection sources. */
internal fun visibleCollectionHomeRows(rows: List<HomeRow>): List<HomeRow.CollectionRow> =
    rows.filterIsInstance<HomeRow.CollectionRow>()
