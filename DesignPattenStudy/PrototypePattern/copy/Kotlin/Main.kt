package PrototypePattern.copy.Kotlin

fun main(args: Array<String>) {

    var navi: Cat = Cat("navi", Age(1995, 28))
    var yaong: Cat = navi.copy()

    yaong.name = "yaong"
    yaong.age?.year = 1996
    yaong.age?.value = 27

    println("${navi.name}, ${navi.age?.year}, ${navi.age?.value}")
    println("${yaong.name}, ${yaong.age?.year}, ${yaong.age?.value}")
}