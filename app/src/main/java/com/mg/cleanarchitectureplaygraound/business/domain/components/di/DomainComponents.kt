package com.mg.cleanarchitectureplaygraound.business.domain.components.di

import com.mg.cleanarchitectureplaygraound.business.domain.components.DateFormatter
import com.mg.cleanarchitectureplaygraound.business.domain.components.TimeProvider
import com.mg.cleanarchitectureplaygraound.business.domain.components.impl.DateFormatterJodaTime
import com.mg.cleanarchitectureplaygraound.business.domain.components.impl.TimeProviderImpl
import org.joda.time.format.DateTimeFormat
import org.joda.time.format.DateTimeFormatter
import org.koin.dsl.module

val domainModule = module {
    factory<TimeProvider> { TimeProviderImpl(get()) }
    factory<DateFormatter> { DateFormatterJodaTime(FORMAT_DETAILED_DATE, FORMAT_SHORTER_DATE) }
}

val FORMAT_DETAILED_DATE: DateTimeFormatter = DateTimeFormat.forPattern("dd-MM-yyyy HH:mm:ss")
val FORMAT_SHORTER_DATE: DateTimeFormatter = DateTimeFormat.forPattern("dd-MM-yyyy")