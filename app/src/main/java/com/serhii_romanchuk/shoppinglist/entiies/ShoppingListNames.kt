package com.serhii_romanchuk.shoppinglist.entiies

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize

@Parcelize
@Entity (tableName = "shopping_list_names")
data class ShoppingListNames(
    @PrimaryKey(autoGenerate = true)
    val id: Int?,
    @ColumnInfo(name = "name")
    val name: String,
    @ColumnInfo(name = "time")
    val time: String,
    @ColumnInfo(name = "allItemCount")
    val allItemCounter: Int,
    @ColumnInfo(name = "checkedItemsCounter")
    val checkedItemsCounter: Int,
    @ColumnInfo(name = "itemsIds")
    val itemsIds: String
): Parcelable
