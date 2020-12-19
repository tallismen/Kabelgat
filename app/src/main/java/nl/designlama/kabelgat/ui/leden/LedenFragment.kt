package nl.designlama.kabelgat.ui.leden

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.lifecycle.Observer
import nl.designlama.kabelgat.BaseFragment
import nl.designlama.kabelgat.R
import nl.designlama.kabelgat.database.entity.Lid
import nl.designlama.kabelgat.databinding.FragmentLedenBinding
import org.koin.android.viewmodel.ext.android.viewModel

class LedenFragment : BaseFragment<LedenViewModel>(), LidAdapter.ClickListener  {

    private var binding: FragmentLedenBinding? = null
    private var lidAdapter: LidAdapter? = null

    override val viewModel: LedenViewModel by viewModel()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentLedenBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding?.swipeRefreshLayout?.apply {
            setOnRefreshListener {
                isRefreshing = false
            }
            setColorSchemeColors(ContextCompat.getColor(view.context, R.color.light_blue))
        }

        lidAdapter = LidAdapter(this)

        binding?.recyclerView?.adapter = lidAdapter

        viewModel.getLiveDataLeden().observe(viewLifecycleOwner, Observer {leden ->
            (binding?.recyclerView?.adapter as? LidAdapter)?.let {
                it.leden.clear()
                it.leden.addAll(leden)
                it.notifyDataSetChanged()
                binding?.emptyView?.visibility = if (it.isEmpty()) View.VISIBLE else View.GONE
            }
        })
    }

    override fun onDeleteClick(lid: Lid) {
        TODO("Not yet implemented")
    }

    override fun onEditClick(lid: Lid) {
        TODO("Not yet implemented")
    }


}
