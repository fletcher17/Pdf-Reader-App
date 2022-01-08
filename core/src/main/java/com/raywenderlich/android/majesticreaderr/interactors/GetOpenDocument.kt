package com.raywenderlich.android.majesticreaderr.interactors

import com.raywenderlich.android.majesticreaderr.datalayer.DocumentRepository

class GetOpenDocument(private val documentRepository: DocumentRepository) {

    operator fun invoke() =
        documentRepository.getOpenDocument()
}