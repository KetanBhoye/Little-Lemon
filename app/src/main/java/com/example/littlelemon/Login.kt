package com.example.littlelemon

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class Login: ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState);
        setContent {
         LoginScreen()
        }
    }
    @Composable
    fun LoginScreen(){
  Column(Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center,
  horizontalAlignment = Alignment.CenterHorizontally) {
      Image(painter = painterResource(id = R.drawable.logo), contentDescription = "logo image")
      TextField(value = "", onValueChange = {}, label = { Text(text = "Username")})
      TextField(value = "", onValueChange = {}, label = {Text(text = "Password")})
      Button(onClick = { /*TODO*/ }, modifier = Modifier.padding(10.dp), colors = ButtonDefaults.buttonColors(backgroundColor = Color( 0xFF495E57)),  ) {
          Text(text = "Login", color = Color(0xFFEDEFEE))

      }

  }
    }
    @Preview(showBackground = true)
    @Composable
    fun LoginScreenPreview(){
        LoginScreen()
    }
}