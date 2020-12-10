package nl.designlama.kabelgat.database.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "materiaal")
data class Materiaal(
    @PrimaryKey var materiaalId: Int = 0,
    var naam: String = "",
    val omschrijving: String = ""
)
