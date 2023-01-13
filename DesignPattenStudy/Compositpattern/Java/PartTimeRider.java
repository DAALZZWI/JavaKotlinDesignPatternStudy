package Compositpattern.Java;

public class PartTimeRider implements Rider {

    @Override
    public String delivery(String vehicle) {
        return "시간제" + vehicle + "배달";
    }
}
