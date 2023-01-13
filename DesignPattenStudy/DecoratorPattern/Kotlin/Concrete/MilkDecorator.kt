package DecoratorPattern.Kotlin.Concrete

import DecoratorPattern.Kotlin.Astract.Component
import DecoratorPattern.Kotlin.Astract.Decorator

class MilkDecorator(override val component: Component) : Decorator(component) {

    override fun addPrice(): Int = super.addPrice() + EspressoDecorator(BaseComponent()).addPrice() + 2000

    override fun showItem(): String = "${super.showItem()} + Milk : CoffeeLatte"
}