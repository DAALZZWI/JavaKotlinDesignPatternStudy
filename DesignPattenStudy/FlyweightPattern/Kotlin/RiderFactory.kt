package FlyweightPattern.Kotlin

class RiderFactory {

    private val riderMap = mutableMapOf<String, Rider>()

    fun getRider(center: String, type: String): String =

            if(riderMap.containsKey(type)) getInstance(type) else when (type) {

                "FullTimeRider" -> {
                    setInstance(type, FullTimeRider(center))
                }
                "PartTimeRider" -> {
                    setInstance(type, PartTimeRider(center))
                }
                else -> "배달원 없습니다."
            }

    private fun getInstance(type: String): String {
        println("> 이미 생성 되었습니다")
        return riderMap.getValue(type).delivery()
    }

    private fun setInstance(type: String, rider: Rider): String {

        println("> 생성 되었습니다")
        riderMap[type] = rider
        return riderMap.getValue(type).delivery()
    }
}