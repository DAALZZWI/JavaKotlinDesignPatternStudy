package FlyweightPattern.Kotlin

interface Rider {

    val center: String
    fun delivery(): String
}

class FullTimeRider(override val center: String) : Rider {

    override fun delivery(): String = "${center} 오토바이 배달"
}

class PartTimeRider(override val center: String) : Rider {

    override fun delivery(): String = "${center} 자전거 배달"
}