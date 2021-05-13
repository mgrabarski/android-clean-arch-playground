package com.mg.cleanarchitectureplaygraound.business.domain.data.model

import android.os.Parcelable
import com.mg.cleanarchitectureplaygraound.business.domain.types.Id
import kotlinx.parcelize.Parcelize

@Parcelize
data class Note(
    val id: Id,
    val title: String,
    val body: String,
    val createdAt: String,
    val updatedAt: String
) : Parcelable