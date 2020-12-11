package nl.designlama.kabelgatapp.databases.repositories

import android.content.Context
import androidx.lifecycle.LiveData
import nl.designlama.kabelgatapp.databases.AppDatabase
import nl.designlama.kabelgatapp.databases.dao.LedenDao
import nl.designlama.kabelgatapp.databases.entity.Lid

class LidRepository constructor(context: Context) {

    private lateinit var ledenDao: LedenDao

    init {
        AppDatabase.getAppDatabase(context)?.let {
            ledenDao = it.getLedenDao()
        }
    }

    fun getAlleLiveDataLeden(): LiveData<List<Lid>> = ledenDao.getAlleLiveDataLeden()

    fun getAlleLeden(): List<Lid> = ledenDao.getAlleLeden()


    fun instert(lid: Lid) {
        ledenDao.insert(lid)
    }
}