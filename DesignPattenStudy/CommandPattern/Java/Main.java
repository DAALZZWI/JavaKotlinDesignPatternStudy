package CommandPattern.Java;

public class Main {

    public static void main(String[] args) {

        MotorCycleCommand motorCycleCommand = new MotorCycleCommand(new MotorCycle());
        BikeCommand bikeCommand = new BikeCommand(new Bike());
        Rider rider = new Rider(motorCycleCommand);

        System.out.println(rider.delivery());
        rider.changeDeliveryCommand(bikeCommand);
        System.out.println(rider.delivery());
    }
}
