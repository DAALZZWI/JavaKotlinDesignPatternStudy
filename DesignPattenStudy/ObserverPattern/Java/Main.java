package ObserverPattern.Java;

public class Main {

    public static void main(String[] args) {

        Publisher list = new DeliveryPublisher();
        DeliverySubscriber user1 = new DeliverySubscriber();
        DeliverySubscriber user2 = new DeliverySubscriber();

        list.add(user1);
        list.add(user2);

        list.update("WAIT");
        list.update("COMPLETE");

        System.out.println(user1.getSent());
        System.out.println(user2.getSent());
    }
}
