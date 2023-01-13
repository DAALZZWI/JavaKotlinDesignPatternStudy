package VisitorPattern.Java;

public class Main {

    public static void main(String[] args) {

        TotalRiderTask totalRiderTask = new TotalRiderTask();
        FullTimeRider fullTimeRider = new FullTimeRider();
        PartTimeRider partTimeRider = new PartTimeRider();

        System.out.println(totalRiderTask.doTask(fullTimeRider));
        System.out.println(totalRiderTask.doTask(partTimeRider));
    }
}
