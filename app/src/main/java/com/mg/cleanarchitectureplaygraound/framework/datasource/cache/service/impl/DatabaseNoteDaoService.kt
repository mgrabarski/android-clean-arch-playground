package com.mg.cleanarchitectureplaygraound.framework.datasource.cache.service.impl

import com.mg.cleanarchitectureplaygraound.business.domain.data.model.Note
import com.mg.cleanarchitectureplaygraound.business.domain.types.Id
import com.mg.cleanarchitectureplaygraound.framework.datasource.cache.service.NoteDaoService

class DatabaseNoteDaoService : NoteDaoService {

    override suspend fun insertNote(note: Note): Id {
        TODO("Not yet implemented")
    }
}