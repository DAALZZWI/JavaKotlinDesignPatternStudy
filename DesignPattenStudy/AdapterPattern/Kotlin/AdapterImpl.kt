package AdapterPattern.Kotlin

class AdapterImpl : Adapter {

    override fun twiceOf(f: Float): Float {

        return Math.twiceOf(f.toDouble()).toFloat()
    }

    override fun halfOf(f: Float): Float {

        return Math.halfOf(f.toDouble()).toFloat()
    }
}