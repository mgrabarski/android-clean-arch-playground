package com.mg.cleanarchitectureplaygraound.business.domain.components.impl

import com.mg.cleanarchitectureplaygraound.business.domain.components.DateFormatter
import org.joda.time.format.DateTimeFormatter

class DateFormatterJodaTime(
    private val detailsFormat: DateTimeFormatter,
    private val shortFormat: DateTimeFormatter
) : DateFormatter {

    override fun detailsFormat(dateTime: Long): String = detailsFormat.print(dateTime)

    override fun shorterFormat(dateTime: Long): String = shortFormat.print(dateTime)
}