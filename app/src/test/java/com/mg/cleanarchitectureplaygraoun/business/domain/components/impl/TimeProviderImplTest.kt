package com.mg.cleanarchitectureplaygraoun.business.domain.components.impl

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.longs.shouldBeGreaterThan

class TimeProviderImplTest : FunSpec({

    test("Result should contains date greater then zero") {
        val result = TimeProviderImpl().now()

        result.time.millis shouldBeGreaterThan 0L
    }
})
