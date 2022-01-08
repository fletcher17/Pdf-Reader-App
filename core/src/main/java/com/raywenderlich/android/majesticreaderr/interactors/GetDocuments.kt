package com.raywenderlich.android.majesticreaderr.interactors

import com.raywenderlich.android.majesticreaderr.datalayer.DocumentRepository

class GetDocuments(private val documentRepository: DocumentRepository) {

    suspend operator fun invoke() =
        documentRepository.getDocuments()
}