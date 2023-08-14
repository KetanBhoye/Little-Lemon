package com.example.littlelemon

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.IconButton
import androidx.compose.material.ScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch


@Composable
    fun TopAppBar(scaffoldState: ScaffoldState?= null, scope: CoroutineScope?=null){
        Row(horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically) {
            IconButton(onClick = {
                scope?.launch{scaffoldState?.drawerState?.open() }
            }) {
                Image(
                    painter = painterResource(id = R.drawable.menu),
                    contentDescription = "Menu Icon",
                    modifier = Modifier.size(30.dp)
                )
            }
                Image(painter = painterResource(id = R.drawable.topbar_logo) ,
                    contentDescription ="Top appbar logo",
                    Modifier
                        .fillMaxWidth(0.5F)
                        .padding(7.dp)
                        .scale(1.3F)
                       )
            IconButton(onClick = { /*TODO*/ }) {
                Image(
                    painter = painterResource(id = R.drawable.cart),
                    contentDescription = "cart",
                    modifier = Modifier.size(30.dp)
                )

            }
        }
    }


@Preview(showBackground = true)
@Composable
fun TopAppBarPreview(){
  TopAppBar()

}
