package com.fadlindff.programminglanguageswiki.ui.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.fadlindff.programminglanguageswiki.ui.components.Home

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier,
    navigateToDetailRoute: (Int) -> Unit
) {
    Column {
        Spacer(modifier = modifier.height(12.dp))
        Home(navigateToDetailRoute = navigateToDetailRoute)
    }
}