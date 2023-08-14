package com.example.littlelemon



interface  Destinations{
    val route:String
}
object  HomeScreen: Destinations{
    override  val route = "HomeScreen"
}
object  LoginScreen: Destinations{
    override val route = "LoginScreen"
}
object DishDetails : Destinations {
    override val route = "Menu"
    const val argDishId = "dishId"
}




