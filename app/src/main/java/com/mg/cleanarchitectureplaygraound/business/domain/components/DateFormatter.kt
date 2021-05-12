package com.mg.cleanarchitectureplaygraound.business.domain.components

interface DateFormatter {
    fun detailsFormat(dateTime: Long): String
    fun shorterFormat(dateTime: Long): String
}