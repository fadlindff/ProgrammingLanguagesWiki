package com.fadlindff.programminglanguageswiki.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.fadlindff.programminglanguageswiki.R
import com.fadlindff.programminglanguageswiki.data.ProgrammingLanguageModel
import com.fadlindff.programminglanguageswiki.ui.theme.Blue

@Composable
fun ListItem(
    item: ProgrammingLanguageModel,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = Modifier.fillMaxWidth()
    ) {
        Image(
            painter = painterResource(id = item.image),
            contentDescription = null,
            contentScale = ContentScale.Inside,
            modifier = Modifier
                .size(
                    width = 125.dp,
                    height = 175.dp,
                ),
        )
        Column(
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                text = item.name,
                modifier = Modifier.padding(12.dp),
                style = MaterialTheme.typography.h5.copy(
                    fontWeight = FontWeight.SemiBold
                )
            )
            Text(
                text = item.inventor,
                modifier = Modifier.padding(12.dp),
                fontSize = 16.sp,
                style = MaterialTheme.typography.caption
            )
            Text(
                text = stringResource(id = R.string.read_more),
                modifier = modifier.padding(12.dp),
                color = Blue,
                fontWeight = FontWeight.Bold,
            )
        }
    }
}

@Preview(
    showBackground = true,
    device = Devices.PIXEL_4
)
@Composable
fun ListItemPreview() {
    val dummyProgrammingLanguage = ProgrammingLanguageModel(
        10,
        "C++",
        "Bjarne Stroustrup",
        "C++ adalah bahasa pemrograman komputer yang dibuat oleh Bjarne Stroustrup, yang merupakan perkembangan dari bahasa C",
        R.drawable.c_plus_plus
    )
    ListItem(item = dummyProgrammingLanguage)
}