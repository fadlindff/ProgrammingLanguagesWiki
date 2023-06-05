package com.fadlindff.programminglanguageswiki.ui.components

import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.rounded.Info
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.NavGraph.Companion.findStartDestination
import com.fadlindff.programminglanguageswiki.R
import com.fadlindff.programminglanguageswiki.data.NavigationItem
import com.fadlindff.programminglanguageswiki.data.Screen

@Composable
fun BottomNavigationBar(
    navController: NavController,
    modifier: Modifier = Modifier
) {
    BottomNavigation(modifier = modifier) {
        val navigationItems = listOf(
            NavigationItem(
                title = stringResource(id = R.string.home),
                iconVector = Icons.Rounded.Home,
                screen = Screen.Home
            ),
            NavigationItem(
                title = stringResource(id = R.string.about),
                iconVector = Icons.Rounded.Info,
                screen = Screen.About
            )
        )
        BottomNavigation {
            navigationItems.map { navigationItem ->
                BottomNavigationItem(
                    icon = {
                           Icon(
                               imageVector = navigationItem.iconVector,
                               contentDescription = navigationItem.title
                           )
                    },
                    label = { Text(text = navigationItem.title) },
                    selected = true,
                    onClick = {
                          navController
                              .navigate(navigationItem.screen.route) {
                                  popUpTo(navController.graph.findStartDestination().id) {
                                      saveState = true
                                  }
                                  restoreState = true
                                  launchSingleTop = true
                              }
                    },
                )
            }
        }
    }
}

@Preview
@Composable
fun BottomNavigationBarPreview() {
    BottomNavigation() {
        
    }
}