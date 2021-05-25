package com.mg.cleanarchitectureplaygraound.di

import com.mg.cleanarchitectureplaygraound.business.domain.components.di.domainModule
import com.mg.cleanarchitectureplaygraound.framework.di.frameworkModule

val appModules = listOf(
    domainModule,
    frameworkModule
)