package com.mg.cleanarchitectureplaygraound.business.interactors.notelist

import com.mg.cleanarchitectureplaygraound.business.domain.data.cache.abstraction.NoteCacheDataSource
import com.mg.cleanarchitectureplaygraound.business.domain.data.model.Note
import com.mg.cleanarchitectureplaygraound.business.domain.data.model.factories.NoteFactory
import com.mg.cleanarchitectureplaygraound.business.domain.data.network.abstraction.NetworkDataSource
import com.mg.cleanarchitectureplaygraound.business.domain.state.Result
import com.mg.cleanarchitectureplaygraound.business.domain.state.UseCaseState
import com.mg.cleanarchitectureplaygraound.business.domain.state.UseCaseState.Success
import kotlinx.coroutines.flow.flow

class InsertNewNote(
    private val noteCacheDataSource: NoteCacheDataSource,
    private val networkDataSource: NetworkDataSource,
    private val noteFactory: NoteFactory
) {

    suspend fun insertNewNote(title: String, body: String) = flow {
        val newNote = noteFactory.createNote(title, body)
        noteCacheDataSource.insertNote(newNote)

        val state = Success(
            response = Result(
                message = INSERT_NOTE_SUCCESS
            ),
            data = newNote
        )

        updateNetwork(state, newNote)

        emit(state)
    }

    private suspend fun updateNetwork(state: UseCaseState<Note>, newNote: Note) {
        if (state is Success) {
            networkDataSource.insertOrUpdateNote(newNote)
        }
    }

    companion object {
        private const val INSERT_NOTE_SUCCESS = "Insert note successfully."
    }
}