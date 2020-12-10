package nl.designlama.kabelgat.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import nl.designlama.kabelgat.database.entity.Materiaal

@Dao
interface MateriaalDao {

    @Insert
    fun insert(materiaal: Materiaal)

//    @Query("SELECT * FROM gereedschap")
//    fun blabla()
}
