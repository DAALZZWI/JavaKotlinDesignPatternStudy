package BuilderPattern.Kotlin.ExampleHttpResponse

import java.time.LocalDateTime

data class HttpResponse(
    val status: Int = 0,
    val timeStamp: LocalDateTime = LocalDateTime.now(),
    val error: String = "",
    val code: Int = 0,
    val message: String = ""
)