package org.mifos.di

import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module
import org.mifos.repository.ApiCallRepository
import org.mifos.repository.ApiCallRepositoryImpl
import org.mifos.utils.FineractApiProvider
import org.mifos.utils.FineractApiProviderImpl
import org.mifos.viewmodel.ApiCallViewModel


val diModules = module {

    single<FineractApiProvider>{ FineractApiProviderImpl() }

    single<ApiCallRepository> { ApiCallRepositoryImpl(get()) }

    viewModelOf(::ApiCallViewModel)
}