package AbstractFactoryPattern.Java.Concrete.Mac;

import AbstractFactoryPattern.Java.Abstract.Button;
import AbstractFactoryPattern.Java.Abstract.EditText;
import AbstractFactoryPattern.Java.Abstract.GuiFactory;

public class MacGuiFactory implements GuiFactory {

    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public EditText createEditText() {
        return new MacEditText();
    }
}
