package AbstractFactoryPattern.Java.Concrete.Mac;

import AbstractFactoryPattern.Java.Abstract.EditText;

public class MacEditText implements EditText {

    @Override
    public void printString() {

        System.out.println("MacEditText");
    }
}
