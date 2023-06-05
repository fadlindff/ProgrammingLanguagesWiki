package com.fadlindff.programminglanguageswiki.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.fadlindff.programminglanguageswiki.viewmodels.ProgrammingLanguageViewModel
import com.fadlindff.programminglanguageswiki.viewmodels.ViewModelFactory

@Composable
fun DetailScreen(
    modifier: Modifier = Modifier,
    programmingLanguageId: Int,
    programmingLanguageViewModel: ProgrammingLanguageViewModel = viewModel(
        factory = ViewModelFactory()
    ),
    navigateBack: () -> Unit,
) {
    val programmingLanguages by programmingLanguageViewModel.programmingLanguages.collectAsState()
    val programmingLanguage = programmingLanguages.first {
        it.id == programmingLanguageId
    }

    Column(
        modifier = modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = programmingLanguage.image),
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = modifier
                .size(height = 200.dp, width = 250.dp)
        )

        Text(
            text = programmingLanguage.name,
            modifier = modifier
                .padding(top = 8.dp),
            style = MaterialTheme.typography.h4
        )
        Text(
            text = programmingLanguage.inventor,
            fontSize = 20.sp,
            modifier = modifier
                .padding(8.dp),
        )
        Text(
            text = programmingLanguage.description,
            fontSize = 16.sp,
            modifier = modifier
                .padding(horizontal = 16.dp, vertical = 12.dp),
        )
    }
}

@Preview(
    showBackground = true
)
@Composable
fun DetailScreenPreview() {
    DetailScreen(
        programmingLanguageId = 1, navigateBack = {  }
    )
}