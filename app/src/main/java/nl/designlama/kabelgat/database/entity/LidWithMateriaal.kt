package nl.designlama.kabelgat.database.entity

import androidx.room.Embedded
import androidx.room.Relation

data class LidWithMateriaal(
    @Embedded val lid: Lid,
    @Relation(
        parentColumn = "lidId",
        entityColumn = "materiaalId",
    )
    val materialen: List<Materiaal>
)
