package ObserverPattern.Kotlin


fun main() {

    var list = DeliveryStatusPublisher()
    var user1 = DeliveryStatusSubscriber()
    var user2 = DeliveryStatusSubscriber()

    list.add(user1)
    list.add(user2)

    list.update("CONNECTING")
//    list.update("COMPLETE")

    println(user1.isSent)
}