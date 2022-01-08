package com.raywenderlich.android.majesticreaderr.datalayer

import com.raywenderlich.android.majesticreaderr.domain.Document

interface OpenDocumentDataSource {

    fun setOpenDocument(document: Document)

    fun getOpenDocument(): Document
}