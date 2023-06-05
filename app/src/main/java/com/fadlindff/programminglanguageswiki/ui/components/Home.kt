package com.fadlindff.programminglanguageswiki.ui.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.fadlindff.programminglanguageswiki.viewmodels.ProgrammingLanguageViewModel
import com.fadlindff.programminglanguageswiki.viewmodels.ViewModelFactory

@Composable
fun Home(
    programmingLanguageViewModel: ProgrammingLanguageViewModel = viewModel(factory = ViewModelFactory()),
    navigateToDetailRoute: (Int) -> Unit
) {
    val programmingLanguages by programmingLanguageViewModel.programmingLanguages.collectAsState()
    val query by programmingLanguageViewModel.query

    LazyColumn(
        modifier = Modifier.fillMaxWidth(),
        contentPadding = PaddingValues(16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        item {
            SearchBar(
                query = query,
                onQueryChange = programmingLanguageViewModel::search
            )
        }
        items(
            programmingLanguages,
            key = { it.id }
        ) { programmingLanguage ->
            ListItem(
                item = programmingLanguage,
                modifier = Modifier.clickable {
                    navigateToDetailRoute(programmingLanguage.id)
                }
            )
        }
    }
}

@Preview(
    showBackground = true,
    device = Devices.PIXEL_4
)
@Composable
fun HomePreview() {
    Home(navigateToDetailRoute = {  })
}