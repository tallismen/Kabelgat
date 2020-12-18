package nl.designlama.kabelgat.ui.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import nl.designlama.kabelgat.BaseFragment
import nl.designlama.kabelgat.databinding.FragmentDashboardBinding
import org.koin.android.viewmodel.ext.android.viewModel

class DashboardFragment : BaseFragment<DashboardViewModel>() {

    private var binding: FragmentDashboardBinding? = null

    override val viewModel: DashboardViewModel by viewModel()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentDashboardBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.leden.observe(viewLifecycleOwner, Observer {
            (binding as? FragmentDashboardBinding)?.textDashboard?.text = it.toString()
        })
    }
}
