package PrototypePattern.copy.Java;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {

        Cat navi = new Cat();
        Cat yaong = new Cat();

        navi.setName("navi");
        navi.setAge(new Age(1995, 28));

        yaong = navi.copy();

        yaong.setName("yaong");
        yaong.setAge(new Age(1996, 27));

        System.out.println(navi.getName() + " " + navi.getAge().year + " " + navi.getAge().value);
        System.out.println(yaong.getName() + " " + yaong.getAge().year + " " + yaong.getAge().value);
    }
}
