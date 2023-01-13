package Compositpattern.Java;

import java.util.ArrayList;
import java.util.List;

public class AllTimeRider implements Rider {

    public List<Rider> riders = new ArrayList<>();

    public AllTimeRider(List<Rider> riders) {

        this.riders = riders;
    }

    @Override
    public String delivery(String vehicle) {

        String result = "";

        for (Rider rider:riders) {

            result += rider.delivery(vehicle) + ", ";
        }
        return result;
    }
}
