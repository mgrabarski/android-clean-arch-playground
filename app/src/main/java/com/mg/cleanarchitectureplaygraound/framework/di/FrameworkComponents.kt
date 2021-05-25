package com.mg.cleanarchitectureplaygraound.framework.di

import com.mg.cleanarchitectureplaygraound.framework.datasource.cache.service.NoteDaoService
import com.mg.cleanarchitectureplaygraound.framework.datasource.cache.service.impl.DatabaseNoteDaoService
import com.mg.cleanarchitectureplaygraound.framework.datasource.network.service.NoteWebserviceService
import com.mg.cleanarchitectureplaygraound.framework.datasource.network.service.impl.NoteFirestoreServiceImpl
import org.koin.dsl.module

val frameworkModule = module {
    factory<NoteDaoService> { DatabaseNoteDaoService() }
    factory<NoteWebserviceService> { NoteFirestoreServiceImpl() }
}