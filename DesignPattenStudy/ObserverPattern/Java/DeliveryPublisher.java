package ObserverPattern.Java;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class DeliveryPublisher implements Publisher {

    private ArrayList<Subscriber> observerList = new ArrayList<Subscriber>();
    private String deliveryStatus = "WAIT";

    @Override
    public Boolean update(String deliveryStatus) {

        this.deliveryStatus = deliveryStatus;
        for (Subscriber s : observerList) {
            s.onUpdate(deliveryStatus);
        }
        return true;
    }

    @Override
    public Boolean add(Subscriber subscriber) {

        observerList.add(subscriber);
        return true;
    }

    @Override
    public Boolean delete(Subscriber subscriber) {

        observerList.remove(subscriber);
        return true;
    }
}

