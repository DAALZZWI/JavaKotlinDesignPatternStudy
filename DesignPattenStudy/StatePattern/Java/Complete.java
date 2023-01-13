package StatePattern.Java;

public class Complete implements EmailStatus {

    public static String name;
    public static Complete instance;

    public static Complete getInstance() {

        if (instance == null) {
            instance = new Complete();
            name = "송신 완료";
        }
        return instance;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String forward(Email email) {

        return "진행 불가";
    }

    @Override
    public String backward(Email email) {

        email.setEmailStatus(Start.getInstance());
        return email.getEmailStatus().getName();
    }
}
