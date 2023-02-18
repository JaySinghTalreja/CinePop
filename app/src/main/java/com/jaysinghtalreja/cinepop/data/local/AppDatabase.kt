package com.jaysinghtalreja.cinepop.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.jaysinghtalreja.cinepop.data.local.daos.MoviesDao
import com.jaysinghtalreja.cinepop.data.remote.Movie

@Database(entities = [Movie::class], version = 3, exportSchema = false)
@TypeConverters(Converters::class)
abstract class AppDatabase : RoomDatabase() {
    abstract fun movieDao(): MoviesDao
}