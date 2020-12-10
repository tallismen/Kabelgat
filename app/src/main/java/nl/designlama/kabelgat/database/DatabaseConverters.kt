package nl.designlama.kabelgat.database

import androidx.room.TypeConverter
import java.util.*

class DatabaseConverters {
    @TypeConverter
    fun getDateFromLong(value: Long?): Date? = value?.let { Date(it) }

    @TypeConverter
    fun getLongFromDate(value: Date?): Long? = value?.time
}
