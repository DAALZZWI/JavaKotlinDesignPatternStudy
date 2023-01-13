package VisitorPattern.Java;

import java.util.ArrayList;
import java.util.List;

public interface Task {

    public String doTask(Rider rider);
}

class DeliveryTask implements Task {

    @Override
    public String doTask(Rider rider) {
        return rider.doTask(this);
    }
}

class DriveVehicleTask implements Task {

    @Override
    public String doTask(Rider rider) {
        return rider.doTask(this);
    }
}

class RepairTask implements Task {

    @Override
    public String doTask(Rider rider) {
        return rider.doTask(this);
    }
}


class TotalRiderTask implements Task {

    ArrayList<Task> list = new ArrayList();

    TotalRiderTask() {
        list.add(new DeliveryTask());
        list.add(new DriveVehicleTask());
        list.add(new RepairTask());
    }

    @Override
    public String doTask(Rider rider) {

        String li = "";

        for (Task ri : list) {
            li += ri.doTask(rider) + ", ";

        }
        return li;
    }
}