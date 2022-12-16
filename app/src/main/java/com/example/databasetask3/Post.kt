package com.example.databasetask3

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
class Post(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val title: String,
    val body: String
)