package com.example.littlelemon.ui.theme

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.littlelemon.DrawerPanel
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
            Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly){
                categories.forEach{
                   MenuCategory(category = it)
                }

            }
            LowerPanel()
        }
    }
}