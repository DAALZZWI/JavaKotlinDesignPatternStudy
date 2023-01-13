package CommandPattern.Java;

public class BikeCommand implements DeliveryCommand{

    private Bike bike;

    public BikeCommand(Bike bike) {

        this.bike = bike;
    }

    @Override
    public String deliveryVehicle() {

        return bike.pedaling();
    }
}
