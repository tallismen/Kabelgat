package nl.designlama.kabelgat.ui.leden

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import kotlinx.coroutines.launch
import nl.designlama.kabelgat.BaseViewModel
import nl.designlama.kabelgat.database.entity.Lid
import nl.designlama.kabelgat.database.repositories.LidRepository
import java.lang.Exception

class LedenViewModel(private var lidRepository: LidRepository) : BaseViewModel() {

    val leden = MutableLiveData<ArrayList<Lid>>()

    fun fetchLeden(){
        launch {
            try {
                lidRepository.getAlleLiveDataLeden()
            }catch (ex: Exception){

            }
        }
    }

    fun getLiveDataLeden(): LiveData<List<Lid>> = lidRepository.getAlleLiveDataLeden()

    fun lidToevoegen(lid: Lid){
        launch {
            lidRepository.insert(lid)
        }
    }

    fun allesVerwijderen(){
        launch {
            lidRepository.deleteAll()
        }
    }
}
