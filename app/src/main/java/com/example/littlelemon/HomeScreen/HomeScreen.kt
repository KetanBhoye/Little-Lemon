package com.example.littlelemon.ui.theme

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Scaffold
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import com.example.littlelemon.DrawerPanel
import com.example.littlelemon.TopAppBar

@Composable
fun HomeScreen(){
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
            LowerPanel()
        }
    }
}