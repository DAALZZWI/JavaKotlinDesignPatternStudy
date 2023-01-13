package ObserverPattern.Java;

interface Publisher {
    public Boolean update(String deliveryStatus);
    public Boolean add(Subscriber subscriber);
    public Boolean delete(Subscriber subscriber);
}

interface Subscriber {
    public Boolean onUpdate(String deliveryStatus);
}
