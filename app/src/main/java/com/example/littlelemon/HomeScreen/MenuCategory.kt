package com.example.littlelemon.ui.theme

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun MenuCategory(category: String){
    Button(onClick = {  },
        colors = ButtonDefaults.buttonColors(backgroundColor =Color.LightGray),
        shape = RoundedCornerShape(40),
    modifier = Modifier.padding(5.dp),
    ) {
        Text(text = category, fontWeight = FontWeight.Bold)

    }
}
@Preview(showBackground = true)
@Composable
fun MenuCategoryPreview(){
    MenuCategory(category = "Category")
}
val categories = listOf<String>(
    "Lunch",
    "Dessert",
    "Mains",
    "Beverages"
)