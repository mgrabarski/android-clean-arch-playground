package com.mg.cleanarchitectureplaygraound.business.domain.data.network

sealed class ApiResult<out T> {

    class Success<out T>(val value: T) : ApiResult<T>()

    class Error(val code: Int? = null, val message: String? = null) : ApiResult<Nothing>()

    object NetworkError : ApiResult<Nothing>()
}