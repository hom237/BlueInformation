package com.example.blueinformation.DAO

import android.content.Context
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface ContactDao {
    @Query("SELECT * FROM STUTABLE")
    fun getAllContacts(): List<String>

    @Insert
    fun insertContact(contact: Context)
}

