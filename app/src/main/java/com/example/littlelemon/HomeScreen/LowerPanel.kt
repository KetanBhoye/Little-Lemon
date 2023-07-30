package com.example.littlelemon.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Card
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.littlelemon.Data.Dish
import com.example.littlelemon.Data.dishes


@Composable
fun LowerPanel() {
    Column {
        WeeklySpecialCard()

        LazyColumn(modifier = Modifier.padding(8.dp)){
            items(dishes){
                    Dish->
                MenuDish(Dish)
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


@Composable
fun MenuDish(Dish: Dish) {
    Card {
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
                Text(text = Dish.price,
                    fontWeight = FontWeight.Bold,
                    color = LittleLemonColor.green
                )
            }
            Image(painter = painterResource(id = Dish.image),
                contentDescription = "",
            )
        }
    }
    Divider(modifier = Modifier.padding(start = 8.dp, end = 8.dp),
        color = LittleLemonColor.yellow,
        thickness = 1.dp

    )
}

@Preview(showBackground = true)
@Composable
fun LowerPanelPreview(){
    LowerPanel()
}