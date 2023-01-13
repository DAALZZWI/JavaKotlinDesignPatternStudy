package FlyweightPattern.Java;

public class Main {

    public static void main(String[] args) {

        RiderService riderService = new RiderService();
        System.out.println(riderService.delivery("강남", "FullTimeRider"));
        System.out.println(riderService.delivery("강남", "FullTimeRider"));
        System.out.println(riderService.delivery("강북", "PartTimeRider"));
        System.out.println(riderService.delivery("강북", "PartTimeRider"));
    }
}
