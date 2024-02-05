package eu.tutorials.chatbot

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import eu.tutorials.chatbot.screen.LoginScreen
import eu.tutorials.chatbot.screen.SignUpScreen
import eu.tutorials.chatbot.viewmodel.AuthViewModel

@Composable
fun NavigationGraph(
    navController: NavHostController,
    authViewModel: AuthViewModel
){
    NavHost(
        navController = navController,
        startDestination = Screen.SignUpScreen.route
    ){
        composable(Screen.SignUpScreen.route) {
            SignUpScreen(
                authViewModel = authViewModel,
                onNavigateToLogin = {
                    navController.navigate(Screen.LoginScreen.route)
                }
            )
        }
        composable(Screen.LoginScreen.route) {
            LoginScreen(
                authViewModel = authViewModel,
                onNavigateToSignUp = {
                    navController.navigate(Screen.SignUpScreen.route)
                }
            ){
                Log.d("TAG","test login success" )
                navController.navigate(Screen.ChatScreen.route)
            }
        }
    }
}


