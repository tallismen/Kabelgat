package nl.designlama.kabelgatapp.databases.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import nl.designlama.kabelgatapp.databases.entity.Gereedschap
import nl.designlama.kabelgatapp.databases.entity.Lid

@Dao
interface GereedschapDao {

    @Insert
    fun insert(gereedschap: Gereedschap)

//    @Query("SELECT * FROM gereedschap")
//    fun blabla()
}