package FlyweightPattern.Java;

public class PartTimeRider implements Rider {

    private String center;

    PartTimeRider(String center) {

        this.center = center;
    }

    @Override
    public String delivery() {

        return center + " 자전거 배달";
    }
}
