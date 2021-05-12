package com.mg.cleanarchitectureplaygraound.business.domain.model.factories

import com.mg.cleanarchitectureplaygraound.business.domain.components.TimeProvider
import com.mg.cleanarchitectureplaygraound.business.domain.model.Note
import com.mg.cleanarchitectureplaygraound.business.domain.types.Id

class NoteFactory(
    private val timeProvider: TimeProvider
) {

    fun createNote(title: String, body: String?) = Note(
        id = Id.randomUUID(),
        title = title,
        body = body.orEmpty(),
        createdAt = timeProvider.now().detailsFormat,
        updatedAt = ""
    )
}