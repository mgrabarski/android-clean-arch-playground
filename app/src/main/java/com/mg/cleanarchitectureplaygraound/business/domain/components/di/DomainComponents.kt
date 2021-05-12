package com.mg.cleanarchitectureplaygraound.business.domain.components.di

import com.mg.cleanarchitectureplaygraound.business.domain.components.TimeProvider
import com.mg.cleanarchitectureplaygraound.business.domain.components.impl.TimeProviderImpl
import org.koin.dsl.module

val domainModule = module {
    factory<TimeProvider> { TimeProviderImpl() }
}