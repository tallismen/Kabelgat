package nl.designlama.kabelgat.ui.dashboard

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.launch
import nl.designlama.kabelgat.BaseViewModel
import nl.designlama.kabelgat.database.entity.Lid
import nl.designlama.kabelgat.database.repositories.LidRepository

class DashboardViewModel(private val lidRepository: LidRepository) : BaseViewModel() {

    val leden = MutableLiveData<List<Lid>>()

    fun getLeden(){
        launch {
            try {
                with(lidRepository.getAlleLeden()){
                    Log.i(javaClass.name, "getLeden() succes ${this.size}")
                    leden.postValue(this)
                }

            }catch (ex: Exception){
                Log.e(javaClass.name, "getLeden() failed: $ex")
            }
        }
    }
}
