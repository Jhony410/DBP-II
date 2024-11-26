package com.cursosant.retos.core.navegation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import androidx.navigation.toRoute
import com.cursosant.retos.ui.theme.LoginScreen
import com.cursosant.retos.ui.theme.HomeScreen
import com.cursosant.retos.ui.theme.DetailsScreen


/* Primer reto
@Composable
fun NavigationWrapper(navController: NavHostController) {
    NavHost(navController = navController, startDestination = Screens.Login.route) {
        composable(Screens.Login.route) {
            LoginScreen { navController.navigate(Screens.Home.route) }
        }
        composable(Screens.Home.route) {
            HomeScreen { navController.navigate(Screens.Details.route) }
        }
        composable(Screens.Details.route) {
            DetailsScreen()
        }
    }
}


// Segundo reto
@Composable
fun NavigationWrapper(navController: NavHostController) {
    NavHost(navController = navController, startDestination = Screens.Login.route) {
        composable(Screens.Login.route) {
            LoginScreen { name ->
                navController.navigate(Screens.Home.createRoute(name))
            }
        }
        composable(
            route = Screens.Home.route,
            arguments = listOf(navArgument("name") { type = NavType.StringType })
        ) { backStackEntry ->
            val name = backStackEntry.arguments?.getString("name").orEmpty()
            HomeScreen(name) { navController.navigate(Screens.Details.createRoute(name)) }
        }
        composable(
            route = Screens.Details.route,
            arguments = listOf(navArgument("name") { type = NavType.StringType })
        ) { backStackEntry ->
            val name = backStackEntry.arguments?.getString("name").orEmpty()
            DetailsScreen(name)
        }
    }
}
*/

// Tercer reto
@Composable
fun NavigationWrapper(navController: NavHostController) {
    NavHost(navController = navController, startDestination = Screens.Login.route) {
        composable(Screens.Login.route) {
            LoginScreen { name ->
                navController.navigate(Screens.Home.createRoute(name))
            }
        }
        composable(
            route = Screens.Home.route,
            arguments = listOf(navArgument("name") { type = NavType.StringType })
        ) { backStackEntry ->
            val name = backStackEntry.arguments?.getString("name").orEmpty()
            HomeScreen(name,
                onNavigateToDetails = { navController.navigate(Screens.Details.createRoute(name)) },
                onNavigateBack = { navController.navigateUp() }
            )
        }
        composable(
            route = Screens.Details.route,
            arguments = listOf(navArgument("name") { type = NavType.StringType })
        ) { backStackEntry ->
            val name = backStackEntry.arguments?.getString("name").orEmpty()
            DetailsScreen(name) { navController.navigateUp() }
        }
    }
}