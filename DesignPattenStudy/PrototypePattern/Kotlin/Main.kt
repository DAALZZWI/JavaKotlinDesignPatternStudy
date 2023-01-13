package PrototypePattern.Kotlin

fun main(args: Array<String>) {

    val circle1: Circle = Circle(1,1,3,20)
    val circle2: Circle = circle1.copy()

    println("${circle1.x}, ${circle1.y}, ${circle1.r}")

    println("${circle2.x}, ${circle2.y}, ${circle2.r}")
}