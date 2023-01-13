package VisitorPattern.Kotlin

fun main() {

    val totalRiderTask = TotalRiderTask()
    val fullTimeRider = FullTimeRider()
    val partTimeRider = PartTimeRider()

    println(totalRiderTask.doTask(fullTimeRider))
    println(totalRiderTask.doTask(partTimeRider))
}
