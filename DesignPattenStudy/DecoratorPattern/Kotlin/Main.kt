package DecoratorPattern.Kotlin

import DecoratorPattern.Kotlin.Astract.Component
import DecoratorPattern.Kotlin.Astract.Decorator
import DecoratorPattern.Kotlin.Concrete.*
import java.util.*

fun main() {

    lateinit var component: Component
    val scanner: Scanner = Scanner(System.`in`)
    var loop = true

    val name: String by lazy { "hello" }

    while (loop == true) {
        println("Select your Beverage")
        println("1, Espresso")
        println("2, Americano")
        println("3, CoffeeLatte")
        println("4, CoffeeIceBlended")
        var selectedNumber = scanner.nextInt()

        when (selectedNumber) {
            1 -> {
                component = EspressoDecorator(BaseComponent())
            }

            2 -> {
                component = WaterDecorator(BaseComponent())
            }

            3 -> {
                component = MilkDecorator(BaseComponent())
            }

            4 -> {
                component = IceDecorator(BaseComponent())
            }

            else -> {
                println("Program Terminate")
                component = BaseComponent()
                loop = false
            }
        }
        println(component.showItem() + " = " + component.addPrice() + " Won")
    }

}