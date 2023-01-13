package SingletonPattern.Kotlin

fun main(args: Array<String>) {

    // companion object 사용
    println(SystemSpeaker.getInstance().getVolume())

    var instance1: SystemSpeaker = SystemSpeaker.getInstance()
    var instance2: SystemSpeaker = SystemSpeaker.getInstance()

    println(instance1)
    println(instance2)

    instance1.setVolume(5)
    println(instance1.getVolume())
    println(instance1.getVolume())

    instance1.setVolume(11)
    println(instance1.getVolume())
    println(instance1.getVolume())

    instance2.setVolume(10)
    println(instance1.getVolume())
    println(instance1.getVolume())

    // object 사용
    SystemSpeakers.printMsg("hello")
}