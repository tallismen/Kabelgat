package nl.designlama.kabelgat

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job

open class BaseViewModel : ViewModel(), CoroutineScope {

	private val job = Job()

	override val coroutineContext = Dispatchers.Default + job

	override fun onCleared() {
		job.cancel()
		super.onCleared()
	}
}
