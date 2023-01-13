package FacadePattern.Kotlin

fun main() {

    val service = RiderService()
    println(service.uploadRiderFaceImage(Image(name = "길동", location = "서울특별시/마포구")))
}

class RiderService {

    private val s3UploadService = S3UploadService()
    fun uploadRiderFaceImage(image: Image) = s3UploadService.upload(image)
}