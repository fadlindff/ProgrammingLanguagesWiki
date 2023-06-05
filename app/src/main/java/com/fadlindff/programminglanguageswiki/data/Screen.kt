package com.fadlindff.programminglanguageswiki.data

sealed class Screen(
    val route: String
) {
    object Home: Screen("home")
    object About: Screen("about_me")
    object Detail: Screen("home/{programmingLanguageId}") {
        fun makeRoute(programmingLanguageId : Int) = "home/$programmingLanguageId"
    }
}
