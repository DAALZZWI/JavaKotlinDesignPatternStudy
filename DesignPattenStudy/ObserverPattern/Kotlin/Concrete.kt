package ObserverPattern.Kotlin

class DeliveryStatusPublisher() : Publisher {

    private val observerList = mutableListOf<Subscriber>()
    private var deliveryStatus = "WAIT"

    override fun update(deliveryStatus: String): Boolean {

        this.deliveryStatus = deliveryStatus
        observerList.forEach { it.onUpdate(deliveryStatus) }
        return true
    }

    override fun add(subscriber: Subscriber): Boolean = observerList.add(subscriber)


    override fun delete(subscriber: Subscriber): Boolean = observerList.remove(subscriber)
}

class DeliveryStatusSubscriber() : Subscriber {

    var isSent = false

    override fun onUpdate(deliveryStatus: String): Boolean {

        if (deliveryStatus == "COMPLETE") {
            sendEmail()
        }
        return true
    }

    fun sendEmail(): Unit {
        isSent = true
    }
}