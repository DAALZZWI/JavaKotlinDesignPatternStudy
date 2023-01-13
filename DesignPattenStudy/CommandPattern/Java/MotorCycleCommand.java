package CommandPattern.Java;

public class MotorCycleCommand implements DeliveryCommand{

    private MotorCycle motorCycle;

    public MotorCycleCommand(MotorCycle motorCycle) {

        this.motorCycle = motorCycle;
    }

    @Override
    public String deliveryVehicle() {

        return motorCycle.start() + " , " + motorCycle.accelerate();
    }
}
