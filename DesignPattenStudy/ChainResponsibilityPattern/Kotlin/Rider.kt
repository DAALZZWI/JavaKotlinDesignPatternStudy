package ChainResponsibilityPattern.Kotlin

interface Rider {

    fun delivery(foodType: String): String
}

class FullTimeRider(private val next: Rider? = null) : Rider {

    override fun delivery(foodType: String): String =
        if(foodType == "양식") "양식배달" else next!!.delivery(foodType)
}

class PartTimeRider(private val next: Rider? = null) : Rider {

    override fun delivery(foodType: String): String =
        if(foodType == "한식") "한식배달" else next!!.delivery(foodType)
}

class ConnectRider(private val next: Rider? = null) : Rider {

    override fun delivery(foodType: String): String =
        if(foodType == "분식") "분식배달" else next!!.delivery(foodType)
}