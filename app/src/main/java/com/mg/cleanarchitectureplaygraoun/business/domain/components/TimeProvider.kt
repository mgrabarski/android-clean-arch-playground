package com.mg.cleanarchitectureplaygraoun.business.domain.components

interface TimeProvider {

    fun now(): AppDateTime

    data class AppDateTime(
        val time: Long
    )
}