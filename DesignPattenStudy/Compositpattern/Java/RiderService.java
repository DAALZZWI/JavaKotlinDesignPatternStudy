package Compositpattern.Java;

public class RiderService {

    private AllTimeRider allTimeRider = null;

    public RiderService(AllTimeRider allTimeRider) {

        this.allTimeRider = allTimeRider;
    }

    public String deliveryAllRiders(String vehicle) {

        return allTimeRider.delivery(vehicle);
    }
}
