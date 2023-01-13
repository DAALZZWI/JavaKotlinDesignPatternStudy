package KotlinStudy.StandardFunction.Let

import kotlin.contracts.InvocationKind
import kotlin.contracts.contract

fun main(args:Array<String>) {

    var score: Int? = 32
//    score = null

    fun checkScore() {
        if(score != null) {
            println("score: $score")
        }
    }

    fun checkScoreLet() {

        score?.let { println("socre: $it") } ?: println("널")
        val str = score?.let { it.toString() }
        println("str: $str")
    }

    fun copy() {

        val result = score?.let { it }
        score = 12
        println("$result")
        println("$score")
        println(score?.equals(result))
        println(score === result)

        // 코틀린은 값은 원시 값에 대해선 성능을 위해 같은 메모리 값을 가르킨다
        // 근데 만약 하나라도 변수값이 바뀌었으면 메모리 값이 분리된다
        // 그럼하여 원시 값은 복사라는 개념이 없다
    }

    copy()
    checkScore()
    checkScoreLet()

//    public inline fun <T, R> T.let(block: (T) -> R): R {
//        contract {
//            callsInPlace(block, InvocationKind.EXACTLY_ONCE)
//        }
//        return block(this)
//    }
}