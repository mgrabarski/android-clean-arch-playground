package com.mg.cleanarchitectureplaygraoun.business.domain.components.impl

import com.mg.cleanarchitectureplaygraoun.business.domain.components.TimeProvider
import com.mg.cleanarchitectureplaygraoun.business.domain.components.TimeProvider.AppDateTime
import org.joda.time.DateTime

class TimeProviderImpl : TimeProvider {

    override fun now(): AppDateTime = AppDateTime(
        time = DateTime.now().millis
    )
}