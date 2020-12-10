package nl.designlama.kabelgat.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import nl.designlama.kabelgat.database.dao.LedenDao
import nl.designlama.kabelgat.database.entity.Lid
import nl.designlama.kabelgat.database.entity.Materiaal
import nl.designlama.kabelgat.database.entity.Uitlenen
import nl.designlama.kabelgat.database.dao.MateriaalDao

@Database(entities = [Lid::class, Materiaal::class, Uitlenen::class], version = 1, exportSchema = false)
@TypeConverters(DatabaseConverters::class)
abstract class AppDatabase : RoomDatabase() {

    abstract fun getLedenDao(): LedenDao
    abstract fun getMateriaalDao(): MateriaalDao

    companion object {
        const val APP_DATABASE = "app_database.db"
        private var INSTANCE: AppDatabase? = null

        fun getAppDatabase(context: Context): AppDatabase? {
            if (INSTANCE == null) {
                synchronized(AppDatabase::class.java) {
                    INSTANCE = Room.databaseBuilder(
                        context.applicationContext,
                        AppDatabase::class.java,
                        APP_DATABASE
                    )
                        .fallbackToDestructiveMigration()
                        .build()
                }
            }
            return INSTANCE
        }
    }
}
