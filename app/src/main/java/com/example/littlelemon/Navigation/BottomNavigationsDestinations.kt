package com.example.littlelemon.Navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector

interface  BottomNavigationsDestinations{ //For bottom Navigation
    val route: String
    val icon: ImageVector
    val title: String
}

object  Home: BottomNavigationsDestinations{
    override val route = "Home"
    override val icon = Icons.Filled.Home
    override val title = "Home"
}
object Settings: BottomNavigationsDestinations{
    override val route = "Settings"
    override val icon = Icons.Filled.Settings
    override val title = "Settings"
}