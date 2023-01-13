package ProxyPattern.Java;

public class Main {

    public static void main(String[] args) {

        DeliveryService deliveryService = new DeliveryService(new ProxyRider("hello"));
        System.out.println(deliveryService.delivery());
        System.out.println(deliveryService.getPersonalInfo());
    }
}
