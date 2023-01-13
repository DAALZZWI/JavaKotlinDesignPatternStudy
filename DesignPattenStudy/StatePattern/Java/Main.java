package StatePattern.Java;

public class Main {

    public static void main(String[] args) {

        Email email = new Email();
        System.out.println(email.getEmailStatus().getName());
        System.out.println(email.forward());
        System.out.println(email.forward());
        System.out.println(email.backward());
    }
}
