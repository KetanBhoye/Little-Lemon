package com.example.littlelemon.ui.theme

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Card
import androidx.compose.material.Divider
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.littlelemon.Data.Dish
import com.example.littlelemon.DishDetails


@Composable
fun LowerPanel(navController: NavHostController, dishes: List<Dish> = listOf()) {
    Column {
        WeeklySpecialCard()

        LazyColumn(modifier = Modifier.padding(8.dp)){
            items(dishes){
                    Dish->
                MenuDish(navController,Dish)
            }
        }
    }
}


@Composable
fun WeeklySpecialCard(){
    Card(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Text(
            text = "Weekly Special",
            fontSize = 26.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(8.dp),
            color = LittleLemonColor.charcoal
        )
    }
}


@OptIn(ExperimentalMaterialApi::class)
@Composable
fun MenuDish(navController: NavHostController? = null, Dish: Dish) {
    Card(
        onClick = {
            Log.d("AAA", "Click ${Dish.id}")
            navController?.navigate(DishDetails.route + "/${Dish.id}")
        }
    ){
        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
        ) {
            Column {
                Text(text = Dish.name,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    color = LittleLemonColor.charcoal
                )
                Text(text = Dish.description,
                    modifier = Modifier
                        .padding(top = 5.dp, bottom = 5.dp)
                        .fillMaxWidth(.75f),
                    color = LittleLemonColor.green
                )
                Text(text = "${Dish.price}",
                    fontWeight = FontWeight.Bold,
                    color = LittleLemonColor.green
                )
            }
            Image(painter = painterResource(id = Dish.imageResource),
                contentDescription = "",
            )
        }
    }
    Divider(modifier = Modifier.padding(start = 8.dp, end = 8.dp),
        color = LittleLemonColor.yellow,
        thickness = 1.dp

    )
}

