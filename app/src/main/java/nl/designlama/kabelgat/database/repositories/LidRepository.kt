package nl.designlama.kabelgat.database.repositories

import android.content.Context
import androidx.lifecycle.LiveData
import nl.designlama.kabelgat.database.AppDatabase
import nl.designlama.kabelgat.database.dao.LedenDao
import nl.designlama.kabelgat.database.entity.Lid

class LidRepository(context: Context) {

    private lateinit var ledenDao: LedenDao

    init {
        AppDatabase.getAppDatabase(context)?.let { ledenDao = it.getLedenDao() }
    }

    fun getAlleLiveDataLeden(): LiveData<List<Lid>> = ledenDao.getAlleLiveDataLeden()

    fun getAlleLeden(): List<Lid> = ledenDao.getAlleLeden()


    suspend fun insert(lid: Lid) {
        ledenDao.insert(lid)
    }
}
