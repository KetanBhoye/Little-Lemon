package com.example.littlelemon

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.Scaffold
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.tooling.preview.Preview

import com.example.littlelemon.ui.theme.LowerPanel
import com.example.littlelemon.ui.theme.UpperPanel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {

    HomeScreen()

        }
    }

  @Composable
  fun HomeScreen(){
      val  scaffoldState = rememberScaffoldState()
      val scope = rememberCoroutineScope()
      Scaffold(
          scaffoldState = scaffoldState,
          drawerContent = { DrawerPanel(scaffoldState = scaffoldState,scope = scope)},
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

}


