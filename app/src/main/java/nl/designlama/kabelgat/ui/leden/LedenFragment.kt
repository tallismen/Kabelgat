package nl.designlama.kabelgat.ui.leden

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import nl.designlama.kabelgat.BaseFragment
import nl.designlama.kabelgat.databinding.FragmentHomeBinding
import nl.designlama.kabelgat.databinding.FragmentLedenBinding
import org.koin.android.viewmodel.ext.android.viewModel

class LedenFragment : BaseFragment<LedenViewModel>()  {

    private var binding: FragmentLedenBinding? = null

    override val viewModel: LedenViewModel by viewModel()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentLedenBinding.inflate(inflater, container, false)
        return binding?.root
    }
}
