package com.raywenderlich.android.majesticreaderr.interactors

import com.raywenderlich.android.majesticreaderr.domain.Bookmark
import com.raywenderlich.android.majesticreaderr.domain.Document
import com.raywenderlich.android.majesticreaderr.datalayer.BookMarkRepository

class AddBookMark (private val bookmarkRepository: BookMarkRepository) {
    suspend operator fun invoke(document: Document, bookmark: Bookmark) =
        bookmarkRepository.addBookmark(document, bookmark)
}