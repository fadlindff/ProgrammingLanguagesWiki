package com.fadlindff.programminglanguageswiki.viewmodels

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.fadlindff.programminglanguageswiki.data.ProgrammingLanguageData
import com.fadlindff.programminglanguageswiki.data.ProgrammingLanguageModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class ProgrammingLanguageViewModel : ViewModel() {
    private val _programmingLanguages = MutableStateFlow(
        getProgrammingLanguages()
    )

    private val _query : MutableState<String> = mutableStateOf("")
    val query : State<String> = _query

    val programmingLanguages: StateFlow<List<ProgrammingLanguageModel>> = _programmingLanguages

    private fun getProgrammingLanguages(): List<ProgrammingLanguageModel> =
        ProgrammingLanguageData.getProgrammingLanguageList()

    private fun getProgrammingLanguagesOnQuery(query: String) : List<ProgrammingLanguageModel> =
        ProgrammingLanguageData.getProgrammingLanguageList().filter {
            it.name.contains(query, ignoreCase = true)
        }

    fun search(newQuery: String) {
        _query.value = newQuery
        _programmingLanguages.value = getProgrammingLanguagesOnQuery(_query.value)
    }
}