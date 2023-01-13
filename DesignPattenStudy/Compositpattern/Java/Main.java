package Compositpattern.Java;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        RiderService riderService = new RiderService(new AllTimeRider(List.of(new FullTimeRider(), new PartTimeRider())));
        System.out.println(riderService.deliveryAllRiders("자전거"));
    }
}
