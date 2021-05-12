package com.mg.cleanarchitectureplaygraound.business.domain.components.impl

import com.mg.cleanarchitectureplaygraound.business.domain.components.TimeProvider
import com.mg.cleanarchitectureplaygraound.business.domain.components.TimeProvider.AppDateTime
import org.joda.time.DateTime

class TimeProviderImpl : TimeProvider {

    override fun now(): AppDateTime = AppDateTime(
        time = DateTime.now()
    )
}