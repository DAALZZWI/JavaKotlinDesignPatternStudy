package AbstractFactoryPattern.Java.Concrete.Windows;

import AbstractFactoryPattern.Java.Abstract.EditText;

public class WindowsEditText implements EditText {

    @Override
    public void printString() {

        System.out.println("WindowsEditText");
    }
}
