package com.serdar.data.dto.favorite

import androidx.room.Entity

@Entity(tableName = "favorite_table", primaryKeys = ["id","uuid"])
data class FavoritesDataModel(
    val id: Int,
    val uuid:String,
    val name: String,
    val image: String,
    val desc:String,
)
