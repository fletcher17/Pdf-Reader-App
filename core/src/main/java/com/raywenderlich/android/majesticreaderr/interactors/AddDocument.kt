package com.raywenderlich.android.majesticreaderr.interactors

import com.raywenderlich.android.majesticreaderr.domain.Document
import com.raywenderlich.android.majesticreaderr.datalayer.DocumentRepository

class AddDocument(private val documentRepository: DocumentRepository) {
    suspend operator fun invoke (document: Document) =
        documentRepository.addDocument(document)
}