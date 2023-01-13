package CommandPattern.Java;

public class Rider {

    private DeliveryCommand deliveryCommand;

    public Rider(DeliveryCommand deliveryCommand) {

        this.deliveryCommand = deliveryCommand;
    }

    public Rider changeDeliveryCommand(DeliveryCommand deliveryCommand) {

        this.deliveryCommand = deliveryCommand;
        return this;
    }

    public String delivery() {

        return deliveryCommand.deliveryVehicle();
    }
}
