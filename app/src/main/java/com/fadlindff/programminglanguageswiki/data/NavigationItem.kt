package com.fadlindff.programminglanguageswiki.data

import androidx.compose.ui.graphics.vector.ImageVector

data class NavigationItem(
    val title: String,
    val iconVector: ImageVector,
    val screen: Screen,
)
