package com.example.databasetask3

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [Post::class], version = 1)
abstract class PostDatabase: RoomDatabase() {
    abstract fun getDao(): DAOs
}