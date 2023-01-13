package SingletonPattern.Kotlin

class SystemSpeaker() {

    private var volume: Int? = null

    init {

        volume = 0
    }

    companion object {

        @Volatile
        private var instance: SystemSpeaker? = null

        fun getInstance(): SystemSpeaker {

            return instance ?: synchronized(SystemSpeaker::class.java) {
                instance ?: SystemSpeaker().also {

                    instance = it
                }
            }
        }
    }

    fun getVolume(): Int? {

        return volume
    }

    fun setVolume(vol: Int): Unit {

        this.volume = vol
    }
}