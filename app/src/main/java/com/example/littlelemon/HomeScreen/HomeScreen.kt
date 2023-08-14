package com.example.littlelemon.ui.theme

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.littlelemon.Data.Categories
import com.example.littlelemon.Data.DishRepository
import com.example.littlelemon.DrawerPanel
import com.example.littlelemon.LowerPanel
import com.example.littlelemon.TopAppBar

@Composable
fun HomeScreen(navController: NavHostController) {


    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ){
        Text(text = "Home Screen",
        fontSize = 48.sp,
        )
    }
    val  scaffoldState = rememberScaffoldState()
    val scope = rememberCoroutineScope()
    Scaffold(
        scaffoldState = scaffoldState,
        drawerContent = { DrawerPanel(scaffoldState = scaffoldState,scope = scope) },
        topBar = {
            TopAppBar(scaffoldState, scope )
        }
    ) {



        Column {

            UpperPanel()

           LazyRow{

         items(Categories){
             category->
             MenuCategory(category = category)

            }

            }
            LowerPanel(navController, DishRepository.dishes)
        }
    }
}