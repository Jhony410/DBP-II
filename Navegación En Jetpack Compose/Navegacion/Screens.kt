package com.cursosant.retos.core.navegation

import kotlinx.serialization.Serializable

@Serializable
object Login

@Serializable
object Home

/* Primer reto
sealed class Screens(val route: String) {
    object Login : Screens("login_screen")
    object Home : Screens("home_screen")
    object Details : Screens("details_screen")
}
*/

// Segundo y Tercer reto
sealed class Screens(val route: String) {
    object Login : Screens("login_screen")
    object Home : Screens("home_screen/{name}") {
        fun createRoute(name: String) = "home_screen/$name"
    }
    object Details : Screens("details_screen/{name}") {
        fun createRoute(name: String) = "details_screen/$name"
    }
}















