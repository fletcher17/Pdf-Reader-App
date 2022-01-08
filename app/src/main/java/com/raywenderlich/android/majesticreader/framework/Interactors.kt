package com.raywenderlich.android.majesticreader.framework

import com.raywenderlich.android.majesticreaderr.interactors.*

data class Interactors(
    val addBookmark: AddBookMark,
    val getBookmarks: GetBookMarks,
    val deleteBookmark: RemoveBookMark,
    val addDocument: AddDocument,
    val getDocuments: GetDocuments,
    val removeDocument: RemoveDocument,
    val getOpenDocument: GetOpenDocument,
    val setOpenDocument: SetOpenDocument
)