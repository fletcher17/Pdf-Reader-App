package com.raywenderlich.android.majesticreaderr.datalayer

import com.raywenderlich.android.majesticreaderr.domain.Document

class DocumentRepository(
    private val documentDataSource: DocumentDataSource,
    private val openDocumentDataSource: OpenDocumentDataSource) {

    suspend fun addDocument(document: Document) = documentDataSource.add(document)

    suspend fun getDocuments() = documentDataSource.readAll()

    suspend fun removeDocument(document: Document) = documentDataSource.remove(document)

    fun setOpenDocument(document: Document) = openDocumentDataSource.setOpenDocument(document)

    fun getOpenDocument() = openDocumentDataSource.getOpenDocument()
}