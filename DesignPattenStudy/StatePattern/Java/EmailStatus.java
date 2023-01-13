package StatePattern.Java;

interface EmailStatus {

    public String getName();
    public String forward(Email email);
    public String backward(Email email);
}
