package nl.designlama.kabelgat.database.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "leden")
data class Lid(
    @PrimaryKey var lidId: Int = 0,
    var naam: String = ""
)
