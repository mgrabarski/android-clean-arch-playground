package com.mg.cleanarchitectureplaygraound.business.domain.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Note(
    val id: String,
    val title: String,
    val body: String,
    val createdAt: String,
    val updatedAt: String
) : Parcelable