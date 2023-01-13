package BuilderPattern.Kotlin.ExampleHttpResponse

import java.time.LocalDateTime

fun main(args: Array<String>) {

    val httpResponse: HttpResponse = HttpResponse(
        status = 20000,
        timeStamp = LocalDateTime.MAX,
        code = 200
    )

    println(httpResponse.toString())
}