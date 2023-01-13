package Compositpattern.Java;

public class FullTimeRider implements Rider {

    @Override
    public String delivery(String vehicle) {
        return "정규직" + vehicle + "배달";
    }
}
