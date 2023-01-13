package ChainResponsibilityPattern.Java;

class Main {
    public static void main(String[] args) {

        RiderService riderService = new RiderService(new FullTimeRider(new PartTimeRider(new ConnectTimeRider())));
        System.out.println(riderService.delivery("한식"));
    }
}

class RiderService {

    private Rider rider;

    RiderService(Rider rider) {

        this.rider = rider;
    }

    public String delivery(String foodType) {

        return rider.delivery(foodType);
    }
}