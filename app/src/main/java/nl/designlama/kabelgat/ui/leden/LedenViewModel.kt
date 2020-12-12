package nl.designlama.kabelgat.ui.leden

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import nl.designlama.kabelgat.BaseViewModel

class LedenViewModel : BaseViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is home Fragment"
    }
    val text: LiveData<String> = _text
}
