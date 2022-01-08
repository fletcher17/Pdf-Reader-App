package com.raywenderlich.android.majesticreaderr.interactors

import com.raywenderlich.android.majesticreaderr.domain.Document
import com.raywenderlich.android.majesticreaderr.datalayer.DocumentRepository


class SetOpenDocument(private val documentRepository: DocumentRepository) {

    operator fun invoke(document: Document) =
        documentRepository.setOpenDocument(document)
}