package DecoratorPattern.Kotlin.Concrete

import DecoratorPattern.Kotlin.Astract.Component
import DecoratorPattern.Kotlin.Astract.Decorator

class IceDecorator(override val component: Component) : Decorator(component) {

    override fun addPrice(): Int = super.addPrice() + EspressoDecorator(BaseComponent()).addPrice() + 1000

    override fun showItem(): String = "${super.showItem()} + Ice : CoffeeIceBlended"
}