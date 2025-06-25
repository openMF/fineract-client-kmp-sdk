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

import org.koin.core.context.startKoin
import org.koin.dsl.KoinAppDeclaration

fun startingKoin(config: KoinAppDeclaration? = null) {
    startKoin {
        config?.invoke(this)
        modules(diModules)
    }
}
