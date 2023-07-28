package com.example.littlelemon

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.littlelemon.Experiment.MenuGrid
import com.example.littlelemon.Experiment.data.MenuListScreen
import com.example.littlelemon.Navigation.MyNavigation
import com.example.littlelemon.Navigation.NavigationMaster

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
             NavigationMaster()
        }
    }



}


