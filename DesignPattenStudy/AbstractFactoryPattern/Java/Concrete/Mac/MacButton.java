package AbstractFactoryPattern.Java.Concrete.Mac;

import AbstractFactoryPattern.Java.Abstract.Button;

public class MacButton implements Button {

    @Override
    public void click() {

        System.out.println("MacButton");
    }
}
