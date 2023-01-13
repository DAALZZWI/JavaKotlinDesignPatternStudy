package ChainResponsibilityPattern.Java;

interface Rider {
    public String delivery(String foodType);
}

class FullTimeRider implements Rider {

    Rider rider;

    FullTimeRider() {}

    FullTimeRider(Rider rider) {

        this.rider = rider;
    }

    @Override
    public String delivery(String foodType) {
        return (foodType == "한식") ? "한식배달" : rider.delivery(foodType);
    }
}

class PartTimeRider implements Rider {

    Rider rider;

    PartTimeRider() {}

    PartTimeRider(Rider rider) {

        this.rider = rider;
    }

    @Override
    public String delivery(String foodType) {
        return (foodType == "양식") ? "양식배달" : rider.delivery(foodType);
    }
}

class ConnectTimeRider implements Rider {

    Rider rider;

    ConnectTimeRider() {}

    ConnectTimeRider(Rider rider) {

        this.rider = rider;
    }

    @Override
    public String delivery(String foodType) {
        return (foodType == "분식") ? "분식배달" : rider.delivery(foodType);
    }
}

