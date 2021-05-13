package com.mg.cleanarchitectureplaygraound.framework.datasource.cache.service

import com.mg.cleanarchitectureplaygraound.business.domain.data.model.Note
import com.mg.cleanarchitectureplaygraound.business.domain.types.Id

interface NoteDaoService {
    suspend fun insertNote(note: Note): Id
}
