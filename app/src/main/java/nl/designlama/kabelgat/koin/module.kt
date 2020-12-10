package nl.designlama.kabelgat.koin

import nl.designlama.kabelgat.ui.main.MainViewModel
import org.koin.dsl.module

val myModule = module {
    single { MainViewModel() }
}
