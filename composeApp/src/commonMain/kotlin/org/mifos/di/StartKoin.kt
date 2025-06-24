package org.mifos.di

import org.koin.core.context.startKoin
import org.koin.dsl.KoinAppDeclaration

fun startingKoin(config: KoinAppDeclaration? = null){
    startKoin {
        config?.invoke(this)
        modules(diModules)
    }

}