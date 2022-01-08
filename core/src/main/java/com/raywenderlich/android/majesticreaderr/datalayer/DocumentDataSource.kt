package com.raywenderlich.android.majesticreaderr.datalayer

import com.raywenderlich.android.majesticreaderr.domain.Document

interface DocumentDataSource {

    suspend fun add(document: Document)

    suspend fun readAll(): List<Document>

    suspend fun remove(document: Document)

}