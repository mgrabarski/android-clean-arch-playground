package com.mg.cleanarchitectureplaygraound.business.domain.components.impl

import com.mg.cleanarchitectureplaygraound.business.domain.components.DateFormatter
import com.mg.cleanarchitectureplaygraound.business.domain.components.TimeProvider
import com.mg.cleanarchitectureplaygraound.business.domain.components.TimeProvider.AppDateTime
import org.joda.time.DateTime

class TimeProviderImpl(
    private val formatter: DateFormatter
) : TimeProvider {

    override fun now(): AppDateTime {
        val now = DateTime.now()
        return AppDateTime(
            time = now,
            detailsFormat = formatter.detailsFormat(now.millis),
            shortFormat = formatter.shorterFormat(now.millis)
        )
    }
}