package com.example.littlelemon

interface  Destinations{
    val route:String
}
object  Dashboard: Destinations{
    override  val route = "Home"
}
object  Destination: Destinations{
    override val route = "Details"
}
