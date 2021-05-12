package com.mg.cleanarchitectureplaygraoun.business.domain.components.impl

import com.mg.cleanarchitectureplaygraound.business.domain.components.di.FORMAT_DETAILED_DATE
import com.mg.cleanarchitectureplaygraound.business.domain.components.di.FORMAT_SHORTER_DATE
import com.mg.cleanarchitectureplaygraound.business.domain.components.impl.DateFormatterJodaTime
import com.mg.cleanarchitectureplaygraound.business.domain.components.impl.TimeProviderImpl
import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.longs.shouldBeGreaterThan
import io.kotest.matchers.shouldBe

class TimeProviderImplTest : FunSpec({

    val formatter = DateFormatterJodaTime(FORMAT_DETAILED_DATE, FORMAT_SHORTER_DATE)
    val sut = TimeProviderImpl(formatter)

    test("Result should contains date greater then zero") {
        val result = sut.now()

        result.time.millis shouldBeGreaterThan 0L
        result.detailsFormat.isNotEmpty() shouldBe true
        result.shortFormat.isNotEmpty() shouldBe true
    }
})
