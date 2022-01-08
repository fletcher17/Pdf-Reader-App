package com.raywenderlich.android.majesticreader.framework

import com.raywenderlich.android.majesticreaderr.domain.Document
import com.raywenderlich.android.majesticreaderr.datalayer.OpenDocumentDataSource

class InMemoryOpenDocumentDataSource : OpenDocumentDataSource {

    private var openDocument: Document = Document.EMPTY

    override fun setOpenDocument(document: Document) {
        openDocument = document
    }

    override fun getOpenDocument(): Document {
        return openDocument
    }
}