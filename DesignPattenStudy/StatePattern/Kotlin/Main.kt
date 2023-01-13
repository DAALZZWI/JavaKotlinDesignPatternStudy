package StatePattern.Kotlin

fun main() {

    val delivery = Delivery()
    println(delivery.status.name)
    println(delivery.forwardStatus())
    println(delivery.forwardStatus())
    println(delivery.backwardStatus())
}

class Delivery {

    var status: DeliveryStatus = Wait
    fun forwardStatus() = status.forward(this)
    fun backwardStatus() = status.backward(this)
}