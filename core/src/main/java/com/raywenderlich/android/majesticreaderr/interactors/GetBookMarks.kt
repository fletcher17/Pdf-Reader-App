package com.raywenderlich.android.majesticreaderr.interactors

import com.raywenderlich.android.majesticreaderr.domain.Document
import com.raywenderlich.android.majesticreaderr.datalayer.BookMarkRepository

class GetBookMarks(private val bookmarkRepository: BookMarkRepository) {
    suspend operator fun invoke(document: Document) =
        bookmarkRepository.getBookmarks(document)
}