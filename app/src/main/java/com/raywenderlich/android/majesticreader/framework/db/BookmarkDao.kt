package com.raywenderlich.android.majesticreader.framework.db

import androidx.lifecycle.LiveData
import androidx.room.*
import androidx.room.OnConflictStrategy.REPLACE

@Dao
interface BookmarkDao {

  @Insert(onConflict = REPLACE)
  suspend fun addBookmark(bookmark: BookmarkEntity)

  @Query("SELECT * FROM bookmark WHERE documentUri = :documentUri")
  fun getBookmarks(documentUri: String): List<BookmarkEntity>

  @Delete
  suspend fun removeBookmark(bookmark: BookmarkEntity)
}