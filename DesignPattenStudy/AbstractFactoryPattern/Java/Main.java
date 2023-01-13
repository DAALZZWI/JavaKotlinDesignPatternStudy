package AbstractFactoryPattern.Java;

import AbstractFactoryPattern.Java.Abstract.Button;
import AbstractFactoryPattern.Java.Abstract.EditText;
import AbstractFactoryPattern.Java.Abstract.GuiFactory;
import AbstractFactoryPattern.Java.Concrete.FactoryInstance;

public class Main {

    public static void main(String[] args) {

        GuiFactory fi = new FactoryInstance().getGuiFactoryInstance();

        Button button = fi.createButton();
        EditText editText = fi.createEditText();

        button.click();
        editText.printString();
    }
}
