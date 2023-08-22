package com.example.blueinformation.DataBase

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.blueinformation.DAO.ContactDao
import com.example.blueinformation.DB_students

@Database(entities = [DB_students::class], version = 1)
abstract class DataBase : RoomDatabase() {
    abstract fun contactDao(): ContactDao
}