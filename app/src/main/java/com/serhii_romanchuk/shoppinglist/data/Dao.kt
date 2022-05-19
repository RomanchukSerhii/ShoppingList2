package com.serhii_romanchuk.shoppinglist.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.serhii_romanchuk.shoppinglist.entiies.NoteItem
import kotlinx.coroutines.flow.Flow

@Dao
interface Dao {
    @Query("SELECT * FROM note_list")
    fun getAllNotes(): Flow<List<NoteItem>>
    @Insert
    suspend fun insertNote(note: NoteItem)
}