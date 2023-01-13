package AbstractFactoryPattern.Java.Concrete.Windows;

import AbstractFactoryPattern.Java.Abstract.Button;
import AbstractFactoryPattern.Java.Abstract.EditText;
import AbstractFactoryPattern.Java.Abstract.GuiFactory;

public class WindowsGuiFactory implements GuiFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public EditText createEditText() {
        return new WindowsEditText();
    }
}
