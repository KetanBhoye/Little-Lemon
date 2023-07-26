package com.example.littlelemon



interface  Destinations{
    val route:String
}
object  HomeScreen: Destinations{
    override  val route = "Login"
}
object  LoginScreen: Destinations{
    override val route = "HomeScreen"
}




