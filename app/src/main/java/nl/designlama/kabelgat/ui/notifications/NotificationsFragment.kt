package nl.designlama.kabelgat.ui.notifications

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import nl.designlama.kabelgat.BaseFragment
import nl.designlama.kabelgat.databinding.FragmentNotificationsBinding
import org.koin.android.viewmodel.ext.android.viewModel

class NotificationsFragment : BaseFragment<NotificationsViewModel>()  {

    private var binding: FragmentNotificationsBinding? = null

    override val viewModel: NotificationsViewModel by viewModel()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentNotificationsBinding.inflate(inflater, container, false)
        return binding?.root
    }
}
