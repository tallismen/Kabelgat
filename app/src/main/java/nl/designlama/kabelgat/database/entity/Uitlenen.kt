package nl.designlama.kabelgat.database.entity

import androidx.room.Entity
import java.util.*

@Entity(primaryKeys = ["lidId","materiaalId"], tableName = "uitlenen")
data class Uitlenen(
    var lidId: Int,
    var materiaalId: Int,
    var uitleenDatum: Date
)
