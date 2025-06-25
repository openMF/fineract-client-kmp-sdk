/*
 * Copyright 2025 Mifos Initiative
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 *
 * See See https://github.com/openMF/kmp-project-template/blob/main/LICENSE
 */
package org.mifos.di

import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module
import org.mifos.core.data.network.ApiHandlerFactory
import org.mifos.core.data.network.ApiHandlerRegistry
import org.mifos.core.data.network.ApiService
import org.mifos.core.data.network.DefaultApiHandlerRegistry
import org.mifos.core.data.network.FineractApiHandlerFactory
import org.mifos.presentation.ApiViewModel
import org.mifos.utils.FineractApiProvider
import org.mifos.utils.FineractApiProviderImpl

/**
 * Simplified dependency injection using unified ApiHandler framework
 * Clean, simple, and follows SOLID principles
 */

/**
 * Core module with ApiHandler framework components
 */
val coreModule = module {
    // Core API provider
    single<FineractApiProvider> { FineractApiProviderImpl() }

    // ApiHandler framework components
    single<ApiHandlerRegistry> { DefaultApiHandlerRegistry() }
    single<ApiHandlerFactory> { FineractApiHandlerFactory(get()) }
    single { ApiService(get(), get()) }
}

/**
 * Presentation module with unified ViewModel
 */
val presentationModule = module {
    viewModelOf(::ApiViewModel)
}

/**
 * Main modules list - clean and simplified
 */
val diModules = listOf(
    coreModule,
    presentationModule,
)
