package FactoryMethodPattern.Java.Concrete;

import FactoryMethodPattern.Java.Framework.Item;

public class MpPotion implements Item {

    @Override
    public void use() {

        System.out.println("마력 회복");
    }
}
