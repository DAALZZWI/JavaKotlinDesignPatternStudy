package TemplateMethodPattern.Java.dp;

public abstract class AbstGameConnectHelper {

    protected abstract String doSecurity(String string);
    protected abstract Boolean doAuthentication(String id, String pwd);
    protected abstract int doAuthorization(String UserName);
    protected abstract String doConnection(String info);

    // 템플릿 메서드
    public String requestConnection(String encodedInfo) {

        // 보안 작업
        String decodeInfo = doSecurity(encodedInfo);

        // 반환된 것을 가지고 아이디, 암호를 할당한다.
        String id = "aaa";
        String pwd = "bbb";


        if(!doAuthentication(id,pwd)) {
            throw new Error("아이디 암호 불 일치");
        }

        String userName = "userName";
        int i = doAuthorization(userName);

        switch (i) {
            case 0: System.out.println("게임 매니저"); break;
            case 1: System.out.println("유료 회원"); break;
            case 2: System.out.println("무료 회원"); break;
            case 3: System.out.println("신입 회원"); break;
        }


        return doConnection(decodeInfo);
    }

}
