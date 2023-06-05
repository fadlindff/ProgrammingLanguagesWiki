package com.fadlindff.programminglanguageswiki.ui.screen

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.fadlindff.programminglanguageswiki.ui.components.BottomNavigationBar
import com.fadlindff.programminglanguageswiki.data.Screen

@Composable
fun MainScreen(
    modifier: Modifier = Modifier,
    navHostController: NavHostController = rememberNavController()
) {
    Scaffold(
        bottomBar = { BottomNavigationBar(navController = navHostController) }
    ) { innerPadding ->
        NavHost(
            navController = navHostController,
            startDestination = Screen.Home.route,
            modifier = modifier.padding(innerPadding)
        ) {
            composable(Screen.Home.route) {
                HomeScreen(
                    navigateToDetailRoute = { programmingLanguageId ->
                        navHostController.navigate(Screen.Detail.makeRoute(programmingLanguageId))
                    }
                )
            }
            composable(Screen.About.route) {
                AboutScreen()
            }
            composable(
                route = Screen.Detail.route,
                arguments = listOf(navArgument("programmingLanguageId") { type = NavType.IntType })
            ) {
                val id = it.arguments?.getInt("programmingLanguageId") ?: -1
                DetailScreen(
                    programmingLanguageId = id,
                    navigateBack = {
                        navHostController.navigateUp()
                    }
                )
            }
        }
    }
}

@Preview
@Composable
fun MainScreenPreview() {
    MainScreen()
}