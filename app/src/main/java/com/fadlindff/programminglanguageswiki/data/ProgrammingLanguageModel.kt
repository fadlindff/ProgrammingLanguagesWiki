package com.fadlindff.programminglanguageswiki.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class ProgrammingLanguageModel(
    val id: Int,
    val name: String,
    val inventor: String,
    val description: String,
    val image: Int,
): Parcelable