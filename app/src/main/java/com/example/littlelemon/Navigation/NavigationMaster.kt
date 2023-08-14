package com.example.littlelemon.Navigation

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.littlelemon.DishDetails
import com.example.littlelemon.LoginScreen
import com.example.littlelemon.SettingsScreen.SettingsScreen
import com.example.littlelemon.ui.theme.HomeScreen

@Composable
fun NavigationMaster(){
   val navController = rememberNavController()

        NavHost(navController = navController, startDestination = LoginScreen.route){

            composable(LoginScreen.route){
                LoginScreen(navController = navController)
            }
            composable(Home.route){
                HomeScreen(navController = navController)
            }
//            composable(Settings.route){
//                SettingsScreen()
//            }
            composable(
                DishDetails.route + "/{${DishDetails.argDishId}}",
                arguments = listOf(navArgument(DishDetails.argDishId) { type = NavType.IntType })
            ) {
                val id = requireNotNull(it.arguments?.getInt(DishDetails.argDishId)) { "Dish id is null" }
                DishDetails(id)
            }
        }
    }


//@Composable
//fun MyBottomNavigation(navController: NavController){
//    val destinationList = listOf<BottomNavigationsDestinations>(
//        Home,
//        Settings
//    )
//    val selectedIndex = rememberSaveable {
//        mutableStateOf(0)
//    }
//    BottomNavigation {
//        destinationList.forEachIndexed{index, destination ->BottomNavigationItem(label = { Text(
//            text = destination.title)},
//            icon = { Icon(imageVector = destination.icon,
//                contentDescription = destination.title)},
//            selected = index == selectedIndex.value,
//            onClick = {
//                selectedIndex.value =index
//                navController.navigate(destinationList[index].route){
//                    popUpTo(Home.route)
//                    launchSingleTop = true
//                }
//            } )}
//    }
//}
