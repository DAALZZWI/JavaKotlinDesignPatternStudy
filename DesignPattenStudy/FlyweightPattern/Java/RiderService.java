package FlyweightPattern.Java;

public class RiderService {

    RiderFactory riderFactory = new RiderFactory();

    public String delivery(String center, String type) {

        return riderFactory.getRider(center, type);
    }
}
