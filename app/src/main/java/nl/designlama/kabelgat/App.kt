package nl.designlama.kabelgat

import android.app.Application
import nl.designlama.kabelgat.database.AppDatabase
import nl.designlama.kabelgat.database.dao.LedenDao
import nl.designlama.kabelgat.database.dao.MateriaalDao
import nl.designlama.kabelgat.koin.myModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {

    var ledenDao: LedenDao? = null
    var materiaalDao: MateriaalDao? = null

    override fun onCreate() {
        super.onCreate()
        sApp = this

        startKoin {
            androidContext(this@App)
            modules(myModule)
        }

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
