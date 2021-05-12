package com.mg.cleanarchitectureplaygraound.business.domain.components

interface DateFormatter {
    fun detailsFormat(): String
    fun shorterFormat(): String
}