package StatePattern.Java;

public class Wait implements EmailStatus {

    public static String name;
    public static Wait instance;

    public static Wait getInstance() {

        if (instance == null) {

            instance = new Wait();
            name = "송신 대기";
        }
        return instance;
    }


    @Override
    public String getName() {

        return name;
    }

    @Override
    public String forward(Email email) {

        email.setEmailStatus(Start.getInstance());
        return email.getEmailStatus().getName();
    }

    @Override
    public String backward(Email email) {

        return "진행 불가";
    }
}
