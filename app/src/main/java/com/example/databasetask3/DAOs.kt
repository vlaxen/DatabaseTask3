package com.example.databasetask3

import androidx.room.Insert
import androidx.room.Query

@androidx.room.Dao
interface DAOs {
    @Query("SELECT * FROM Post")
    fun getPosts(): List<Post>
    @Insert
    fun insertPost(post: Post)
}