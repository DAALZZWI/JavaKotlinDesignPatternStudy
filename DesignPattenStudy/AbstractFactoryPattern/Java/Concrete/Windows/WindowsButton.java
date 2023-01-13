package AbstractFactoryPattern.Java.Concrete.Windows;

import AbstractFactoryPattern.Java.Abstract.Button;

public class WindowsButton implements Button {

    @Override
    public void click() {

        System.out.println("WindowsButton");
    }
}
