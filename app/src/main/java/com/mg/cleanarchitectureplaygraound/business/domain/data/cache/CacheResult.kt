package com.mg.cleanarchitectureplaygraound.business.domain.data.cache

sealed class CacheResult<out T> {

    data class Success<out T>(val value: T) : CacheResult<T>()

    data class Error(val errorMessage: String? = null) : CacheResult<Nothing>()
}