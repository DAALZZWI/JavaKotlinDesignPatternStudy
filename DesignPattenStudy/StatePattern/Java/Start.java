package StatePattern.Java;

public class Start implements EmailStatus {

    public static String name;
    public static Start instance;

    public static Start getInstance() {

        if(instance == null) {

            instance = new Start();
            name = "송신 시작";
        }
        return instance;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String forward(Email email) {

        email.setEmailStatus(Complete.getInstance());
        return email.getEmailStatus().getName();
    }

    @Override
    public String backward(Email email) {

        email.setEmailStatus(Wait.getInstance());
        return email.getEmailStatus().getName();
    }
}
