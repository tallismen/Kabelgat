package nl.designlama.kabelgat.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import nl.designlama.kabelgat.BaseFragment
import nl.designlama.kabelgat.R
import nl.designlama.kabelgat.databinding.FragmentHomeBinding
import org.koin.android.viewmodel.ext.android.viewModel

class HomeFragment : BaseFragment<HomeViewModel>()  {

    private var binding: FragmentHomeBinding? = null

    override val viewModel: HomeViewModel by viewModel()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        binding?.ledenButton?.setOnClickListener { findNavController().navigate(R.id.) }
    }

    override fun onDestroy() {
        binding = null
        super.onDestroy()
    }
}
