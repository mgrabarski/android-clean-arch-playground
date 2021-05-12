package com.mg.cleanarchitectureplaygraound.business.domain.components.di

import com.mg.cleanarchitectureplaygraound.business.domain.components.DateFormatter
import com.mg.cleanarchitectureplaygraound.business.domain.components.TimeProvider
import com.mg.cleanarchitectureplaygraound.business.domain.components.impl.DateFormatterJodaTime
import com.mg.cleanarchitectureplaygraound.business.domain.components.impl.TimeProviderImpl
import org.joda.time.format.DateTimeFormat
import org.koin.dsl.module

val domainModule = module {
    factory<TimeProvider> { TimeProviderImpl() }
    factory<DateFormatter> {
        DateFormatterJodaTime(
            DateTimeFormat.forPattern("dd-MM-yyyy HH:mm:ss"),
            DateTimeFormat.forPattern("dd-MM-yyyy")
        )
    }
}