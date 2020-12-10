package nl.designlama.kabelgat.database.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Transaction
import nl.designlama.kabelgat.database.entity.Lid
import nl.designlama.kabelgat.database.entity.LidWithMateriaal

@Dao
interface LedenDao {

    @Insert
    fun insert(lid: Lid)

    @Query("SELECT * FROM leden")
    fun getAlleLiveDataLeden(): LiveData<List<Lid>>

    @Query("SELECT * FROM leden")
    fun getAlleLeden(): List<Lid>

    @Transaction
    @Query("SELECT * FROM leden WHERE lidId = :lidId")
    fun getLidWithMateriaal(lidId: Int): List<LidWithMateriaal>
}
