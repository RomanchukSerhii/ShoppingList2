package com.serhii_romanchuk.shoppinglist.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.serhii_romanchuk.shoppinglist.entiies.LibraryItem
import com.serhii_romanchuk.shoppinglist.entiies.NoteItem
import com.serhii_romanchuk.shoppinglist.entiies.ShoppingListItem
import com.serhii_romanchuk.shoppinglist.entiies.ShoppingListNames

@Database(entities = [LibraryItem::class, NoteItem::class,
    ShoppingListItem::class, ShoppingListNames::class], version = 1)
abstract class MainDataBase : RoomDatabase() {
    abstract fun getDao(): Dao

    companion object {
        @Volatile
        private var INSTANCE: MainDataBase? = null
        fun getDataBase(context: Context): MainDataBase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    MainDataBase::class.java,
                    "shopping_list.db"
                ).build()
                instance
            }
        }
    }
}