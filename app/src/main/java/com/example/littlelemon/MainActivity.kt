package com.example.littlelemon

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.ui.platform.LocalContext
import com.example.littlelemon.ui.theme.LowerPanel
import com.example.littlelemon.ui.theme.UpperPanel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            val context = LocalContext.current
            Column() {

                UpperPanel()
                LowerPanel()

            }

        }
    }


}
