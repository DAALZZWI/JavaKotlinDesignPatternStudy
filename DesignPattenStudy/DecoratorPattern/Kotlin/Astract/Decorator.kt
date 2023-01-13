package DecoratorPattern.Kotlin.Astract

abstract class Decorator(open val component: Component) : Component {

    override fun addPrice(): Int = component.addPrice()

    override fun showItem(): String = component.showItem()
}