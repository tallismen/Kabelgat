package nl.designlama.kabelgat.koin

import nl.designlama.kabelgat.database.repositories.MateriaalRepository
import nl.designlama.kabelgat.ui.dashboard.DashboardViewModel
import nl.designlama.kabelgat.ui.home.HomeViewModel
import nl.designlama.kabelgat.ui.notifications.NotificationsViewModel
import nl.designlama.kabelgat.database.repositories.LidRepository
import nl.designlama.kabelgat.ui.leden.LedenViewModel
import org.koin.dsl.module

val myModule = module {
    single { DashboardViewModel(get()) }
    single { HomeViewModel() }
    single { NotificationsViewModel() }
    single { LedenViewModel(get()) }

    single { MateriaalRepository(get()) }
    single { LidRepository(get()) }
}
