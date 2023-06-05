package com.fadlindff.programminglanguageswiki.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.fadlindff.programminglanguageswiki.R

@Composable
fun AboutScreen(
    modifier: Modifier = Modifier
) {
    Column(
         modifier = modifier
             .fillMaxSize()
             .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = stringResource(id = R.string.about_me),
            modifier = modifier.padding(bottom = 12.dp),
            style = MaterialTheme.typography.h4
        )
        Image(
            painter = painterResource(id = R.drawable.foto_profil),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = modifier
                .clip(CircleShape)
                .size(175.dp)
        )
        Text(
            text = "Fadlin Azhary",
            style = MaterialTheme.typography.h5,
            modifier = modifier
                .padding(top = 12.dp)
        )
        Text(
            text = "fadlinsiregar@gmail.com",
            fontSize = 16.sp,
            style = MaterialTheme.typography.caption,
            modifier = modifier
                .padding(top = 12.dp)
        )
    }
}

@Preview(
    showBackground = true
)
@Composable
fun AboutScreenPreview() {
    AboutScreen()
}