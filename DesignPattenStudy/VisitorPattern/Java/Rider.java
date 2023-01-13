package VisitorPattern.Java;

public interface Rider {

    public String doTask(DeliveryTask deliveryTask);
    public String doTask(DriveVehicleTask driveVehicleTask);
    public String doTask(RepairTask repairTask);
}

class FullTimeRider implements Rider {

    @Override
    public String doTask(DeliveryTask deliveryTask) {
        return "오토바이 배달";
    }

    @Override
    public String doTask(DriveVehicleTask driveVehicleTask) {
        return "오토바이 운전";
    }

    @Override
    public String doTask(RepairTask repairTask) {
        return "오토바이 수리";
    }
}

class PartTimeRider implements Rider {

    @Override
    public String doTask(DeliveryTask deliveryTask) {
        return "자전거 배달";
    }

    @Override
    public String doTask(DriveVehicleTask driveVehicleTask) {
        return "자전거 운전";
    }

    @Override
    public String doTask(RepairTask repairTask) {
        return "자전거 수리";
    }
}
