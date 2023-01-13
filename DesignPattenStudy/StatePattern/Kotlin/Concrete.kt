package StatePattern.Kotlin

object Wait : DeliveryStatus {

    override val name: String = "배차 대기"

    override fun forward(delivery: Delivery): String {

        delivery.status = Assign
        return delivery.status.name
    }

    override fun backward(delivery: Delivery): String {
        return "뒤로 불가"
    }
}
object Assign : DeliveryStatus {

    override val name: String = "배차 완료"

    override fun forward(delivery: Delivery): String {

        delivery.status = Pickup
        return delivery.status.name
    }

    override fun backward(delivery: Delivery): String {

        delivery.status = Wait
        return delivery.status.name
    }
}

object Pickup : DeliveryStatus {

    override val name: String = "픽업 완료"

    override fun forward(delivery: Delivery): String {

        delivery.status = Complete
        return delivery.status.name
    }

    override fun backward(delivery: Delivery): String {

        delivery.status = Assign
        return delivery.status.name
    }
}

object Complete : DeliveryStatus {

    override val name: String ="전달 완료"

    override fun forward(delivery: Delivery): String {

        return "진행불가"
    }

    override fun backward(delivery: Delivery): String {

        delivery.status = Pickup
        return delivery.status.name
    }

}