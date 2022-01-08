package com.raywenderlich.android.majesticreaderr.datalayer

import com.raywenderlich.android.majesticreaderr.domain.Bookmark
import com.raywenderlich.android.majesticreaderr.domain.Document

interface BookMarkDataSource {

    suspend fun add(document: Document, bookmark: Bookmark)

    suspend fun read(document: Document): List<Bookmark>

    suspend fun remove(document: Document, bookmark: Bookmark)
}