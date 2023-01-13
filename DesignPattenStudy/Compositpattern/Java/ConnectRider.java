package Compositpattern.Java;

public class ConnectRider implements Rider {

    @Override
    public String delivery(String vehicle) {
        return "외주" + vehicle + "배달";
    }
}
