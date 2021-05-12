package com.mg.cleanarchitectureplaygraound.business.domain.components

import org.joda.time.DateTime

interface TimeProvider {

    fun now(): AppDateTime

    data class AppDateTime(
        val time: DateTime,
        val detailsFormat: String,
        val shortFormat: String
    )
}