package nl.designlama.kabelgat

import android.app.Application
import nl.designlama.kabelgat.database.AppDatabase
import nl.designlama.kabelgat.database.dao.LedenDao
import nl.designlama.kabelgat.database.dao.MateriaalDao

class App : Application() {

    var ledenDao: LedenDao? = null
    var materiaalDao: MateriaalDao? = null

    override fun onCreate() {
        super.onCreate()
        sApp = this

        AppDatabase.getAppDatabase(this)?.let{
            ledenDao = it.getLedenDao()
            materiaalDao = it.getMateriaalDao()
        }
    }

    companion object {
        lateinit var sApp: App

        @JvmStatic
        fun get(): App {
            return sApp
        }
    }
}
