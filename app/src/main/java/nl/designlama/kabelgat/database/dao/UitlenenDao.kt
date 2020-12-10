package nl.designlama.kabelgatapp.databases.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import nl.designlama.kabelgatapp.databases.entity.Lid
import nl.designlama.kabelgatapp.databases.entity.Uitlenen

@Dao
interface UitlenenDao {

    @Insert
    fun insert(uitlenen: Uitlenen)

    @Query("SELECT * FROM uitlenen")
    fun getAlleLiveDataUitlenen(): LiveData<List<Uitlenen>>
//    @Query("SELECT * FROM uitlenen")
//    fun blabla()
}