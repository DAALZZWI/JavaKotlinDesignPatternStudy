package ProxyPattern.Java;

public class DeliveryService {

    private Rider rider = null;

    public DeliveryService(Rider rider) {

        this.rider = rider;
    }

    public String delivery() {

        return rider.delivery();
    }

    public String getPersonalInfo() {

        return rider.getPersonalInfo(1);
    }
}
