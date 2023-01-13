package ObserverPattern.Java;

public class DeliverySubscriber implements Subscriber {

    private Boolean isSent = false;

    @Override
    public Boolean onUpdate(String deliveryStatus) {

        if (deliveryStatus == "COMPLETE") {

            sendEmail();
        }
        return true;
    }

    private void sendEmail() {

        isSent = true;
    }

    public Boolean getSent() {
        return isSent;
    }
}
