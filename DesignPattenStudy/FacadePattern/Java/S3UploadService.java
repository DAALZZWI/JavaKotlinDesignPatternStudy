package FacadePattern.Java;

public class S3UploadService {

    private Image s3;

    S3UploadService() {
        s3 = new Image();
    }

    public Boolean upload(Image image) {

        s3.setName(image.getName());
        s3.setName(image.getLoacation());

        return s3.upload();
    }
}
