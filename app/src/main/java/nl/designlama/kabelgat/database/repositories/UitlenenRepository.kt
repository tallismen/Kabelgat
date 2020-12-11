package nl.designlama.kabelgatapp.databases.repositories

import android.content.Context
import androidx.lifecycle.LiveData
import nl.designlama.kabelgatapp.databases.AppDatabase
import nl.designlama.kabelgatapp.databases.dao.UitlenenDao
import nl.designlama.kabelgatapp.databases.entity.Uitlenen

class UitlenenRepository constructor(context: Context) {

    lateinit var uitLenenDao: UitlenenDao

    init {
        AppDatabase.getAppDatabase(context)?.let {
            uitLenenDao = it.getUitLenenDao()
        }
    }

    fun instert(uitlenen: Uitlenen) {
        uitLenenDao.insert(uitlenen)
    }

    fun getAlleLiveDataUitlenen(): LiveData<List<Uitlenen>> {
        return uitLenenDao.getAlleLiveDataUitlenen()
    }
}