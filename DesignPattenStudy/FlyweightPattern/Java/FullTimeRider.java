package FlyweightPattern.Java;

public class FullTimeRider implements Rider {

    private String center;

    FullTimeRider(String center) {

        this.center = center;
    }

    @Override
    public String delivery() {

        return center + " 오토바이 배달";
    }
}
