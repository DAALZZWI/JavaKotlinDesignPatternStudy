package ProxyPattern.Kotlin

class ProxyRider(var name: String) : Rider {

    private var fullTimeRider: FullTimeRider? = null

    override fun delivery(): String =
            (fullTimeRider ?: FullTimeRider(name)).delivery()

    override fun getPersonInfo(level: Int): String? = name
}