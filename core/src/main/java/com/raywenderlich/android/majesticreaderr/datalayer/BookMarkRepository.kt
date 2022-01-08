package com.raywenderlich.android.majesticreaderr.datalayer

import com.raywenderlich.android.majesticreaderr.domain.Bookmark
import com.raywenderlich.android.majesticreaderr.domain.Document

class BookMarkRepository(private val dataSource: BookMarkDataSource) {

    suspend fun addBookmark(document: Document, bookmark: Bookmark) =
        dataSource.add(document, bookmark)

    suspend fun getBookmarks(document: Document) = dataSource.read(document)

    suspend fun removeBookmark(document: Document, bookmark: Bookmark) =
        dataSource.remove(document, bookmark)
}