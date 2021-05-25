package com.mg.cleanarchitectureplaygraound.business.domain.state

sealed class UseCaseState<T>(
    val response: Result,
    var data: T? = null
) {
    class Success<T>(response: Result, data: T?) : UseCaseState<T>(response, data)

    class Failed<T>(response: Result) : UseCaseState<T>(response)
}

data class Result(
    val message: String
)