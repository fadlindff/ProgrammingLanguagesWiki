package com.fadlindff.programminglanguageswiki.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class ViewModelFactory : ViewModelProvider.NewInstanceFactory() {
    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(ProgrammingLanguageViewModel::class.java))
            return ProgrammingLanguageViewModel() as T

        throw IllegalArgumentException("Unknown ViewModel class: " + modelClass.name)
    }
}