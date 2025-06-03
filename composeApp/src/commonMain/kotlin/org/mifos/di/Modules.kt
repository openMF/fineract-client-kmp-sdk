package org.mifos.di

import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module
import org.mifos.repository.ApiCallRepo
import org.mifos.utils.FineractApiProvider
import org.mifos.viewmodel.ApiCallViewModel


val diModules = module {

    single { FineractApiProvider }

    single { ApiCallRepo(get()) }

    viewModel{ ApiCallViewModel(get()) }
}