package com.example.littlelemon
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp


class Login: ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState);


        setContent {

            Surface(
                modifier = Modifier.fillMaxSize(),
                color = MaterialTheme.colors.background
            ) {
                LoginScreen()
            }

        }
    }
    @Composable
    fun LoginScreen() {
        val context = LocalContext.current
        var username by remember {
            mutableStateOf(TextFieldValue(""))
        }
        var password by remember {
            mutableStateOf(TextFieldValue(""))
        }
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Image(
                painter = painterResource(
                    id = R.drawable.logo
                ),
                contentDescription = "Logo Image",
                modifier = Modifier.padding(10.dp)
            )
            TextField(
                value = username,
                onValueChange = {
                    username = it
                },
                label = { Text(text = "Username") },
                modifier = Modifier.padding(10.dp)
            )
            TextField(
                value = password,
                onValueChange = {
                    password = it
                },
                label = { Text(text = "Password") },
                visualTransformation = PasswordVisualTransformation(),
                modifier = Modifier.padding(10.dp),
            )
            Button(
                onClick = {
                    Log.d("AAA", "${username.text}")
                    Log.d("AAA", "${password.text}")
                    if (username.text == "Ketan"
                        && password.text == "123"
                    ) {
                        Toast.makeText(
                            context,
                            "Welcome to Little Lemon!",
                            Toast.LENGTH_LONG
                        ).show()

                    } else {
                        Toast.makeText(
                            context,
                            "Invalid credentials."
                                    + "Please try again.",
                            Toast.LENGTH_LONG
                        ).show()
                    }

                },
                colors = ButtonDefaults.buttonColors(
                    Color(0xFF495E57)
                ),
                modifier = Modifier.padding(10.dp)
            ) {
                Text(
                    text = "Login",
                    color = Color(0xFFEDEFEE)
                )
            }
        }
    }
}


