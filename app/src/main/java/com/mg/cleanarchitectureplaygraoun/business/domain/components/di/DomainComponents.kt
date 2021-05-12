package com.mg.cleanarchitectureplaygraoun.business.domain.components.di

import com.mg.cleanarchitectureplaygraoun.business.domain.components.TimeProvider
import com.mg.cleanarchitectureplaygraoun.business.domain.components.impl.TimeProviderImpl
import org.koin.dsl.module

val domainModule = module {
    factory<TimeProvider> { TimeProviderImpl() }
}