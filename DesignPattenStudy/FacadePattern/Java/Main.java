package FacadePattern.Java;

public class Main {

    public static void main(String[] args) {

        RiderService service = new RiderService();
        System.out.println(service.uploadRiderFaceImage(new Image("길동","서울특별시/마포구")));
    }
}
