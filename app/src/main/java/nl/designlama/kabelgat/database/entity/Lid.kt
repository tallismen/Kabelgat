package nl.designlama.kabelgat.database.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "leden")
data class Lid(
    @PrimaryKey(autoGenerate = true)var lidId: Int = 0,
    var naam: String = ""
)
