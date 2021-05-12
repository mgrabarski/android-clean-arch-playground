package com.mg.cleanarchitectureplaygraoun.business.domain.components

import org.joda.time.DateTime

interface TimeProvider {

    fun now(): AppDateTime

    data class AppDateTime(
        val time: DateTime
    )
}