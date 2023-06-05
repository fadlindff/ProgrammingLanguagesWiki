package com.fadlindff.programminglanguageswiki

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.fadlindff.programminglanguageswiki.ui.screen.MainScreen
import com.fadlindff.programminglanguageswiki.ui.theme.ProgrammingLanguagesWikiTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ProgrammingLanguagesWikiTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    StartNavigation()
                }
            }
        }
    }
}

object Destination {
    const val MAIN_SCREEN = "main_screen"
}

@Composable
fun StartNavigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Destination.MAIN_SCREEN, modifier = Modifier)
    {
        composable(
            route = Destination.MAIN_SCREEN
        ) {
            MainScreen()
        }
    }
}