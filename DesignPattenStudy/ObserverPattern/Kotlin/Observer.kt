package ObserverPattern.Kotlin

interface Publisher {

    fun update(deliveryStatus: String): Boolean
    fun add(subscriber: Subscriber) : Boolean
    fun delete(subscriber: Subscriber) : Boolean
}

interface Subscriber {

    fun onUpdate(deliveryStatus: String): Boolean
}