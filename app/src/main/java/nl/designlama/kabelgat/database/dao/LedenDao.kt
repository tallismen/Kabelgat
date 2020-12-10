package nl.designlama.kabelgat.database.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import nl.designlama.kabelgat.database.entity.Lid

@Dao
interface LedenDao {

    @Insert
    fun insert(lid: Lid)

    @Query("SELECT * FROM leden")
    fun getAlleLiveDataLeden(): LiveData<List<Lid>>

    @Query("SELECT * FROM leden")
    fun getAlleLeden(): List<Lid>
}
