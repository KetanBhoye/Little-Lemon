package com.example.littlelemon.Data

import com.example.littlelemon.R

data class Dish(
    val name:String,
    val price:String,
    val description: String,
    val image: Int
)



val dishes= listOf<Dish>(

    Dish("Greek Salad","$12.99","The famous greek salad of crispy lettuce, peppers, olives, our Chicago ..", R.drawable.dish_1),
    Dish("Bruschetta","$5.99","Our Bruschetta is made from grilled bread that has been smeared with garlic.", R.drawable.bruschetta),
    Dish("Lemon Dessert","$9.99","This come straight from grandma recipe book, every last ingredient has...", R.drawable.lemondessert),
    Dish("Greek Salad","$12.99","The famous greek salad of crispy lettuce, peppers, olives, our Chicago ..", R.drawable.dish_1),
    Dish("Bruschetta","$5.99","Our Bruschetta is made from grilled bread that has been smeared with garlic.", R.drawable.bruschetta),
    Dish("Lemon Dessert","$9.99","This come straight from grandma recipe book, every last ingredient has...", R.drawable.lemondessert),
    Dish("Greek Salad","$12.99","The famous greek salad of crispy lettuce, peppers, olives, our Chicago ..", R.drawable.dish_1),
    Dish("Bruschetta","$5.99","Our Bruschetta is made from grilled bread that has been smeared with garlic.", R.drawable.bruschetta),
    Dish("Lemon Dessert","$9.99","This come straight from grandma recipe book, every last ingredient has...", R.drawable.lemondessert)




)