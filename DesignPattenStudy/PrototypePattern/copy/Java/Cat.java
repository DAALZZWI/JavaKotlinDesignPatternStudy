package PrototypePattern.copy.Java;

public class Cat implements Cloneable {

    private String name;
    private Age age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Age getAge() {
        return age;
    }

    public void setAge(Age age) {
        this.age = age;
    }

    public Cat copy() throws CloneNotSupportedException {

        Cat ref = (Cat) this.clone();
        ref.setAge(new Age(this.getAge().year, this.getAge().value));
        return ref;
    }
}
