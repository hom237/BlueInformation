package com.example.blueinformation

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "stuTable")
data class DB_students(
    //uid로 구현
    @PrimaryKey val uid: Int,
    @ColumnInfo(name = "schoolName") val school: String?,
    @ColumnInfo(name = "stuName") val name: String?,
    @ColumnInfo(name = "stuProfile") val stuProfile: Int?,
    @ColumnInfo(name = "stuComment") val stuComment : String?

)
