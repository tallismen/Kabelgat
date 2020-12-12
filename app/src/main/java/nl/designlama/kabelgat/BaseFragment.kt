package nl.designlama.kabelgat

import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding

abstract class BaseFragment<VM : BaseViewModel> : Fragment() {

    protected var binding: ViewBinding? = null
    protected abstract val viewModel: VM

    override fun onDestroyView() {
        binding = null
        super.onDestroyView()
    }
}
