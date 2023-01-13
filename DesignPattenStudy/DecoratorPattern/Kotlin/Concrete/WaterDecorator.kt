package DecoratorPattern.Kotlin.Concrete

import DecoratorPattern.Kotlin.Astract.Component
import DecoratorPattern.Kotlin.Astract.Decorator

class WaterDecorator(override val component: Component) : Decorator(component) {

    override fun addPrice(): Int = super.addPrice() + EspressoDecorator(BaseComponent()).addPrice() + 500

    override fun showItem(): String = "${super.showItem()} + Water : Americano"
}