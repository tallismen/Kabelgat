package nl.designlama.kabelgat.database.repositories

import android.content.Context
import nl.designlama.kabelgat.database.AppDatabase
import nl.designlama.kabelgat.database.dao.MateriaalDao
import nl.designlama.kabelgat.database.entity.Materiaal

class MateriaalRepository(val context: Context) {

    lateinit var materiaalDao: MateriaalDao

    init {
        AppDatabase.getAppDatabase(context)?.let {
            materiaalDao = it.getMateriaalDao()
        }
    }

    suspend fun insert(materiaal: Materiaal) {
        materiaalDao.insert(materiaal)
    }
}
