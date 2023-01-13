package StatePattern.Java;

public class Email {

    private EmailStatus emailStatus = Wait.getInstance();

    public EmailStatus getEmailStatus() {

        return emailStatus;
    }

    public void setEmailStatus(EmailStatus emailStatus) {

        this.emailStatus = emailStatus;
    }

    public String forward() {

        return emailStatus.forward(this);
    }

    public String backward() {

        return emailStatus.backward(this);
    }
}
