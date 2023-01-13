package FacadePattern.Kotlin

class S3UploadService {

    private val s3 = Image()

    fun upload(image: Image): Boolean {
        s3.name = image.name
        s3.location = image.location

        return s3.upload()
    }
}