package ProxyPattern.Kotlin

class FullTimeRider(var name: String) : Rider {

    override fun delivery(): String = "음식 배달"

    override fun getPersonInfo(level: Int): String? = name
}