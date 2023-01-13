package FactoryMethodPattern.Java.Concrete;

import FactoryMethodPattern.Java.Framework.Item;

public class HpPotion implements Item {

    @Override
    public void use() {

        System.out.println("체력 회복");
    }
}
