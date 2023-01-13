package AdapterPattern.Kotlin

fun main(args: Array<String>) {

    val adapter: Adapter = AdapterImpl()

    println(adapter.twiceOf(100f))
    println(adapter.halfOf(100f))
}