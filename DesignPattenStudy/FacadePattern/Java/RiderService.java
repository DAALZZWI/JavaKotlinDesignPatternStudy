package FacadePattern.Java;

public class RiderService {

    S3UploadService s3UploadService;

    RiderService() {

        s3UploadService = new S3UploadService();
    }

    public Boolean uploadRiderFaceImage(Image image) {

        return s3UploadService.upload(image);
    }
}
