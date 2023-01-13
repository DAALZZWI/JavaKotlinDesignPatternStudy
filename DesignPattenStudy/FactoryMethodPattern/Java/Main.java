package FactoryMethodPattern.Java;

import FactoryMethodPattern.Java.Concrete.HpCreator;
import FactoryMethodPattern.Java.Concrete.MpCreator;
import FactoryMethodPattern.Java.Framework.Item;
import FactoryMethodPattern.Java.Framework.ItemCreator;

public class Main {

    public static void main(String[] args) {

        ItemCreator creator;
        Item item;

        creator = new HpCreator();
        item = creator.create();

        item.use();

        creator = new MpCreator();
        item = creator.create();

        item.use();
    }
}
