package nl.designlama.kabelgat.koin

import nl.designlama.kabelgat.ui.dashboard.DashboardViewModel
import nl.designlama.kabelgat.ui.home.HomeViewModel
import nl.designlama.kabelgat.ui.notifications.NotificationsViewModel
import org.koin.dsl.module

val myModule = module {
    single { DashboardViewModel() }
    single { HomeViewModel() }
    single { NotificationsViewModel() }
}
