package com.example.littlelemon.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Card
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.littlelemon.R

@Composable
fun LowerPanel() {
    Column {
        WeeklySpecialCard()
        MenuDish()
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
                .padding(8.dp)
        )
    }
}


@Composable
fun MenuDish() {
    Card {
        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
        ) {
            Column {
                Text(text = stringResource(id = R.string.dish_1),
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(text = stringResource(id = R.string.dish_1_Description),
                    color = Color.Gray,
                    modifier = Modifier
                        .padding(top = 5.dp, bottom = 5.dp)
                        .fillMaxWidth(.75f)
                )
                Text(text = stringResource(id = R.string.dish_1_price),
                    color = Color.Gray,
                    fontWeight = FontWeight.Bold
                )
            }
            Image(painter = painterResource(id = R.drawable.dish_1),
                contentDescription = "",
            )
        }
    }
    Divider(modifier = Modifier.padding(start = 8.dp, end = 8.dp),
        color = Color.LightGray,
        thickness = 1.dp
    )
}

@Preview(showBackground = true)
@Composable
fun LowerPanelPreview(){
    LowerPanel()
}