package TemplateMethodPattern.Java.dp;

public class DefaultGameConnectHelper extends AbstGameConnectHelper{

    @Override
    protected String doSecurity(String string) {
        System.out.println("디코드");
        return string;
    }

    @Override
    protected Boolean doAuthentication(String id, String pwd) {
        System.out.println("아이디 / 암호 확인 과정");
        return true;
    }

    @Override
    protected int doAuthorization(String UserName) {
        System.out.println("권한 확인");
        return 0;
    }

    @Override
    protected String doConnection(String info) {
        System.out.println("마지막 접속 단계");
        return info;
    }
}
